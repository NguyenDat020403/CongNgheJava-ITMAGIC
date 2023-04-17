/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitoriesimpl;

import DomainModels.TaiKhoan;
import DomainModels.User;
import Responsitories.TKResponsitory;
import Utilities.JDBC_helper;
import View_Model.TKViewModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class TK_responsitory_impl implements TKResponsitory {

    @Override
    public List<TKViewModel> getALL() {
        //tìm dữ liệu id mã tên trên SQL
        String sql = "SELECT TOP (1000) [TK]\n"
                + "      ,[MK]\n"
                + "      ,[ChucVu]\n"
                + "  FROM [thanSoHoc].[dbo].[TaiKhoan]";
        ArrayList<TKViewModel> tkList = new ArrayList<>();
        ResultSet rs = JDBC_helper.selectGenerality(sql); // duyệt và lưu trữ các kết quả từ một câu lệnh SQL SELECT
        try {
            //đi từng dòng cho đến khi hết dữ liệu
            while (rs.next()) {
                //tạo một đối tượng rỗng để lưu tạm dữ liệu
                TKViewModel tk = new TKViewModel();
                //lấy dữ liệu cùng tên tương ứng

                String taikhoan = rs.getString("TK");
                String mk = rs.getString("MK");
                String cv = rs.getString("ChucVu");

                //lưu dữ liệu và

                tk.setTK(taikhoan);
                tk.setMK(mk);
                tk.setChucVu(cv);
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
                + "           ,[ChucVu])\n"
                + "     VALUES(?,?,?)";
        return JDBC_helper.updateTongQuat(sql, tk.getTK(), tk.getMK(), tk.getChucVu());
    }

    @Override
    public int update(TaiKhoan tk, String TK) {
        String sql = "UPDATE [dbo].[TaiKhoan]\n"
                + "   SET,[TK] = ?\n"
                + "      ,[MK] = ?\n"
                + "      ,[ChucVu] = ?\n"
                + " WHERE TK = ?";
        return JDBC_helper.updateTongQuat(sql, tk.getTK(), tk.getMK(), tk.getChucVu(), tk.getTK());
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
                + "  FROM [thanSoHoc].[dbo].[TaiKhoan] WHERE TK = ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, TK);
        try {
            while (rs.next()) { 
               
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTK(rs.getString("TK"));
                taiKhoan.setMK(rs.getString("MK"));
                taiKhoan.setChucVu(rs.getString("ChucVu"));
   
                return taiKhoan;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;   
    }
}
