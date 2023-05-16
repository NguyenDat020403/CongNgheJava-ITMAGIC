/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;
import java.sql.*;
/**
 *
 * @author admin
 */
public class JDBC_helper {
    public static ResultSet selectGenerality (String sql, Object...params) {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = DB_connection.getConnection();
            ps = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            close(con, ps, rs);
            return null;
        }
    }
    
    public static void close(Connection con, PreparedStatement ps) {
        try {
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
        try {
            rs.close();
            close(con, ps);
        } catch (SQLException e) {
            e.printStackTrace();
//            Logger.getLogger(JDBC_Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public static int updateTongQuat(String sql, Object...params) {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = DB_connection.getConnection();
            ps = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            close(con, ps);
        }
     }
}
