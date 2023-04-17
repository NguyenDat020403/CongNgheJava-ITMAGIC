/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitoriesimpl;

import DomainModels.SoCD;
import DomainModels.TaiKhoan;
import Responsitories.CDResponsitory;
import Utilities.JDBC_helper;
import View_Model.CDViewModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CD_responsitory_impl implements CDResponsitory {

    @Override
    public List<CDViewModel> getALL() {
        //tìm dữ liệu id mã tên trên SQL
        String sql = "SELECT TOP (1000) [ID]\n"
                + "      ,[SoCD]\n"
                + "      ,[NDCD]\n"
                + "      ,[power]\n"
                + "  FROM [thanSoHoc].[dbo].[soChuDao]";
        ArrayList<CDViewModel> cdList = new ArrayList<>();
        ResultSet rs = JDBC_helper.selectGenerality(sql); // duyệt và lưu trữ các kết quả từ một câu lệnh SQL SELECT
        try {
            //đi từng dòng cho đến khi hết dữ liệu
            while (rs.next()) {
                //tạo một đối tượng rỗng để lưu tạm dữ liệu
                CDViewModel cd = new CDViewModel();
                //lấy dữ liệu cùng tên tương ứng

                String so = rs.getString("SoCD");
                String nd = rs.getString("NDCD");
                String power = rs.getString("power");

                //lưu dữ liệu và

                cd.setSoCD(so);
                cd.setNDCD(nd);
                cd.setPower(power);
                //thêm dữ liệu vào danh sách
                cdList.add(cd);
            }
            //trả danh sách
            return cdList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public int creat(SoCD cd) {
        String sql = "INSERT INTO [dbo].[soChuDao]\n"
                + "           ([SoCD]\n"
                + "           ,[NDCD]\n"
                + "           ,[power])\n"
                + "     VALUES(?,?,?)";
        return JDBC_helper.updateTongQuat(sql, cd.getSoCD(), cd.getNDCD(), cd.getPower());        
    }

    @Override
    public int update(SoCD cd, String SoCD) {
        String sql = "UPDATE [dbo].[soChuDao]\n"
                + "   SET [SoCD] = ?\n"
                + "      ,[NDCD] = ?\n"
                + "      ,[power] = ?\n"
                + " WHERE SoCD=?";
        return JDBC_helper.updateTongQuat(sql, cd.getSoCD(), cd.getNDCD(), cd.getPower());       
    }

    @Override
    public int delete(String SoCD) {
        String sql = "DELETE FROM [dbo].[soChuDao]\n" +
"      WHERE SoCD=?";
        return JDBC_helper.updateTongQuat(sql, SoCD);       
    }

    @Override
    public SoCD getOne(String SoCD) {
        String query = "SELECT TOP (1000) [ID]\n"
                + "      ,[SoCD]\n"
                + "      ,[NDCD]\n"
                + "      ,[power]\n"
                + "  FROM [thanSoHoc].[dbo].[soChuDao] WHERE SoCD = ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, SoCD);
        try {
            while (rs.next()) { 
               
                SoCD chuDao = new SoCD();
                chuDao.setSoCD(rs.getString("SoCD"));
                chuDao.setNDCD(rs.getString("NDCD"));
                chuDao.setPower(rs.getString("power"));
   
                return chuDao;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;         
    }

}
