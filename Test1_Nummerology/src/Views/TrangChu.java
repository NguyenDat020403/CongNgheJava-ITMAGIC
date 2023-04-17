/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TrangChu extends javax.swing.JFrame {
    Color DefaultColor,ClickedColor;
    public TrangChu() {

        initComponents();
        DefaultColor = new Color(204,255,255);
        ClickedColor = new Color(240, 151, 57);
        JPTrangChu.setBackground(ClickedColor);
        JPAdmin.setBackground(DefaultColor);
        JPUser.setBackground(DefaultColor);
        JPThongKe.setBackground(DefaultColor);
        JPDangXuat.setBackground(DefaultColor);
        
        TrangChu_QuanLyForm quanLyForm = new TrangChu_QuanLyForm();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(quanLyForm).setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPTrangChu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        JPAdmin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JPDangXuat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JPUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPThongKe = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPanel = new javax.swing.JDesktopPane();
        JPThuatToan = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPTrangChu.setBackground(new java.awt.Color(204, 255, 255));
        JPTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        JPTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPTrangChuMousePressed(evt);
            }
        });

        jLabel6.setText("Trang Chu");

        javax.swing.GroupLayout JPTrangChuLayout = new javax.swing.GroupLayout(JPTrangChu);
        JPTrangChu.setLayout(JPTrangChuLayout);
        JPTrangChuLayout.setHorizontalGroup(
            JPTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPTrangChuLayout.setVerticalGroup(
            JPTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPTrangChuLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        JPAdmin.setBackground(new java.awt.Color(204, 255, 255));
        JPAdmin.setForeground(new java.awt.Color(255, 255, 255));
        JPAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPAdminMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 255, 51));
        jLabel4.setText("Admin");

        javax.swing.GroupLayout JPAdminLayout = new javax.swing.GroupLayout(JPAdmin);
        JPAdmin.setLayout(JPAdminLayout);
        JPAdminLayout.setHorizontalGroup(
            JPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAdminLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        JPAdminLayout.setVerticalGroup(
            JPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAdminLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        JPDangXuat.setBackground(new java.awt.Color(204, 255, 255));
        JPDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPDangXuatMousePressed(evt);
            }
        });

        jLabel5.setText("Đăng Xuất");

        javax.swing.GroupLayout JPDangXuatLayout = new javax.swing.GroupLayout(JPDangXuat);
        JPDangXuat.setLayout(JPDangXuatLayout);
        JPDangXuatLayout.setHorizontalGroup(
            JPDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDangXuatLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPDangXuatLayout.setVerticalGroup(
            JPDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        JPUser.setBackground(new java.awt.Color(204, 255, 255));
        JPUser.setForeground(new java.awt.Color(255, 255, 255));
        JPUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPUserMousePressed(evt);
            }
        });

        jLabel1.setText("USER");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPUserLayout = new javax.swing.GroupLayout(JPUser);
        JPUser.setLayout(JPUserLayout);
        JPUserLayout.setHorizontalGroup(
            JPUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPUserLayout.setVerticalGroup(
            JPUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPUserLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        JPThongKe.setBackground(new java.awt.Color(204, 255, 255));
        JPThongKe.setForeground(new java.awt.Color(255, 255, 255));
        JPThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPThongKeMousePressed(evt);
            }
        });

        jLabel3.setText("Thống Kế");

        javax.swing.GroupLayout JPThongKeLayout = new javax.swing.GroupLayout(JPThongKe);
        JPThongKe.setLayout(JPThongKeLayout);
        JPThongKeLayout.setHorizontalGroup(
            JPThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPThongKeLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPThongKeLayout.setVerticalGroup(
            JPThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPThongKeLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1277, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        JPThuatToan.setBackground(new java.awt.Color(204, 255, 255));
        JPThuatToan.setForeground(new java.awt.Color(255, 255, 255));
        JPThuatToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPThuatToanMousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 255, 51));
        jLabel9.setText("Thuật toán");

        javax.swing.GroupLayout JPThuatToanLayout = new javax.swing.GroupLayout(JPThuatToan);
        JPThuatToan.setLayout(JPThuatToanLayout);
        JPThuatToanLayout.setHorizontalGroup(
            JPThuatToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPThuatToanLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        JPThuatToanLayout.setVerticalGroup(
            JPThuatToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPThuatToanLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JPDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JPTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JPThuatToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPanel))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(JPTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPThuatToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        DefaultColor = new Color(204,255,255);
        ClickedColor = new Color(240, 151, 57);        
        JPTrangChu.setBackground(DefaultColor);
        JPAdmin.setBackground(DefaultColor);
        JPUser.setBackground(ClickedColor);
        JPThongKe.setBackground(DefaultColor);
        JPDangXuat.setBackground(DefaultColor);
        TrangChu_User userForm = new TrangChu_User();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(userForm).setVisible(true);        
    }//GEN-LAST:event_jLabel1MousePressed

    private void JPUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPUserMousePressed
        DefaultColor = new Color(204,255,255);
        ClickedColor = new Color(240, 151, 57);        
        JPTrangChu.setBackground(DefaultColor);
        JPAdmin.setBackground(DefaultColor);
        JPUser.setBackground(ClickedColor);
        JPThongKe.setBackground(DefaultColor);
        JPDangXuat.setBackground(DefaultColor);
        TrangChu_User userForm = new TrangChu_User();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(userForm).setVisible(true);        
    }//GEN-LAST:event_JPUserMousePressed

    private void JPThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPThongKeMousePressed
        JPTrangChu.setBackground(DefaultColor);
        JPAdmin.setBackground(DefaultColor);
        JPUser.setBackground(DefaultColor);
        JPThongKe.setBackground(ClickedColor);
        JPDangXuat.setBackground(DefaultColor);
    }//GEN-LAST:event_JPThongKeMousePressed

    private void JPAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPAdminMousePressed
        JPTrangChu.setBackground(DefaultColor);
        JPAdmin.setBackground(ClickedColor);
        JPUser.setBackground(DefaultColor);
        JPThongKe.setBackground(DefaultColor);
        JPDangXuat.setBackground(DefaultColor);
        TrangChu_QuanLyForm quanLyForm = new TrangChu_QuanLyForm();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(quanLyForm).setVisible(true);        
    }//GEN-LAST:event_JPAdminMousePressed

    private void JPDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPDangXuatMousePressed
        JPTrangChu.setBackground(DefaultColor);
        JPAdmin.setBackground(DefaultColor);
        JPUser.setBackground(DefaultColor);
        JPThongKe.setBackground(DefaultColor);
        JPDangXuat.setBackground(ClickedColor);
       int choice = JOptionPane.showConfirmDialog(this, "Bạnn có muốn thoát không?", "Xác nhận.", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_NO_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_JPDangXuatMousePressed

    private void JPTrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPTrangChuMousePressed
        DefaultColor = new Color(204,255,255);
        ClickedColor = new Color(240, 151, 57);
        JPTrangChu.setBackground(ClickedColor);
        JPAdmin.setBackground(DefaultColor);
        JPUser.setBackground(DefaultColor);
        JPThongKe.setBackground(DefaultColor);
        JPDangXuat.setBackground(DefaultColor);
        
        TrangChu_QuanLyForm quanLyForm = new TrangChu_QuanLyForm();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(quanLyForm).setVisible(true);
    }//GEN-LAST:event_JPTrangChuMousePressed

    private void JPThuatToanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPThuatToanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPThuatToanMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPAdmin;
    private javax.swing.JPanel JPAdmin1;
    private javax.swing.JPanel JPAdmin2;
    private javax.swing.JPanel JPDangXuat;
    private javax.swing.JPanel JPThongKe;
    private javax.swing.JPanel JPThuatToan;
    private javax.swing.JPanel JPTrangChu;
    private javax.swing.JPanel JPUser;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
