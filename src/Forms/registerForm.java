package Forms;

import Libraries.*;
/**
 * @author Jiebeh
 */
public class registerForm extends javax.swing.JFrame {

    public static String imagePath;

    public registerForm() {
        initComponents();

        tbxPassword.setEchoChar('•');
        tbxConfirmPassword.setEchoChar('•');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        lbCreateNewAccount = new javax.swing.JLabel();
        lbFirstName = new javax.swing.JLabel();
        tbxFirstName = new javax.swing.JTextField();
        tbxLastName = new javax.swing.JTextField();
        lbFirstName1 = new javax.swing.JLabel();
        tbxUsername = new javax.swing.JTextField();
        lbFirstName2 = new javax.swing.JLabel();
        tbxPassword = new javax.swing.JPasswordField();
        lbUsername1 = new javax.swing.JLabel();
        lbUsername2 = new javax.swing.JLabel();
        tbxConfirmPassword = new javax.swing.JPasswordField();
        lbUsername3 = new javax.swing.JLabel();
        lbPicture = new javax.swing.JLabel();
        btnBrowseImage = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(347, 40));

        btnClose.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClose_clicked(evt);
            }
        });

        btnMinimize.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setText("−");
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimize_clicked(evt);
            }
        });

        lbCreateNewAccount.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbCreateNewAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbCreateNewAccount.setText("Create New Account");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbCreateNewAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCreateNewAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(btnMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbFirstName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName.setText("First Name");

        tbxFirstName.setBackground(new java.awt.Color(204, 204, 204));

        tbxLastName.setBackground(new java.awt.Color(204, 204, 204));

        lbFirstName1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName1.setText("Last Name");

        tbxUsername.setBackground(new java.awt.Color(204, 204, 204));

        lbFirstName2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName2.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName2.setText("Username");

        tbxPassword.setBackground(new java.awt.Color(204, 204, 204));

        lbUsername1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbUsername1.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername1.setText("Password");

        lbUsername2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbUsername2.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername2.setText("Confirm Pass");

        tbxConfirmPassword.setBackground(new java.awt.Color(204, 204, 204));

        lbUsername3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbUsername3.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername3.setText("Picture");

        lbPicture.setBackground(new java.awt.Color(153, 153, 153));
        lbPicture.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbPicture.setForeground(new java.awt.Color(255, 255, 255));
        lbPicture.setText(" ");
        lbPicture.setOpaque(true);

        btnBrowseImage.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowseImage.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnBrowseImage.setText("...");
        btnBrowseImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrowseImage_clicked(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(51, 153, 255));
        btnCreate.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreate_clicked(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancel_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbUsername1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbFirstName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tbxFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbFirstName1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tbxLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbFirstName2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tbxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUsername3)
                            .addComponent(lbUsername2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbxConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFirstName)
                    .addComponent(tbxFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFirstName1)
                    .addComponent(tbxLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFirstName2)
                    .addComponent(tbxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername3)
                    .addComponent(btnBrowseImage))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClose_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose_clicked
        System.exit(0);
    }//GEN-LAST:event_btnClose_clicked

    private void btnMinimize_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimize_clicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimize_clicked

    private void btnCreate_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreate_clicked
        if (Connections.register(
                tbxFirstName.getText(),
                tbxLastName.getText(),
                tbxUsername.getText(),
                String.valueOf(tbxPassword.getPassword()),
                String.valueOf(tbxConfirmPassword.getPassword()),
                imagePath)) {
            
            login();
            this.dispose();
        }
    }//GEN-LAST:event_btnCreate_clicked

    private void btnCancel_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancel_clicked
        login();
    }//GEN-LAST:event_btnCancel_clicked

    private void btnBrowseImage_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrowseImage_clicked
        imagePath = Methods.browseImage(lbPicture);
    }//GEN-LAST:event_btnBrowseImage_clicked

    private void login() {
        loginForm login = new loginForm();
        login.setVisible(true);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new registerForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseImage;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCreateNewAccount;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbFirstName1;
    private javax.swing.JLabel lbFirstName2;
    private javax.swing.JLabel lbPicture;
    private javax.swing.JLabel lbUsername1;
    private javax.swing.JLabel lbUsername2;
    private javax.swing.JLabel lbUsername3;
    private javax.swing.JPasswordField tbxConfirmPassword;
    private javax.swing.JTextField tbxFirstName;
    private javax.swing.JTextField tbxLastName;
    private javax.swing.JPasswordField tbxPassword;
    private javax.swing.JTextField tbxUsername;
    // End of variables declaration//GEN-END:variables
}
