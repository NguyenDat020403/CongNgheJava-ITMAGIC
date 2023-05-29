package Responsitoriesimpl;

import DomainModels.TTNhap;
import Utilities.JDBC_helper;
import View_Model.TTNhapViewModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import Responsitories.TTNhapResponsitory;

public class TTNhap_reponsitory_impl implements TTNhapResponsitory{
    
    @Override
    public List<TTNhapViewModel> getALL() {
        String sql = "SELECT TOP (1000) ID\n" +
"                       ,EmailUser\n" +
"                       ,Name\n" +
"                       ,ThongTinNhap.Ngay\n" +
"                       ,ThongTinNhap.Thang\n" +
"                       ,ThongTinNhap.Nam\n" +
"                       ,Sex\n" +
"                       ,SDT\n" +
"                       ,TK\n" +
"                       ,MK\n" +
"                       ,ChucVu\n" +
"                 FROM thanSoHoc.dbo.ThongTinNhap\n" +
"                 INNER JOIN TaiKhoan\n" +
"                 ON ThongTinNhap.FTK = TaiKhoan.TK";
        ArrayList<TTNhapViewModel> userList = new ArrayList<>();
        ResultSet rs = JDBC_helper.selectGenerality(sql); // duyệt và lưu trữ các kết quả từ một câu lệnh SQL SELECT
        try {
            while (rs.next()) { 
                TTNhapViewModel user = new TTNhapViewModel();
                user.setID(rs.getInt("ID"));
                user.setEmailUser(rs.getString("EmailUser"));
                user.setName(rs.getString("Name"));
                user.setNgay(rs.getInt("Ngay"));
                user.setThang(rs.getInt("Thang"));
                user.setNam(rs.getInt("Nam"));
                user.setSex(rs.getString("Sex"));
                user.setSDT(rs.getInt("SDT"));
                user.setTK(rs.getString("TK"));
                user.setMK(rs.getString("MK"));
                
                userList.add(user);     
            }
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int creat(TTNhap user) {
        String sql = "INSERT INTO [dbo].[ThongTinNhap]\n"
                + "           ([EmailUser]\n"
                + "           ,[Name]\n"
                + "           ,ThongTinNhap.Ngay\n"
                + "           ,ThongTinNhap.Thang\n"
                + "           ,ThongTinNhap.Nam\n"
                + "           ,[Sex]\n"
                + "           ,[SDT]\n"
                + "           ,[FTK])\n"
                + "     VALUES(?,?,?,?,?,?,?,?)\n";
        return JDBC_helper.updateTongQuat(sql,user.getEmailUser(), user.getName(), user.getNgay(), user.getThang(), user.getNam(),
                user.getSex(), user.getSDT(), user.getFTK());
    }

    @Override
    public int update(TTNhap user, String EmailUser) {
        String sql = "UPDATE [dbo].[ThongTinNhap]\n" +
"   SET [EmailUser] = ?\n" +
"      ,[Name] = ?\n" +
"      ,ThongTinNhap.Ngay = ?\n" +
"      ,ThongTinNhap.Thang = ?\n" +
                
                 
"      ,ThongTinNhap.Nam = ?\n" +
"      ,[Sex] = ?\n" +
"      ,[SDT] = ?\n" +
"      ,[FTK] = ?\n" +
" WHERE EmailUser = ?";
    return JDBC_helper.updateTongQuat(sql,user.getEmailUser(), user.getName(), user.getNgay(), user.getThang(), user.getNam(),
                user.getSex(), user.getSDT(), user.getFTK(), user.getEmailUser());
    }

    @Override
    public int delete(String EmailUser) {
        String sql = "DELETE FROM [dbo].[ThongTinNhap]\n"
                + "      WHERE EmailUser = ?";
        return JDBC_helper.updateTongQuat(sql, EmailUser);
    }

    @Override
    public TTNhap getOne(String Email) {
        String query = "SELECT TOP (1000) [ID]\n" +
"      ,[EmailUser]\n" +
"      ,[Name]\n" +
"      ,ThongTinNhap.Ngay\n" +
"      ,ThongTinNhap.Thang\n" +
"      ,ThongTinNhap.Nam\n" +
"      ,[Sex]\n" +
"      ,[SDT]\n" +
"      ,[FTK]\n" +
"  FROM [thanSoHoc].[dbo].[ThongTinNhap] WHERE EmailUser = ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, Email);
        try {
            while (rs.next()) { 
               
                TTNhap user = new TTNhap();
                user.setID(rs.getInt("ID"));
                user.setEmailUser(rs.getString("EmailUser"));
                user.setName(rs.getString("Name"));
                user.setNgay(rs.getInt("Ngay"));
                user.setThang(rs.getInt("Thang"));
                user.setNam(rs.getInt("Nam"));
                user.setSex(rs.getString("Sex"));
                user.setSDT(rs.getInt("SDT"));                
                user.setFTK(rs.getString("FTK"));
                             
                return user;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;    
    }

    @Override
    public List<TTNhapViewModel> select(String Name) {
        ArrayList<TTNhapViewModel> listUser = new ArrayList<>();
        String query = "SELECT TOP (1000) [ID]\n"
                + "      ,[EmailUser]\n"
                + "      ,[Name]\n"
                + "      ,ThongTinNhap.Ngay\n"
                + "      ,ThongTinNhap.Thang\n"
                + "      ,ThongTinNhap.Nam\n"
                + "      ,[Sex]\n"
                + "      ,[SDT]\n"
                + "      ,[TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "FROM [thanSoHoc].[dbo].[ThongTinNhap]\n"
                + "INNER JOIN TaiKhoan\n"
                + "ON ThongTinNhap.FTK = TaiKhoan.TK WHERE Name LIKE ? OR EmailUser LIKE ? ";
        ResultSet rs = JDBC_helper.selectGenerality(query, "%" + Name + "%", "%" + Name + "%");
        try {
            while (rs.next()) {
                TTNhapViewModel user = new TTNhapViewModel();
                user.setID(rs.getInt("ID"));
                user.setEmailUser(rs.getString("EmailUser"));
                user.setName(rs.getString("Name"));
                user.setNgay(rs.getInt("Ngay"));
                user.setThang(rs.getInt("Thang"));
                user.setNam(rs.getInt("Nam"));
                user.setSex(rs.getString("Sex"));
                user.setSDT(rs.getInt("SDT"));
                user.setTK(rs.getString("TK"));
                user.setMK(rs.getString("MK"));
                listUser.add(user);
            }
            return listUser;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TTNhapViewModel> SortName(String Nam1, String Nam2) {
        ArrayList<TTNhapViewModel> listUser = new ArrayList<>();
        String query = "SELECT [ID], [EmailUser], [Name], ThongTinNhap.[Ngay], ThongTinNhap.[Thang], ThongTinNhap.[Nam], [Sex], [SDT], [TK], [MK], [ChucVu]\n" +
"FROM [thanSoHoc].[dbo].[ThongTinNhap] INNER JOIN TaiKhoan ON ThongTinNhap.FTK = TaiKhoan.TK WHERE Nam >= ? AND Nam <= ?;";
        ResultSet rs = JDBC_helper.selectGenerality(query, Nam1, Nam2);
        try {
            while (rs.next()) {
                TTNhapViewModel user = new TTNhapViewModel();
                user.setID(rs.getInt("ID"));
                user.setEmailUser(rs.getString("EmailUser"));
                user.setName(rs.getString("Name"));
                user.setNgay(rs.getInt("Ngay"));
                user.setThang(rs.getInt("Thang"));
                user.setNam(rs.getInt("Nam"));
                user.setSex(rs.getString("Sex"));
                user.setSDT(rs.getInt("SDT"));
                user.setTK(rs.getString("TK"));
                user.setMK(rs.getString("MK"));
                listUser.add(user);
            }
            return listUser;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }



}
