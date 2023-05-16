/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.form;

import Service.impl.CK_Service_impl;
import Service.impl.User_Service_impl;
import Services.CKService;
import Services.UserService;
import Utilities.Auth;
import View_Model.CKViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class Form_ThongTinChuKy extends javax.swing.JFrame {

    List<CKViewModel> ListCK;
    CKService ckSer = new CK_Service_impl();
    UserService userService = new User_Service_impl();    
    public int TinhSoCK() {
        int ngay = Auth.user.getNgay();
        int thang = Auth.user.getThang();
        int nam = Auth.user.getNam();

        while (ngay > 9) {
            ngay = ngay % 10 + ngay / 10;
        }
        while (thang > 9) {
            thang = thang % 10 + thang / 10;
        }
        while (nam > 9) {
            nam = nam % 10 + nam / 10;
        }

        int SCK = ngay + thang + nam;
        while (SCK > 9) {
            SCK = SCK % 10 + SCK / 10;
        }
        if(SCK>7){
            SCK = SCK - 7;
        }else{
            SCK = SCK + 9 - 7;  
        }
        return SCK;
    }
    public Form_ThongTinChuKy() {
        initComponents();
        ListCK = ckSer.getALL();
        txtSCK.setText(String.valueOf(TinhSoCK()));
        for (CKViewModel ck : ListCK) {
            if (ck.getSoCK().equals(String.valueOf(TinhSoCK()))) {
                txtND.setText(ck.getND());   
                txtTY.setText(ck.getTinhYeu());
                txtBP.setText(ck.getBienPhap()); 

            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelThanSoHoc1 = new com.raven.swing.PanelThanSoHoc();
        jLabel1 = new javax.swing.JLabel();
        txtThanSoHoc1 = new com.raven.swing.txtThanSoHoc();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSCK = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtND = new com.raven.swing.TextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTY = new com.raven.swing.TextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBP = new com.raven.swing.TextArea();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/chuky.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Đường tình:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Biện pháp:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nội dung:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Số chu kỳ:");

        txtSCK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtND.setBorder(null);
        txtND.setColumns(20);
        txtND.setRows(5);
        jScrollPane1.setViewportView(txtND);

        txtTY.setColumns(20);
        txtTY.setRows(5);
        jScrollPane2.setViewportView(txtTY);

        txtBP.setColumns(20);
        txtBP.setRows(5);
        jScrollPane3.setViewportView(txtBP);

        javax.swing.GroupLayout txtThanSoHoc1Layout = new javax.swing.GroupLayout(txtThanSoHoc1);
        txtThanSoHoc1.setLayout(txtThanSoHoc1Layout);
        txtThanSoHoc1Layout.setHorizontalGroup(
            txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtSCK, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        txtThanSoHoc1Layout.setVerticalGroup(
            txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSCK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24))
        );

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/exit-50.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelThanSoHoc1Layout = new javax.swing.GroupLayout(panelThanSoHoc1);
        panelThanSoHoc1.setLayout(panelThanSoHoc1Layout);
        panelThanSoHoc1Layout.setHorizontalGroup(
            panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
        );
        panelThanSoHoc1Layout.setVerticalGroup(
            panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                .addGroup(panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Exit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelThanSoHoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelThanSoHoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_ThongTinChuKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_ThongTinChuKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_ThongTinChuKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_ThongTinChuKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_ThongTinChuKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.raven.swing.PanelThanSoHoc panelThanSoHoc1;
    private com.raven.swing.TextArea txtBP;
    private com.raven.swing.TextArea txtND;
    private javax.swing.JTextField txtSCK;
    private com.raven.swing.TextArea txtTY;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc1;
    // End of variables declaration//GEN-END:variables
}
