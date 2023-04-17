
package Views;

import DomainModels.TaiKhoan;
import DomainModels.User;
import Service.impl.TK_Service_impl;
import Utilities.Auth;
import Service.impl.User_Service_impl;
import Services.TKService;
import Services.UserService;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JDialog {

    UserService userService = new User_Service_impl();
    TKService tkService = new  TK_Service_impl();
            
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDangNhap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMK = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Login");

        txtDangNhap.setText("Đăng nhập");
        txtDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDangNhapActionPerformed(evt);
            }
        });

        jLabel2.setText("Tài khoản:");

        jLabel3.setText("Mật khẩu:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMK))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel1))
                                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(txtDangNhap)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(txtDangNhap)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDangNhapActionPerformed
        dangNhap();
    }//GEN-LAST:event_txtDangNhapActionPerformed
    public void dangNhap() {
        try {
            String taiKhoan = txtTK.getText();
            String pass = new String(txtMK.getPassword());
            User user = userService.getOne(taiKhoan); 
            TaiKhoan tk = tkService.getOne(taiKhoan);
            StringBuilder sb = new StringBuilder();
           
            if (txtTK.getText().equals("")) {
                sb.append("Bạn chưa nhập 'Tài khoản'");
            } else if (txtMK.getPassword().equals("")) {
                sb.append("Bạn chưa nhập 'Mật khẩu'");
            } else if (user == null) {
                sb.append("Sai 'Tài khoản'");
            } else if (!pass.equals(tk.getMK())) {
                sb.append("Sai 'Mật khẩu'");
            } else if (sb.length() > 0) {
                JOptionPane.showConfirmDialog(this, sb.toString(), "ERROR!", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                Auth.user = user;
                this.dispose();
                TrangChu trangChu = new TrangChu();
                trangChu.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);

                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton txtDangNhap;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtTK;
    // End of variables declaration//GEN-END:variables
}
