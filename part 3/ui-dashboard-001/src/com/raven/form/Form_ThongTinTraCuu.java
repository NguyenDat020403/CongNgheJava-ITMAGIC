package com.raven.form;

import Service.impl.CD_Service_impl;
import Service.impl.TTNhap_Service_impl;
import Services.CDService;
import Utilities.Auth;
import View_Model.CDViewModel;
import java.awt.Color;
import java.util.List;
import Services.TTNhapService;

public class Form_ThongTinTraCuu extends javax.swing.JFrame {

    List<CDViewModel> ListCD;
    CDService cdSer = new CD_Service_impl();
    TTNhapService userService = new TTNhap_Service_impl();    

    public int TinhSoCD(){
    int ngay = Auth.user.getNgay(); 
    int thang = Auth.user.getThang();
    int nam = Auth.user.getNam();
    
    while(ngay>9){
        ngay = ngay%10 + ngay/10;
    }
    while(thang>9){
        thang = thang%10 + thang/10;
    }
    while(nam>9){
        nam = nam%10 + nam/10;
    }

    int SCD = ngay + thang + nam;
    if(SCD != 11){
        while(SCD>9){
            SCD = SCD%10 + SCD/10;
        }
    }
    return SCD;
    }
    public Form_ThongTinTraCuu() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));        
        ListCD = cdSer.getALL();
        txtName.setText(Auth.user.getName());
        txtSCD.setText(String.valueOf(TinhSoCD()));
        for (CDViewModel cd : ListCD) {
            if (cd.getSoCD().equals(String.valueOf(TinhSoCD()))) {
                txtND.setText(cd.getNDCD());   
                txtDiemManh.setText(cd.getDiemManh());
                txtDiemYeu.setText(cd.getDiemYeu()); 
                txtTinhCach.setText(cd.getTinhCach());
                txtNgay.setText(String.valueOf(Auth.user.getNgay() + "/" + Auth.user.getThang() + "/" + Auth.user.getNam()));
            }
        }        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtThanSoHoc6 = new com.raven.swing.txtThanSoHoc();
        jTextField6 = new javax.swing.JTextField();
        panelThanSoHoc1 = new com.raven.swing.PanelThanSoHoc();
        txtThanSoHoc1 = new com.raven.swing.txtThanSoHoc();
        txtName = new javax.swing.JTextField();
        txtThanSoHoc2 = new com.raven.swing.txtThanSoHoc();
        txtNgay = new javax.swing.JTextField();
        txtThanSoHoc8 = new com.raven.swing.txtThanSoHoc();
        jLabel1 = new javax.swing.JLabel();
        txtSCD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTinhCach = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtND = new com.raven.swing.TextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiemManh = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDiemYeu = new com.raven.swing.TextArea();
        jLabel7 = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtThanSoHoc6Layout = new javax.swing.GroupLayout(txtThanSoHoc6);
        txtThanSoHoc6.setLayout(txtThanSoHoc6Layout);
        txtThanSoHoc6Layout.setHorizontalGroup(
            txtThanSoHoc6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );
        txtThanSoHoc6Layout.setVerticalGroup(
            txtThanSoHoc6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtThanSoHoc6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtThanSoHoc1Layout = new javax.swing.GroupLayout(txtThanSoHoc1);
        txtThanSoHoc1.setLayout(txtThanSoHoc1Layout);
        txtThanSoHoc1Layout.setHorizontalGroup(
            txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );
        txtThanSoHoc1Layout.setVerticalGroup(
            txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtThanSoHoc1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNgay.setBorder(null);
        txtNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtThanSoHoc2Layout = new javax.swing.GroupLayout(txtThanSoHoc2);
        txtThanSoHoc2.setLayout(txtThanSoHoc2Layout);
        txtThanSoHoc2Layout.setHorizontalGroup(
            txtThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        txtThanSoHoc2Layout.setVerticalGroup(
            txtThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtThanSoHoc2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("SỐ CHỦ ĐẠO:");

        txtSCD.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtSCD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSCD.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Các thông tin liên quan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tính cách:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Điểm mạnh:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtTinhCach.setColumns(20);
        txtTinhCach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTinhCach.setRows(5);
        txtTinhCach.setBorder(null);
        txtTinhCach.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtTinhCach);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtND.setColumns(20);
        txtND.setRows(5);
        txtND.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(txtND);

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDiemManh.setColumns(20);
        txtDiemManh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDiemManh.setRows(5);
        txtDiemManh.setBorder(null);
        jScrollPane3.setViewportView(txtDiemManh);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDiemYeu.setBorder(null);
        txtDiemYeu.setColumns(20);
        txtDiemYeu.setRows(5);
        txtDiemYeu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane5.setViewportView(txtDiemYeu);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Điểm yếu:");

        javax.swing.GroupLayout txtThanSoHoc8Layout = new javax.swing.GroupLayout(txtThanSoHoc8);
        txtThanSoHoc8.setLayout(txtThanSoHoc8Layout);
        txtThanSoHoc8Layout.setHorizontalGroup(
            txtThanSoHoc8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc8Layout.createSequentialGroup()
                .addGroup(txtThanSoHoc8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtThanSoHoc8Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSCD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtThanSoHoc8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(txtThanSoHoc8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(txtThanSoHoc8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addGroup(txtThanSoHoc8Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(txtThanSoHoc8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane3)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        txtThanSoHoc8Layout.setVerticalGroup(
            txtThanSoHoc8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(txtThanSoHoc8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtSCD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/next-50.png"))); // NOI18N
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelThanSoHoc1Layout = new javax.swing.GroupLayout(panelThanSoHoc1);
        panelThanSoHoc1.setLayout(panelThanSoHoc1Layout);
        panelThanSoHoc1Layout.setHorizontalGroup(
            panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                        .addComponent(txtThanSoHoc8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                        .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(txtThanSoHoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addContainerGap())))
        );
        panelThanSoHoc1Layout.setVerticalGroup(
            panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                .addGroup(panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThanSoHoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNext)))
                .addGap(46, 46, 46)
                .addComponent(txtThanSoHoc8, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        Form_ThongTinChuKy chuKy = new Form_ThongTinChuKy();
        chuKy.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_ThongTinTraCuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField6;
    private com.raven.swing.PanelThanSoHoc panelThanSoHoc1;
    private javax.swing.JTextArea txtDiemManh;
    private com.raven.swing.TextArea txtDiemYeu;
    private com.raven.swing.TextArea txtND;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSCD;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc1;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc2;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc6;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc8;
    private javax.swing.JTextArea txtTinhCach;
    // End of variables declaration//GEN-END:variables
}
