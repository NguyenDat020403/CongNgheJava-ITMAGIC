/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitoriesimpl;

import DomainModels.QuanLy;
import Responsitories.QuanLyResponsitory;
import Utilities.JDBC_helper;
import View_Model.QuanLyViewModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin impl : sử dụng tính trừu tượng
 */
public class QuanLy_responsitory_impl implements QuanLyResponsitory {

    @Override
    public List<QuanLyViewModel> getALL() {
        //tìm dữ liệu id mã tên trên SQL
        String sql = "SELECT [ID]\n"
                + "      ,[MaQL]\n"
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
                String maQL = rs.getString("MaQL");
                String tenQL = rs.getString("TenQL");
                int ngay = rs.getInt("Ngay");
                int thang = rs.getInt("Thang");
                int nam = rs.getInt("Nam");
                String tk = rs.getString("TK");
                String mk = rs.getString("MK");
                
                //lưu dữ liệu và
                quanLy.setID(id);
                quanLy.setMaQL(maQL);
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
                + "           ([MaQL]\n"
                + "           ,[TenQL]\n"
                + "           ,[Ngay]\n"
                + "           ,[Thang]\n"
                + "           ,[Nam]\n"
                + "           ,[FTK])\n"

                + "     VALUES(?, ?, ?, ?, ?, ?)";
        return JDBC_helper.updateTongQuat(sql, quanLy.getMaQL(), quanLy.getTenQL(), quanLy.getNgay(),
                quanLy.getThang(), quanLy.getNam(), quanLy.getFTK());
    }

    @Override
    public int update(QuanLy quanLy, String MaQL) {
        String sql = "UPDATE [dbo].[QuanLy]\n"
                + "   SET [MaQL] = ?\n"
                + "      ,[TenQL] = ?\n"
                + "      ,[Ngay] = ?\n"
                + "      ,[Thang] = ?\n"
                + "      ,[Nam] = ?\n"
                + "      ,[FTK] = ?\n"

                + " WHERE MaQL = ?";
        return JDBC_helper.updateTongQuat(sql, quanLy.getMaQL(), quanLy.getTenQL(), quanLy.getNgay(), quanLy.getThang(),
                quanLy.getNam(), quanLy.getFTK(),  quanLy.getMaQL());
    }

    @Override
    public int delete(String MaQL) {
        String sql = "DELETE FROM [dbo].[QuanLy]\n"
                + "      WHERE MaQL = ?";
        return JDBC_helper.updateTongQuat(sql, MaQL);
    }
}
