package com.raven.form;

import DomainModels.TTNhap;
import DomainModels.ThongTinTraCuu;
import Service.impl.TTNhap_Service_impl;
import Service.impl.TT_Service_impl;
import Utilities.Auth;
import View_Model.TTNhapViewModel;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import Services.TTNhapService;
import Services.TTService;
import View_Model.TTViewModel;
import java.time.LocalDate;
import loginandsignup.Login;

public class Form_TraCuu extends javax.swing.JFrame {
    List<TTViewModel> ListTT;
    TTService ttSer = new TT_Service_impl();
    List<TTNhapViewModel> ListTTNhap;
    TTNhapService ttNhapSer = new TTNhap_Service_impl();
    public Form_TraCuu() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

        LocalDate currentDate = LocalDate.now();
    public int Check() {
        ListTTNhap = ttNhapSer.getALL();
        int a = 0;
        for (TTNhapViewModel user : ListTTNhap) {
            if (user.getEmailUser().equals(txtEmail.getText())) {
                return a = 1;
            }
        }
        return a;
    }        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelThanSoHoc2 = new com.raven.swing.PanelThanSoHoc();
        txtThanSoHoc1 = new com.raven.swing.txtThanSoHoc();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtThanSoHoc2 = new com.raven.swing.txtThanSoHoc();
        jLabel2 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtThanSoHoc3 = new com.raven.swing.txtThanSoHoc();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtThanSoHoc4 = new com.raven.swing.txtThanSoHoc();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        txtThanSoHoc5 = new com.raven.swing.txtThanSoHoc();
        jLabel5 = new javax.swing.JLabel();
        txtSex = new javax.swing.JComboBox<>();
        txtThanSoHoc6 = new com.raven.swing.txtThanSoHoc();
        jLabel6 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        txtThang = new javax.swing.JTextField();
        txtNam = new javax.swing.JTextField();
        btnTraCuu = new com.raven.swing.Button();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtThanSoHoc1Layout = new javax.swing.GroupLayout(txtThanSoHoc1);
        txtThanSoHoc1.setLayout(txtThanSoHoc1Layout);
        txtThanSoHoc1Layout.setHorizontalGroup(
            txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        txtThanSoHoc1Layout.setVerticalGroup(
            txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(txtThanSoHoc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("SDT:");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtThanSoHoc2Layout = new javax.swing.GroupLayout(txtThanSoHoc2);
        txtThanSoHoc2.setLayout(txtThanSoHoc2Layout);
        txtThanSoHoc2Layout.setHorizontalGroup(
            txtThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        txtThanSoHoc2Layout.setVerticalGroup(
            txtThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(txtThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Họ Tên:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtThanSoHoc3Layout = new javax.swing.GroupLayout(txtThanSoHoc3);
        txtThanSoHoc3.setLayout(txtThanSoHoc3Layout);
        txtThanSoHoc3Layout.setHorizontalGroup(
            txtThanSoHoc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        txtThanSoHoc3Layout.setVerticalGroup(
            txtThanSoHoc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(txtThanSoHoc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tên đệm:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtThanSoHoc4Layout = new javax.swing.GroupLayout(txtThanSoHoc4);
        txtThanSoHoc4.setLayout(txtThanSoHoc4Layout);
        txtThanSoHoc4Layout.setHorizontalGroup(
            txtThanSoHoc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        txtThanSoHoc4Layout.setVerticalGroup(
            txtThanSoHoc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(txtThanSoHoc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel5.setText("Sex:");

        txtSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giới tính", "Nam", "Nữ", "Khác" }));
        txtSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtThanSoHoc5Layout = new javax.swing.GroupLayout(txtThanSoHoc5);
        txtThanSoHoc5.setLayout(txtThanSoHoc5Layout);
        txtThanSoHoc5Layout.setHorizontalGroup(
            txtThanSoHoc5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        txtThanSoHoc5Layout.setVerticalGroup(
            txtThanSoHoc5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(txtThanSoHoc5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngày sinh:");

        javax.swing.GroupLayout txtThanSoHoc6Layout = new javax.swing.GroupLayout(txtThanSoHoc6);
        txtThanSoHoc6.setLayout(txtThanSoHoc6Layout);
        txtThanSoHoc6Layout.setHorizontalGroup(
            txtThanSoHoc6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txtThanSoHoc6Layout.setVerticalGroup(
            txtThanSoHoc6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtThanSoHoc6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(txtThanSoHoc6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnTraCuu.setText("Tra cứu");
        btnTraCuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTraCuuMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8-exit-1.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelThanSoHoc2Layout = new javax.swing.GroupLayout(panelThanSoHoc2);
        panelThanSoHoc2.setLayout(panelThanSoHoc2Layout);
        panelThanSoHoc2Layout.setHorizontalGroup(
            panelThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanSoHoc2Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addGroup(panelThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanSoHoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanSoHoc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanSoHoc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelThanSoHoc2Layout.createSequentialGroup()
                        .addComponent(txtThanSoHoc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtThanSoHoc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelThanSoHoc2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(278, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThanSoHoc2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        panelThanSoHoc2Layout.setVerticalGroup(
            panelThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThanSoHoc2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(60, 60, 60)
                .addComponent(txtThanSoHoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtThanSoHoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtThanSoHoc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtThanSoHoc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelThanSoHoc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtThanSoHoc5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtThanSoHoc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelThanSoHoc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelThanSoHoc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    }//GEN-LAST:event_txtNameActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexActionPerformed
    }//GEN-LAST:event_txtSexActionPerformed

    private void btnTraCuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraCuuMouseClicked


        
        StringBuilder sb = new StringBuilder();
        if (txtEmail.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Email'");
        } else if (txtName.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tên'");
        } else if (txtSDT.getText().equals("")) {
            sb.append("Bạn chưa nhập 'SDT'");
        } else if (txtNgay.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Ngày'");
        } else if (txtThang.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tháng'"); 
        } else if (txtNam.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Nam'");
        }  
        if(Check() == 1){
            JOptionPane.showConfirmDialog(this, "Trùng Email.","ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (sb.length() > 0) {
            JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String sex = (String) txtSex.getSelectedItem();
        String sdt = txtSDT.getText();
        int sdtInt = Integer.parseInt(sdt);
        String ngay = txtNgay.getText();
        int ngayInt = Integer.parseInt(ngay);
        String thang = txtThang.getText();
        int thangInt = Integer.parseInt(thang);
        String nam = txtNam.getText();
        int namInt = Integer.parseInt(nam);

        if (ngayInt > 31 || 0 >= ngayInt) {
            sb.append("Bạn chưa nhập đúng ngày tháng năm sinh!");
        } else if (thangInt > 12 || 0 >= thangInt) {
            sb.append("Bạn chưa nhập đúng ngày tháng năm sinh!");
        } else if (namInt < 1900 || namInt > 2100) {
            sb.append("Bạn chưa nhập đúng ngày tháng năm sinh!");
        }

        if (sb.length() > 0) {
            JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        while (ngayInt > 9) {
            ngayInt = ngayInt % 10 + ngayInt / 10;
        }
        while (thangInt > 9) {
            thangInt = thangInt % 10 + thangInt / 10;
        }
        while (namInt > 9) {
            namInt = namInt % 10 + namInt / 10;
        }

        int SCD = ngayInt + thangInt + namInt;
        if (SCD != 11) {
            while (SCD > 9) {
                SCD = SCD % 10 + SCD / 10;
            }
        }
        int SCK = ngayInt + thangInt + namInt;
        if (SCK > 7) {
            SCK = SCK - 7;
        } else {
            SCK = SCK + 9 - 7;
        }
        TTNhap ttNhap = new TTNhap();

        
        ttNhap.setEmailUser(txtEmail.getText());
        ttNhap.setName(txtName.getText());
        ttNhap.setNgay(ngayInt);
        ttNhap.setThang(thangInt);
        ttNhap.setNam(namInt);
        ttNhap.setSex(sex);
        ttNhap.setSDT(sdtInt);
        ttNhap.setFTK( Auth.taiKhoan.getTK());
        //thêm dữ liệu vào danh sách
        ttNhapSer.creat(ttNhap);
        
        Auth.user = ttNhap;
        
        ThongTinTraCuu ttTraCuu = new ThongTinTraCuu();
        ListTTNhap = ttNhapSer.getALL();
        for (TTNhapViewModel tt : ListTTNhap) {
            if (tt.getEmailUser().equals(txtEmail.getText())) {
                ttTraCuu.setIDThongTinNhap(tt.getID());
            }
        }
        ttTraCuu.setIDSCD(SCD);
        ttTraCuu.setIDCK(SCK);
        ttTraCuu.setNgayTraCuu(java.sql.Date.valueOf(currentDate));
        ttTraCuu.setIDSCN(1);
        ttTraCuu.setIDSCT(1);
        ttSer.creat(ttTraCuu);     
        
        Form_ThongTinTraCuu thongTin = new Form_ThongTinTraCuu();
        thongTin.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnTraCuuMouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_jLabel7MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_TraCuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button btnTraCuu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField4;
    private com.raven.swing.PanelThanSoHoc panelThanSoHoc2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JComboBox<String> txtSex;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc1;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc2;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc3;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc4;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc5;
    private com.raven.swing.txtThanSoHoc txtThanSoHoc6;
    private javax.swing.JTextField txtThang;
    // End of variables declaration//GEN-END:variables
}
