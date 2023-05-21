package Responsitoriesimpl;

import DomainModels.QuanLy;
import Responsitories.QuanLyResponsitory;
import Utilities.JDBC_helper;
import View_Model.QuanLyViewModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuanLy_responsitory_impl implements QuanLyResponsitory {

    @Override
    public List<QuanLyViewModel> getALL() {
        //tìm dữ liệu id mã tên trên SQL
        String sql = "SELECT [ID]\n"
                + "      ,[EmailQL]\n"
                + "      ,[TenQL]\n"
                + "      ,[Ngay]\n"
                + "      ,[Thang]\n"
                + "      ,[Nam]\n"
                + "      ,[MK]\n"
                + "      ,[TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "FROM [thanSoHoc].[dbo].[QuanLy]\n"
                + "INNER JOIN TaiKhoan\n"
                + "ON QuanLy.FTK = TaiKhoan.TK";
        ArrayList<QuanLyViewModel> quanLyList = new ArrayList<>();
        ResultSet rs = JDBC_helper.selectGenerality(sql); // duyệt và lưu trữ các kết quả từ một câu lệnh SQL SELECT
        try {
            //đi từng dòng cho đến khi hết dữ liệu
            while (rs.next()) {
                //tạo một đối tượng rỗng để lưu tạm dữ liệu
                QuanLyViewModel quanLy = new QuanLyViewModel();
                //lấy dữ liệu cùng tên tương ứng
                int id = rs.getInt("ID");
                String maQL = rs.getString("EmailQL");
                String tenQL = rs.getString("TenQL");
                int ngay = rs.getInt("Ngay");
                int thang = rs.getInt("Thang");
                int nam = rs.getInt("Nam");
                String tk = rs.getString("TK");
                String mk = rs.getString("MK");
                
                //lưu dữ liệu và
                quanLy.setID(id);
                quanLy.setEmailQL(maQL);
                quanLy.setTenQL(tenQL);
                quanLy.setNgay(ngay);
                quanLy.setThang(thang);
                quanLy.setNam(nam);
                quanLy.setTK(tk);
                quanLy.setMK(mk);

                //thêm dữ liệu vào danh sách
                quanLyList.add(quanLy);
            }
            //trả danh sách
            return quanLyList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int creat(QuanLy quanLy) {
        String sql = "INSERT INTO [dbo].[QuanLy]\n"
                + "           ([EmailQL]\n"
                + "           ,[TenQL]\n"
                + "           ,[Ngay]\n"
                + "           ,[Thang]\n"
                + "           ,[Nam]\n"
                + "           ,[FTK])\n"

                + "     VALUES(?, ?, ?, ?, ?, ?)";
        return JDBC_helper.updateTongQuat(sql, quanLy.getEmailQL(), quanLy.getTenQL(), quanLy.getNgay(),
                quanLy.getThang(), quanLy.getNam(), quanLy.getFTK());
    }

    @Override
    public int update(QuanLy quanLy, String EmailQL) {
        String sql = "UPDATE [dbo].[QuanLy]\n"
                + "   SET [EmailQL] = ?\n"
                + "      ,[TenQL] = ?\n"
                + "      ,[Ngay] = ?\n"
                + "      ,[Thang] = ?\n"
                + "      ,[Nam] = ?\n"
                + "      ,[FTK] = ?\n"

                + " WHERE EmailQL = ?";
        return JDBC_helper.updateTongQuat(sql, quanLy.getEmailQL(), quanLy.getTenQL(), quanLy.getNgay(), quanLy.getThang(),
                quanLy.getNam(), quanLy.getFTK(),  quanLy.getEmailQL());
    }

    @Override
    public int delete(String EmailQL) {
        String sql = "DELETE FROM [dbo].[QuanLy]\n"
                + "      WHERE EmailQL = ?";
        return JDBC_helper.updateTongQuat(sql, EmailQL);
    }

    @Override
    public QuanLy getOne(String FTK) {
                String query = "SELECT TOP (1000) [ID]\n" +
"      ,[EmailQL]\n" +
"      ,[TenQL]\n" +
"      ,[Ngay]\n" +
"      ,[Thang]\n" +
"      ,[Nam]\n" +
"      ,[FTK]\n" +
"  FROM [thanSoHoc].[dbo].[QuanLy] WHERE FTK = ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, FTK);
        try {
            while (rs.next()) { 
               
                QuanLy quanLy = new QuanLy();
                quanLy.setID(rs.getInt("ID"));
                quanLy.setEmailQL(rs.getString("EmailQL"));
                quanLy.setTenQL(rs.getString("TenQL"));
                quanLy.setNgay(rs.getInt("Ngay"));
                quanLy.setThang(rs.getInt("Thang"));
                quanLy.setNam(rs.getInt("Nam"));               
                quanLy.setFTK(rs.getString("FTK"));
                             
                return quanLy;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;    
    }

    @Override
    public List<QuanLyViewModel> select(String TenQL) {
        ArrayList<QuanLyViewModel> listQuanLy = new ArrayList<>();
        String query = "SELECT [ID]\n"
                + "      ,[EmailQL]\n"
                + "      ,[TenQL]\n"
                + "      ,[Ngay]\n"
                + "      ,[Thang]\n"
                + "      ,[Nam]\n"
                + "      ,[MK]\n"
                + "      ,[TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "FROM [thanSoHoc].[dbo].[QuanLy]\n"
                + "INNER JOIN TaiKhoan\n"
                + "ON QuanLy.FTK = TaiKhoan.TK WHERE TenQL LIKE ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, "%" + TenQL + "%");
        try {
            while (rs.next()) {
                QuanLyViewModel quanLi = new QuanLyViewModel();
                quanLi.setID(rs.getInt("ID"));
                quanLi.setEmailQL(rs.getString("EmailQL"));
                quanLi.setTenQL(rs.getString("TenQL"));
                quanLi.setNgay(rs.getInt("Ngay"));
                quanLi.setThang(rs.getInt("Thang"));
                quanLi.setNam(rs.getInt("Nam"));
                quanLi.setTK(rs.getString("TK"));
                quanLi.setMK(rs.getString("MK"));
                listQuanLy.add(quanLi);
            }
            return listQuanLy;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
