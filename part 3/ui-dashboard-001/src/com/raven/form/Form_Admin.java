/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import DomainModels.QuanLy;
import DomainModels.TaiKhoan;
import Service.impl.QuanLy_Service_impl;
import Service.impl.TK_Service_impl;
import Services.QuanLyService;
import Services.TKService;
import View_Model.QuanLyViewModel;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Form_Admin extends javax.swing.JPanel {
    List<QuanLyViewModel> ListQuanLy;
    QuanLyService quanLySer = new QuanLy_Service_impl();
    DefaultTableModel dtm;
    
    void showDataTable(List<QuanLyViewModel> lst) {
        dtm.setRowCount(0);
        for (QuanLyViewModel x : lst) {
            dtm.addRow(x.toDataRow());
        }
    }
    public Form_Admin() {
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        dtm = (DefaultTableModel) table.getModel();
        ListQuanLy = quanLySer.getALL();
        showDataTable(ListQuanLy);
    }
   
    public void select() {
    dtm.setRowCount(0);   
    List<QuanLyViewModel> quanLyList = quanLySer.select(searchText2.getText().trim());
    showDataTable(quanLyList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        panelBorder2 = new com.raven.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchText2 = new com.raven.swing.SearchText();
        panelBorder3 = new com.raven.swing.PanelBorder();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new com.raven.swing.textField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new com.raven.swing.textField();
        txtNgay = new com.raven.swing.textField();
        txtThang = new com.raven.swing.textField();
        txtNam = new com.raven.swing.textField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTK = new com.raven.swing.textField();
        btnAdd = new javax.swing.JButton();
        btnFix = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtMK = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(915, 600));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Danh sách Admin");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Email", "Name", "Day", "Month", "Year", "Account", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("\"Tất cả mọi thứ đều là con số.\" ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("- Pythagoras");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setText("\"Thần số học sẽ không chỉ cho ta những bí quyết của vũ trụ, mà còn cho ta cả sức mạnh để thay đổi nó.\"");
        jLabel14.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("- Pythagoras");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel16.setText("\"Số học là ngôn ngữ của vũ trụ.\"");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("- Galileo Galilei");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(140, 140, 140))))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        searchText2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(403, 403, 403)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(searchText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 243, 164));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thêm tài khoản ở đây!");

        jLabel8.setText("mm/");

        jLabel9.setText("yy/");

        jLabel10.setText("dd/");

        jLabel3.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel4.setText("Name:");

        jLabel11.setText("Account:");

        jLabel12.setText("Password:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnFix.setText("Fix");
        btnFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 3, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 204, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("IT-Mâgic");

        txtMK.setToolTipText("");
        txtMK.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9))
                            .addGroup(panelBorder3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFix, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMK))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder3Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnFix)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText2KeyReleased
        select();
    }//GEN-LAST:event_searchText2KeyReleased

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixActionPerformed
        StringBuilder sb = new StringBuilder();
        TKService tkSer = new TK_Service_impl();
        QuanLy quanly = new QuanLy();
        if (txtEmail.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Email'");
        } else if (txtName.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tên'");
        } else if (txtNgay.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Ngày'");
        } else if (txtThang.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tháng'");
        } else if (txtNam.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Nam'");
        } else if (txtTK.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tài khoản'");
        } else if (txtMK.getPassword().equals("")) {
            sb.append("Bạn chưa nhập 'Mật khẩu'");
        }

        if (sb.length() > 0) {
            JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String ma = txtEmail.getText();
        String ten = txtName.getText();
        String ngay = txtNgay.getText();
        int ngayInt = Integer.parseInt(ngay);
        String thang = txtThang.getText();
        int thangInt = Integer.parseInt(thang);
        String nam = txtNam.getText();
        int namInt = Integer.parseInt(nam);
        String taikhoan = txtTK.getText();
        String mk = new String(txtMK.getPassword());

        TaiKhoan tk = new TaiKhoan();
        QuanLy quanLy = new QuanLy();

        tk.setTK(taikhoan);
        tk.setMK(mk);
        tkSer.creat(tk);
        quanLy.setMaQL(ma);
        quanLy.setTenQL(ten);
        quanLy.setNgay(ngayInt);
        quanLy.setThang(thangInt);
        quanLy.setNam(namInt);
        quanLy.setFTK(taikhoan);
        //thêm dữ liệu vào danh sách
        quanLySer.update(quanLy, ma);
        ListQuanLy = quanLySer.getALL();
        showDataTable(ListQuanLy);
    }//GEN-LAST:event_btnFixActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
               StringBuilder sb = new StringBuilder();
        
        TKService tkSer = new TK_Service_impl();
        if (txtEmail.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Email'");
        } else if (txtName.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tên'");
        } else if (txtNgay.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Ngày'");
        }else if (txtThang.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tháng'");
        } else if (txtNam.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Nam'");
        } else if (txtTK.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tài khoản'");
        } else if (new String(txtMK.getPassword()).equals("")) {
            sb.append("Bạn chưa nhập 'Mật khẩu'");
        }
        
        
        //
        if (sb.length() > 0) {
            JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String ma = txtEmail.getText();
        String ten = txtName.getText();
        String taikhoan = txtTK.getText();
        String mk = new String(txtMK.getPassword());
        String ngay = txtNgay.getText();
        int ngayInt = Integer.parseInt(ngay);
        String thang = txtThang.getText();
        int thangInt = Integer.parseInt(thang);
        String nam = txtNam.getText();
        int namInt = Integer.parseInt(nam);
        
        TaiKhoan tk = new TaiKhoan();
        QuanLy quanLy = new QuanLy();

        tk.setTK(taikhoan);
        tk.setMK(mk);
        tkSer.creat(tk);

        quanLy.setMaQL(ma);
        quanLy.setTenQL(ten);
        quanLy.setNgay(ngayInt);
        quanLy.setThang(thangInt);
        quanLy.setNam(namInt);
        quanLy.setFTK(taikhoan);
        
        //thêm dữ liệu vào danh sách
        quanLySer.creat(quanLy);
        ListQuanLy = quanLySer.getALL();
        showDataTable(ListQuanLy);

        JOptionPane.showConfirmDialog(this, "Đã thêm thành công");
        txtEmail.setText("");
        txtName.setText("");
        txtNgay.setText("");
        txtThang.setText("");
        txtNam.setText("");
        txtTK.setText("");
        txtMK.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        int count = 0;
        if (txtEmail.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Email'");
        } else if (txtName.getText().equals("")) {
            sb.append("Bạn chưa nhập 'Tên'");
        }

        if (sb.length() > 0) {
            JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (QuanLyViewModel quanLy : ListQuanLy) {

            if (quanLy.getMaQL().equals(txtEmail.getText())) {
                int choice = JOptionPane.showConfirmDialog(this, "Bạnn có muốn xóa không?", "Xác nhận.", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_NO_OPTION) {
                    quanLySer.delete(quanLy.getMaQL());
                    ListQuanLy = quanLySer.getALL();
                    showDataTable(ListQuanLy);
                    JOptionPane.showConfirmDialog(this, "Đã xóa thành công");
                            txtEmail.setText("");
        txtName.setText("");
        txtNgay.setText("");
        txtThang.setText("");
        txtNam.setText("");
        txtTK.setText("");
        txtMK.setText("");
                    return;
                }
                count++;

            }
        }
        if (count == 0) {
            JOptionPane.showConfirmDialog(this, "Không tìm thấy");

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selected = table.getSelectedRow();
        if (selected >= 0) {
            String Name = (String) table.getValueAt(selected, 2);
            for (QuanLyViewModel quanLy : ListQuanLy) {
                if (quanLy.getTenQL().equals(Name)) {

                    txtEmail.setText(quanLy.getMaQL());
                    txtName.setText(quanLy.getTenQL());
                    txtNgay.setText(quanLy.getNgay() + "");
                    txtThang.setText(quanLy.getThang() + "");
                    txtNam.setText(quanLy.getNam() + "");
                    txtTK.setText(quanLy.getTK());
                    txtMK.setText(quanLy.getMK());
                }
            }
        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelBorder panelBorder2;
    private com.raven.swing.PanelBorder panelBorder3;
    private com.raven.swing.SearchText searchText2;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    private com.raven.swing.textField txtEmail;
    private javax.swing.JPasswordField txtMK;
    private com.raven.swing.textField txtNam;
    private com.raven.swing.textField txtName;
    private com.raven.swing.textField txtNgay;
    private com.raven.swing.textField txtTK;
    private com.raven.swing.textField txtThang;
    // End of variables declaration//GEN-END:variables
}
