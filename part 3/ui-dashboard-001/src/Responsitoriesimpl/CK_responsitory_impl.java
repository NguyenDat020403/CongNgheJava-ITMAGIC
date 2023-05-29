package Responsitoriesimpl;

import DomainModels.ChuKy;
import Responsitories.CKResponsitory;
import Utilities.JDBC_helper;
import View_Model.CKViewModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CK_responsitory_impl implements CKResponsitory {
        @Override
    public List<CKViewModel> getALL() {
        //tìm dữ liệu id mã tên trên SQL
        String sql = "SELECT TOP (1000)\n"
                    + "      [SoCK]\n"
                    + "      ,[ND]\n"
                    + "      ,[BienPhap]\n"
                    + "      ,[TinhYeu]\n"
                    + "  FROM [thanSoHoc].[dbo].[CK]";
        ArrayList<CKViewModel> ckList = new ArrayList<>();
        ResultSet rs = JDBC_helper.selectGenerality(sql); // duyệt và lưu trữ các kết quả từ một câu lệnh SQL SELEC
        try {
            //đi từng dòng cho đến khi hết dữ liệu
            while (rs.next()) {
                //tạo một đối tượng rỗng để lưu tạm dữ liệu
                CKViewModel ck = new CKViewModel();
                String So = rs.getString("SoCK");
                String nd = rs.getString("ND");
                String bp = rs.getString("BienPhap");
                String ty = rs.getString("TinhYeu");

                ck.setSoCK(So);
                ck.setND(nd);
                ck.setBienPhap(bp);
                ck.setTinhYeu(ty);

                //thêm dữ liệu vào danh sách
                ckList.add(ck);
            }
            //trả danh sách
            return ckList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public ChuKy getOne(String SoCK) {
        String query = "SELECT TOP (1000) \n"
                + "      [SoCK]\n"
                + "      ,[ND]\n"
                + "      ,[BienPhap]\n"
                + "      ,[TinhYeu]\n"
                + "  FROM [thanSoHoc].[dbo].[CK] WHERE SoCK = ?";
        ResultSet rs = JDBC_helper.selectGenerality(query, SoCK);
        try {
            while (rs.next()) {

                ChuKy ck = new ChuKy();
                ck.setSoCK(rs.getString("SoCK"));
                ck.setND(rs.getString("ND"));
                ck.setBienPhap(rs.getString("BienPhap"));
                ck.setTinhYeu(rs.getString("TinhYeu"));
                return ck;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;    
    }
}
