
package com.raven.form;

import Service.impl.TTNhap_Service_impl;
import View_Model.TTNhapViewModel;
import com.raven.component.Funtion;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import Services.TTNhapService;

public class Form_User extends javax.swing.JPanel {
    List<TTNhapViewModel> ListTT;
    TTNhapService ttSer = new TTNhap_Service_impl();
    DefaultTableModel dtm;
    
    void showDataTable(List<TTNhapViewModel> lst) {
        dtm.setRowCount(0);
        for (TTNhapViewModel x : lst) {
            dtm.addRow(x.toDataRow());
        }
    }
    public Form_User() {
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        dtm = (DefaultTableModel) table.getModel();
        ListTT = ttSer.getALL();
        showDataTable(ListTT);
    }

    public void select() {
        dtm.setRowCount(0);
        if (searchText1.getText().equals("")) {
            List<TTNhapViewModel> userList = ttSer.select(searchText2.getText().trim());
            showDataTable(userList);
        } else {
            List<TTNhapViewModel> userList = ttSer.select(searchText1.getText().trim());
            showDataTable(userList);
        }

    }
    public void SortName() {
        dtm.setRowCount(0);
            List<TTNhapViewModel> userList = ttSer.SortName(Nam1.getText().trim(), Nam2.getText().trim());
            showDataTable(userList);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searchText1 = new com.raven.swing.SearchText();
        panelBorder12 = new com.raven.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nam1 = new javax.swing.JTextField();
        searchText2 = new com.raven.swing.SearchText();
        jLabel6 = new javax.swing.JLabel();
        Nam2 = new javax.swing.JTextField();
        button1 = new com.raven.swing.Button();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Danh sách Admin");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Email", "Họ Tên", "Ngày", "Tháng", "Năm", "Giới tính", "SDT", "Tài khoản", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        searchText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchText1ActionPerformed(evt);
            }
        });
        searchText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(403, 403, 403)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(searchText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBorder12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Lấy giá trị theo năm");

        jLabel5.setText("Nút thêm người dùng");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        Nam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nam1ActionPerformed(evt);
            }
        });
        Nam1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nam1KeyReleased(evt);
            }
        });

        searchText2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        searchText2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText2KeyReleased(evt);
            }
        });

        jLabel6.setText("Lọc thông tin theo tên");

        button1.setText("button1");

        javax.swing.GroupLayout panelBorder12Layout = new javax.swing.GroupLayout(panelBorder12);
        panelBorder12.setLayout(panelBorder12Layout);
        panelBorder12Layout.setHorizontalGroup(
            panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder12Layout.createSequentialGroup()
                .addGroup(panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchText2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panelBorder12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(panelBorder12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(panelBorder12Layout.createSequentialGroup()
                                .addComponent(Nam1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Nam2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(panelBorder12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelBorder12Layout.setVerticalGroup(
            panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelBorder12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyReleased
    select();
    }//GEN-LAST:event_searchText1KeyReleased

    private void searchText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchText1ActionPerformed

    private void searchText2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText2KeyReleased
        select();
    }//GEN-LAST:event_searchText2KeyReleased

    private void Nam1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nam1KeyReleased
        select();
    }//GEN-LAST:event_Nam1KeyReleased

    private void Nam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nam1ActionPerformed

    }//GEN-LAST:event_Nam1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Funtion funtion = new Funtion();
        funtion.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_User().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nam1;
    private javax.swing.JTextField Nam2;
    private com.raven.swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.raven.swing.PanelBorder panelBorder1;
    private com.raven.swing.PanelBorder panelBorder12;
    private com.raven.swing.SearchText searchText1;
    private com.raven.swing.SearchText searchText2;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
