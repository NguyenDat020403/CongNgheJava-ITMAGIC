package com.raven.form;

import Service.impl.CK_Service_impl;
import Service.impl.TTNhap_Service_impl;
import Services.CKService;
import Utilities.Auth;
import View_Model.CKViewModel;
import java.awt.Color;
import java.util.List;
import Services.TTNhapService;

public class Form_ThongTinChuKy extends javax.swing.JFrame {

    List<CKViewModel> ListCK;
    CKService ckSer = new CK_Service_impl();
    TTNhapService userService = new TTNhap_Service_impl();    
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
        setBackground(new Color(0, 0, 0, 0));        
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

        jLabel2.setFont(new java.awt.Font("UTM Impact", 0, 18)); // NOI18N
        jLabel2.setText("Đường tình:");

        jLabel3.setFont(new java.awt.Font("UTM Impact", 0, 18)); // NOI18N
        jLabel3.setText("Biện pháp:");

        jLabel4.setFont(new java.awt.Font("UTM Impact", 0, 18)); // NOI18N
        jLabel4.setText("Nội dung:");

        jLabel5.setFont(new java.awt.Font("UTM Impact", 0, 18)); // NOI18N
        jLabel5.setText("Số chu kỳ:");

        txtSCK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtND.setBorder(null);
        txtND.setColumns(20);
        txtND.setRows(5);
        txtND.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(txtND);

        txtTY.setColumns(20);
        txtTY.setRows(5);
        txtTY.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(txtTY);

        txtBP.setColumns(20);
        txtBP.setRows(5);
        txtBP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(txtBP);

        javax.swing.GroupLayout txtThanSoHoc1Layout = new javax.swing.GroupLayout(txtThanSoHoc1);
        txtThanSoHoc1.setLayout(txtThanSoHoc1Layout);
        txtThanSoHoc1Layout.setHorizontalGroup(
            txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtSCK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
            .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        txtThanSoHoc1Layout.setVerticalGroup(
            txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSCK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
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
<<<<<<< HEAD
                .addGroup(panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(Exit))
                    .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE)))
=======
                .addGap(20, 20, 20)
                .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit)
>>>>>>> ae17698507dee66cc98f3865d45280e8794cae59
                .addContainerGap())
        );
        panelThanSoHoc1Layout.setVerticalGroup(
            panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanSoHoc1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addContainerGap(19, Short.MAX_VALUE))
>>>>>>> ae17698507dee66cc98f3865d45280e8794cae59
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelThanSoHoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    public static void main(String args[]) {

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
