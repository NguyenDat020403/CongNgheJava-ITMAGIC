
package Responsitoriesimpl;

import DomainModels.User;
import Responsitories.UserResponsitory;
import Utilities.JDBC_helper;
import View_Model.UserViewModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author admin
 * sử dụng phương thức
 */
public class User_reponsitory_impl implements UserResponsitory{
    
    @Override
    public List<UserViewModel> getALL() {
        String sql = "SELECT TOP (1000) [ID]\n"
                + "      ,[MaUser]\n"
                + "      ,[Name]\n"
                + "      ,[Ngay]\n"
                + "      ,[Thang]\n"
                + "      ,[Nam]\n"
                + "      ,[Sex]\n"
                + "      ,[SDT]\n"
                + "      ,[TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "FROM [thanSoHoc].[dbo].[Users]\n"
                + "INNER JOIN TaiKhoan\n"
                + "ON Users.FTK = TaiKhoan.TK";
        ArrayList<UserViewModel> userList = new ArrayList<>();
        ResultSet rs = JDBC_helper.selectGenerality(sql); // duyệt và lưu trữ các kết quả từ một câu lệnh SQL SELECT
        try {
            while (rs.next()) { 
                UserViewModel user = new UserViewModel();
                user.setID(rs.getInt("ID"));
                user.setMaUser(rs.getString("MaUser"));
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
    public int creat(User user) {
        String sql = "INSERT INTO [dbo].[Users]\n"
                + "           ([MaUser]\n"
                + "           ,[Name]\n"
                + "           ,[Ngay]\n"
                + "           ,[Thang]\n"
                + "           ,[Nam]\n"
                + "           ,[Sex]\n"
                + "           ,[SDT]\n"
                + "           ,[FTK])\n"
                + "     VALUES(?,?,?,?,?,?,?,?)\n";
        return JDBC_helper.updateTongQuat(sql,user.getMaUser(), user.getName(), user.getNgay(), user.getThang(), user.getNam(),
                user.getSex(), user.getSDT(), user.getFTK());
    }

    @Override
    public int update(User user, String MaUser) {
        String sql = "UPDATE [dbo].[Users]\n" +
"   SET [MaUser] = ?\n" +
"      ,[Name] = ?\n" +
"      ,[Ngay] = ?\n" +
"      ,[Thang] = ?\n" +
"      ,[Nam] = ?\n" +
"      ,[Sex] = ?\n" +
"      ,[SDT] = ?\n" +
"      ,[FTK] = ?\n" +
" WHERE MaUser = ?";
    return JDBC_helper.updateTongQuat(sql,user.getMaUser(), user.getName(), user.getNgay(), user.getThang(), user.getNam(),
                user.getSex(), user.getSDT(), user.getFTK(), user.getMaUser());
    }

    @Override
    public int delete(String MaUser) {
        String sql = "DELETE FROM [dbo].[Users]\n"
                + "      WHERE MaUser = ?";
        return JDBC_helper.updateTongQuat(sql, MaUser);
    }

    @Override
    public User getOne(String FTK) {
        String query = "SELECT TOP (1000) [ID]\n" +
"      ,[MaUser]\n" +
"      ,[Name]\n" +
"      ,[Ngay]\n" +
"      ,[Thang]\n" +
"      ,[Nam]\n" +
"      ,[Sex]\n" +
"      ,[SDT]\n" +
"      ,[FTK]\n" +
"  FROM [thanSoHoc].[dbo].[Users] WHERE FTK = ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, FTK);
        try {
            while (rs.next()) { 
               
                User user = new User();
                user.setID(rs.getInt("ID"));
                user.setMaUser(rs.getString("MaUser"));
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
    public List<UserViewModel> select(String Name) {
        ArrayList<UserViewModel> listUser = new ArrayList<>();
        String query = "SELECT TOP (1000) [ID]\n"
                + "      ,[MaUser]\n"
                + "      ,[Name]\n"
                + "      ,[Ngay]\n"
                + "      ,[Thang]\n"
                + "      ,[Nam]\n"
                + "      ,[Sex]\n"
                + "      ,[SDT]\n"
                + "      ,[TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "FROM [thanSoHoc].[dbo].[Users]\n"
                + "INNER JOIN TaiKhoan\n"
                + "ON Users.FTK = TaiKhoan.TK WHERE Name LIKE ? OR MaUser LIKE ? ";
        ResultSet rs = JDBC_helper.selectGenerality(query, "%" + Name + "%", "%" + Name + "%");
        try {
            while (rs.next()) {
                UserViewModel user = new UserViewModel();
                user.setID(rs.getInt("ID"));
                user.setMaUser(rs.getString("MaUser"));
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
    public List<UserViewModel> SortName(String Nam1, String Nam2) {
        ArrayList<UserViewModel> listUser = new ArrayList<>();
        String query = "SELECT [ID], [MaUser], [Name], [Ngay], [Thang], [Nam], [Sex], [SDT], [TK], [MK], [ChucVu]\n" +
"FROM [thanSoHoc].[dbo].[Users] INNER JOIN TaiKhoan ON Users.FTK = TaiKhoan.TK WHERE Nam >= ? AND Nam <= ?;";
        ResultSet rs = JDBC_helper.selectGenerality(query, Nam1, Nam2);
        try {
            while (rs.next()) {
                UserViewModel user = new UserViewModel();
                user.setID(rs.getInt("ID"));
                user.setMaUser(rs.getString("MaUser"));
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
