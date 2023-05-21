package Responsitoriesimpl;

import DomainModels.ThongTinTraCuu;
import Responsitories.TTResponsitory;
import Utilities.JDBC_helper;
import View_Model.TTViewModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TT_responsitory_impl implements TTResponsitory{

    @Override
    public List<TTViewModel> getALL() {
        String sql = "SELECT \n"
                + "                 EmailUser,\n"
                + "                 \"Name\", \n"
                + "                 FTK ,\n"
                + "                 SoChuDao.soCD , \n"
                + "                 CK.soCK , \n"
                + "                 NgayTraCuu\n"
                + "                 \n"
                + "                 FROM ThongTinHienThi\n"
                + "                 JOIN CK ON ThongTinHienThi.IDCK = CK.SoCK\n"
                + "                 JOIN SoChuDao ON ThongTinHienThi.IDSCD = SoChuDao.soCD\n"
                + "                 JOIN ThongTinNhap ON ThongTinHienThi.IDThongTinNhap = ThongTinNhap.ID";
        ArrayList<TTViewModel> thongTinList = new ArrayList<>();
        ResultSet rs = JDBC_helper.selectGenerality(sql); // duyệt và lưu trữ các kết quả từ một câu lệnh SQL SELECT
        try {
            //đi từng dòng cho đến khi hết dữ liệu
            while (rs.next()) {
                TTViewModel thongTin = new TTViewModel();
          
                String Email = rs.getString("EmailUser");
                String ten = rs.getString("Name");
                String scd = rs.getString("soCD");
                String sck = rs.getString("soCK");
                String tk = rs.getString("FTK");
                Date date = rs.getDate("NgayTraCuu");
                
                //lưu dữ liệu và
                thongTin.setEmailUser(Email);
                thongTin.setName(ten);
                thongTin.setFTK(tk);
                thongTin.setSoCD(scd);
                thongTin.setSoCK(sck);
                thongTin.setNgayTraCuu(date);

                //thêm dữ liệu vào danh sách
                thongTinList.add(thongTin);
            }
            //trả danh sách
            return thongTinList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TTViewModel> select(String Email, String Name) {
        ArrayList<TTViewModel> listTK = new ArrayList<>();
        String query = "SELECT \n"
                + "                 EmailUser,\n"
                + "                 \"Name\", \n"
                + "                 FTK ,\n"
                + "                 SoChuDao.soCD , \n"
                + "                 CK.soCK , \n"
                + "                 NgayTraCuu\n"
                + "                 \n"
                + "                 FROM ThongTinHienThi\n"
                + "                 JOIN CK ON ThongTinHienThi.IDCK = CK.SoCK\n"    
                + "                 JOIN SoChuDao ON ThongTinHienThi.IDSCD = SoChuDao.ID\n"
                + "                 JOIN ThongTinNhap ON ThongTinHienThi.IDThongTinNhap = ThongTinNhap.ID  WHERE EmailUser LIKE ? OR NAME LIKE ?  ";
        ResultSet rs = JDBC_helper.selectGenerality(query, "%" + Email + "%", "%" + Name + "%");
        try {
            while (rs.next()) {
                TTViewModel thongTin = new TTViewModel();
                String email = rs.getString("EmailUser");
                String ten = rs.getString("Name");
                String scd = rs.getString("soCD");
                String sck = rs.getString("soCK");
                String tk = rs.getString("FTK");
                Date date = rs.getDate("NgayTraCuu");
                
                //lưu dữ liệu và
                thongTin.setEmailUser(email);
                thongTin.setName(ten);
                thongTin.setFTK(tk);
                thongTin.setSoCD(scd);
                thongTin.setSoCK(sck);
                thongTin.setNgayTraCuu(date);

                listTK.add(thongTin);
            }
            return listTK;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }     

    @Override
    public int creat(ThongTinTraCuu tt) {
        String sql = "INSERT INTO [dbo].[ThongTinHienThi]\n"
                + "           ([ID]\n"
                + "           ,[IDSCD]\n"
                + "           ,[IDCK]\n"
                + "           ,[IDThongTinNhap]\n"
                + "           ,[NgayTraCuu]\n"
                + "           ,[IDCSN]\n"
                + "           ,[IDCST])\n"
                + "     VALUES(?,?,?,?,?,?,?)";
        return JDBC_helper.updateTongQuat(sql, tt.getID(), tt.getIDSCD(), tt.getIDCK(), tt.getIDThongTinNhap(), tt.getNgayTraCuu()
        , tt.getIDSCN(), tt.getIDSCT());
    }
}
