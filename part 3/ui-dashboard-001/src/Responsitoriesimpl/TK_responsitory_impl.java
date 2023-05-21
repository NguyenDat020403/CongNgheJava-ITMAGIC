package Responsitoriesimpl;

import DomainModels.TaiKhoan;
import Responsitories.TKResponsitory;
import Utilities.JDBC_helper;
import View_Model.QuanLyViewModel;
import View_Model.TKViewModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TK_responsitory_impl implements TKResponsitory {

    @Override
    public List<TKViewModel> getALL() {
        //tìm dữ liệu id mã tên trên SQL
        String sql = "SELECT TOP (1000) [TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "      ,[Email]\n"
                + "      ,[Ten]\n"
                + "      ,[Ngay]\n"
                + "      ,[Thang]\n"
                + "      ,[Nam]\n"
                + "      ,[SLTraCuu]\n"
                + "  FROM [thanSoHoc].[dbo].[TaiKhoan]";
        ArrayList<TKViewModel> tkList = new ArrayList<>();
        ResultSet rs = JDBC_helper.selectGenerality(sql); // duyệt và lưu trữ các kết quả từ một câu lệnh SQL SELECT
        try {
            while (rs.next()) {
                
                TKViewModel tk = new TKViewModel();

                String taikhoan = rs.getString("TK");
                String mk = rs.getString("MK");
                String cv = rs.getString("ChucVu");
                String email = rs.getString("Email");
                String ten = rs.getString("Ten");
                int ngay = rs.getInt("Ngay");
                int thang = rs.getInt("Thang");
                int nam = rs.getInt("Nam");
                int sl = rs.getInt("SLTraCuu");                
                //lưu dữ liệu và

                tk.setTK(taikhoan);
                tk.setMK(mk);
                tk.setChucVu(cv);
                tk.setEmail(email);
                tk.setTen(ten);
                tk.setNgay(ngay);
                tk.setThang(thang);
                tk.setNam(nam);
                tk.setSLTraCuu(sl);
                //thêm dữ liệu vào danh sách
                tkList.add(tk);
            }
            //trả danh sách
            return tkList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int creat(TaiKhoan tk) {
        String sql = "INSERT INTO [dbo].[TaiKhoan]\n"
                + "           ([TK]\n"
                + "           ,[MK]\n"
                + "           ,[ChucVu]\n"
                + "           ,[Email]\n"
                + "           ,[Ten]\n"
                + "           ,[Ngay]\n"
                + "           ,[Thang]\n"
                + "           ,[Nam]\n"
                + "           ,[SLTraCuu])"
                + "     VALUES(?,?,?,?,?,?,?,?,?)";
        return JDBC_helper.updateTongQuat(sql, tk.getTK(), tk.getMK(), tk.getChucVu(), tk.getEmail(), tk.getTen(),
                tk.getNgay(), tk.getThang(), tk.getNam(), tk.getSLTraCuu());
    }

    @Override
    public int update(TaiKhoan tk, String TK) {
        String sql = "UPDATE [dbo].[TaiKhoan]\n"
                + "   SET [TK] = ?\n"
                + "      ,[MK] = ?\n"
                + "      ,[ChucVu] = ?\n"
                + "      ,[Email] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[Ngay] = ?\n"
                + "      ,[Thang] = ?\n"
                + "      ,[Nam] = ?\n"
                + "      ,[SLTraCuu] = ?"
                + " WHERE TK = ?";
        return JDBC_helper.updateTongQuat(sql, tk.getTK(), tk.getMK(), tk.getChucVu(), tk.getEmail(), tk.getTen(),
                tk.getNgay(), tk.getThang(), tk.getNam(), tk.getSLTraCuu(), tk.getTK());
    }

    @Override
    public int delete(String TK) {
        String sql = "DELETE FROM [dbo].[TaiKhoan]\n"
                + "      WHERE TK = ?";
        return JDBC_helper.updateTongQuat(sql, TK);
    }

    @Override
    public TaiKhoan getOne(String TK) {
        String query = "SELECT TOP (1000) [TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "      ,[Email]\n"
                + "      ,[Ten]\n"
                + "      ,[Ngay]\n"
                + "      ,[Thang]\n"
                + "      ,[Nam]\n"
                + "      ,[SLTraCuu]\n"
                + "  FROM [thanSoHoc].[dbo].[TaiKhoan] WHERE TK = ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, TK);
        try {
            while (rs.next()) { 
               
                TaiKhoan tk = new TaiKhoan();
                String taikhoan = rs.getString("TK");
                String mk = rs.getString("MK");
                String cv = rs.getString("ChucVu");
                String email = rs.getString("Email");
                String ten = rs.getString("Ten");
                int ngay = rs.getInt("Ngay");
                int thang = rs.getInt("Thang");
                int nam = rs.getInt("Nam");
                int sl = rs.getInt("SLTraCuu");                
                //lưu dữ liệu và

                tk.setTK(taikhoan);
                tk.setMK(mk);
                tk.setChucVu(cv);
                tk.setEmail(email);
                tk.setTen(ten);
                tk.setNgay(ngay);
                tk.setThang(thang);
                tk.setNam(nam);
                tk.setSLTraCuu(sl);
                return tk;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;   
    }

    @Override
    public List<TKViewModel> select(String TK, String Email, String Name) {
        ArrayList<TKViewModel> listTK = new ArrayList<>();
        String query = "SELECT TOP (1000) [TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "      ,[Email]\n"
                + "      ,[Ten]\n"
                + "      ,[Ngay]\n"
                + "      ,[Thang]\n"
                + "      ,[Nam]\n"
                + "      ,[SLTraCuu]\n"
                + "  FROM [thanSoHoc].[dbo].[TaiKhoan] WHERE TK LIKE ? OR Email LIKE ? OR Ten LIKE ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, "%" + TK + "%", "%" + Email + "%", "%" + Name + "%");
        try {
            while (rs.next()) {
                TKViewModel tk = new TKViewModel();
                tk.setTK(rs.getString("TK"));
                tk.setMK(rs.getString("MK"));
                tk.setChucVu(rs.getString("ChucVu"));                
                tk.setEmail(rs.getString("Email"));
                tk.setTen(rs.getString("Ten"));
                tk.setNgay(rs.getInt("Ngay"));
                tk.setThang(rs.getInt("Thang"));
                tk.setNam(rs.getInt("Nam"));
                tk.setSLTraCuu(rs.getInt("SLTraCuu"));

                listTK.add(tk);
            }
            return listTK;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
