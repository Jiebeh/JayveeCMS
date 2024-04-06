package Forms;

import Libraries.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * @author Jiebeh
 */
public class contactsForm extends javax.swing.JFrame {

    public String imagePath = null;
    public JLabel userId = new JLabel();

    public contactsForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPicture = new javax.swing.JLabel();
        lbContacts = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        tbxFirstName = new javax.swing.JTextField();
        lbFirstName = new javax.swing.JLabel();
        tbxLastName = new javax.swing.JTextField();
        lbFirstName1 = new javax.swing.JLabel();
        lbFirstName2 = new javax.swing.JLabel();
        tbxPhone = new javax.swing.JTextField();
        tbxEmail = new javax.swing.JTextField();
        lbFirstName3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbFirstName4 = new javax.swing.JLabel();
        cbLabel = new javax.swing.JComboBox();
        lbUsername3 = new javax.swing.JLabel();
        lbContactPicture = new javax.swing.JLabel();
        btnBrowseImage = new javax.swing.JButton();
        lbUsername4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbxAddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContacts = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lbFirstName5 = new javax.swing.JLabel();
        tbxContactId = new javax.swing.JTextField();
        btnFirstItem = new javax.swing.JButton();
        btnPreviousItem = new javax.swing.JButton();
        btnLastItem = new javax.swing.JButton();
        btnNextItem = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

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

        lbUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(153, 153, 153));
        lbUsername.setText("username");

        lbPicture.setBackground(new java.awt.Color(153, 153, 153));
        lbPicture.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbPicture.setForeground(new java.awt.Color(255, 255, 255));
        lbPicture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPicture.setOpaque(true);
        lbPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPicture_clicked(evt);
            }
        });

        lbContacts.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbContacts.setForeground(new java.awt.Color(255, 255, 255));
        lbContacts.setText("Contacts");

        btnLogout.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 102, 102));
        btnLogout.setText("[Logout]");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogout_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbUsername)
                .addGap(159, 159, 159)
                .addComponent(lbContacts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbContacts, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(lbPicture, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbxFirstName.setBackground(new java.awt.Color(204, 204, 204));

        lbFirstName.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName.setText("First Name");

        tbxLastName.setBackground(new java.awt.Color(204, 204, 204));

        lbFirstName1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName1.setText("Last Name");

        lbFirstName2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName2.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName2.setText("Phone");

        tbxPhone.setBackground(new java.awt.Color(204, 204, 204));

        tbxEmail.setBackground(new java.awt.Color(204, 204, 204));

        lbFirstName3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName3.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName3.setText("Email");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbFirstName4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName4.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName4.setText("Group");

        cbLabel.setBackground(new java.awt.Color(204, 204, 204));
        cbLabel.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        cbLabel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Family", "Friends", "Work" }));

        lbUsername3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbUsername3.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername3.setText("Picture");

        lbContactPicture.setBackground(new java.awt.Color(153, 153, 153));
        lbContactPicture.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbContactPicture.setForeground(new java.awt.Color(255, 255, 255));
        lbContactPicture.setText(" ");
        lbContactPicture.setOpaque(true);

        btnBrowseImage.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowseImage.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnBrowseImage.setText("...");
        btnBrowseImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrowseImage_clicked(evt);
            }
        });

        lbUsername4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbUsername4.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername4.setText("Address");

        tbxAddress.setBackground(new java.awt.Color(204, 204, 204));
        tbxAddress.setColumns(20);
        tbxAddress.setLineWrap(true);
        tbxAddress.setRows(5);
        jScrollPane1.setViewportView(tbxAddress);

        tblContacts.setBackground(new java.awt.Color(204, 204, 204));
        tblContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContacts_clicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblContacts);

        btnAdd.setBackground(new java.awt.Color(51, 153, 255));
        btnAdd.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdd_clicked(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 255, 102));
        btnUpdate.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdate_clicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelete_clicked(evt);
            }
        });

        lbFirstName5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lbFirstName5.setForeground(new java.awt.Color(255, 255, 255));
        lbFirstName5.setText("ID");

        tbxContactId.setBackground(new java.awt.Color(51, 51, 51));
        tbxContactId.setForeground(new java.awt.Color(255, 255, 255));
        tbxContactId.setEnabled(false);

        btnFirstItem.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnFirstItem.setText("<<");
        btnFirstItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFirstItem_clicked(evt);
            }
        });

        btnPreviousItem.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnPreviousItem.setText("<");
        btnPreviousItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPreviousItem_clicked(evt);
            }
        });

        btnLastItem.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnLastItem.setText(">>");
        btnLastItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLastItem_clicked(evt);
            }
        });

        btnNextItem.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnNextItem.setText(">");
        btnNextItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextItem_clicked(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 255, 204));
        btnClear.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClear_clicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbFirstName5)
                                .addComponent(lbFirstName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tbxFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbxContactId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbFirstName1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbxLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbFirstName2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbxPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbFirstName4)
                                        .addComponent(lbFirstName3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnClear))
                                        .addComponent(tbxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnFirstItem, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPreviousItem)
                        .addGap(14, 14, 14)
                        .addComponent(btnNextItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLastItem, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbUsername4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbUsername3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbContactPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbContactPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUsername3)
                                    .addComponent(btnBrowseImage))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUsername4))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbFirstName5)
                                    .addComponent(tbxContactId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                    .addComponent(tbxPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbFirstName3)
                                    .addComponent(tbxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbFirstName4)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnFirstItem)
                                    .addComponent(btnPreviousItem)
                                    .addComponent(btnLastItem)
                                    .addComponent(btnNextItem))))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClose_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose_clicked
        System.exit(0);
    }//GEN-LAST:event_btnClose_clicked

    private void btnMinimize_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimize_clicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimize_clicked

    private void btnBrowseImage_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrowseImage_clicked
        imagePath = Methods.browseImage(lbContactPicture);
    }//GEN-LAST:event_btnBrowseImage_clicked

    private void btnAdd_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd_clicked
        if (!validateFields()) {
            return;
        }
        
        Libraries.contact contact = new Libraries.contact();
        contact.firstName = tbxFirstName.getText();
        contact.lastName = tbxLastName.getText();
        contact.label = cbLabel.getSelectedItem().toString();
        contact.phone = tbxPhone.getText();
        contact.email = tbxEmail.getText();
        contact.address = tbxAddress.getText();
        contact.userId = Integer.parseInt(userId.getText());

        try {
            if (imagePath != null) {
                contact.picture = Files.readAllBytes(Paths.get(imagePath));
            } else {
                contact.picture = new byte[0];
            }
        } catch (IOException e) {
            Logger.getLogger(contactsForm.class.getName()).log(Level.SEVERE, null, e);
        }

        contact.id = Connections.insertContact(contact);
        refreshTable();
        selectIndex(tblContacts.getRowCount() - 1);
    }//GEN-LAST:event_btnAdd_clicked

    private void tblContacts_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContacts_clicked
        selectIndex(getSelectedIndex());
    }//GEN-LAST:event_tblContacts_clicked

    private void btnUpdate_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate_clicked
        if (tbxContactId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "There is no selected contact", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!validateFields()) {
            return;
        }
        
        Libraries.contact contact = new Libraries.contact();

        contact.id = Integer.parseInt(tbxContactId.getText());
        contact.firstName = tbxFirstName.getText();
        contact.lastName = tbxLastName.getText();
        contact.label = cbLabel.getSelectedItem().toString();
        contact.phone = tbxPhone.getText();
        contact.email = tbxEmail.getText();
        contact.address = tbxAddress.getText();
        contact.userId = getUserId();
        contact.picture = new byte[0];

        try {
            if (imagePath != null) {
                contact.picture = Files.readAllBytes(Paths.get(imagePath));
                imagePath = null;
            }
        } catch (IOException e) {
            Logger.getLogger(contactsForm.class.getName()).log(Level.SEVERE, null, e);
        }

        Connections.updateContact(contact);
        int lastIndex = getSelectedIndex();
        refreshTable();
        selectIndex(lastIndex);
    }//GEN-LAST:event_btnUpdate_clicked

    private void btnDelete_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelete_clicked
        if (getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "There is no selected contact", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Connections.deleteContact(getContactId());
        clearFields();
        refreshTable();
    }//GEN-LAST:event_btnDelete_clicked

    private void btnFirstItem_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstItem_clicked
        selectIndex(0);
    }//GEN-LAST:event_btnFirstItem_clicked

    private void btnPreviousItem_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreviousItem_clicked
        if (getSelectedIndex() > 0) {
            selectIndex(setSelectedIndex(-1));
        }
    }//GEN-LAST:event_btnPreviousItem_clicked

    private void btnNextItem_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextItem_clicked
        if (getSelectedIndex() < tblContacts.getRowCount() - 1) {
            selectIndex(setSelectedIndex(1));
        }
    }//GEN-LAST:event_btnNextItem_clicked

    private void btnLastItem_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastItem_clicked
        selectIndex(tblContacts.getRowCount() - 1);
    }//GEN-LAST:event_btnLastItem_clicked

    private void btnLogout_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogout_clicked
        loginForm login = new loginForm();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogout_clicked

    private void lbPicture_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPicture_clicked
        Connections.updateUserPicture(getUserId(), Methods.browseImage(lbPicture));
    }//GEN-LAST:event_lbPicture_clicked

    private void btnClear_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClear_clicked
        tblContacts.clearSelection();
        clearFields();
    }//GEN-LAST:event_btnClear_clicked

    private int getUserId() {
        return Integer.parseInt(userId.getText());
    }

    private int getContactId() {
        return (Integer) tblContacts.getValueAt(getSelectedIndex(), 0);
    }
    
    private int getSelectedIndex() {
        return tblContacts.getSelectedRow();
    }
    
    private int setSelectedIndex(int changes) {
        tblContacts.setRowSelectionInterval(getSelectedIndex() + changes, getSelectedIndex() + changes);
        return getSelectedIndex();
    }
    
    private void selectIndex(Integer index) {
        if (index == -1 || index == null) {
            return;
        }
        
        btnAdd.setEnabled(false);
        tblContacts.setRowSelectionInterval(index, index);
        tbxContactId.setText(tblContacts.getValueAt(index, 0).toString());
        tbxFirstName.setText(tblContacts.getValueAt(index, 1).toString());
        tbxLastName.setText(tblContacts.getValueAt(index, 2).toString());
        cbLabel.setSelectedItem(tblContacts.getValueAt(index, 3).toString());
        tbxPhone.setText(tblContacts.getValueAt(index, 4).toString());
        tbxEmail.setText(tblContacts.getValueAt(index, 5).toString());
        tbxAddress.setText(tblContacts.getValueAt(index, 6).toString());
        lbContactPicture.setIcon(Methods.resizePicture(Connections.getImage(getContactId()), lbContactPicture.getWidth(), lbContactPicture.getHeight()));
    }
    
    private boolean validateFields() {
        if (tbxContactId.getText() == null) {
            JOptionPane.showMessageDialog(null, "You cannot add the same id", "", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if (tbxFirstName.getText().equals("") || tbxLastName.getText().equals("") ||
                tbxPhone.getText().equals("") || tbxEmail.getText().equals("") ||
                tbxAddress.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Please fill all fields", "", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private void clearFields() {
        tbxContactId.setText("");
        tbxFirstName.setText("");
        tbxLastName.setText("");
        tbxPhone.setText("");
        tbxEmail.setText("");
        cbLabel.setSelectedIndex(0);
        tbxAddress.setText("");
        lbContactPicture.setIcon(null);
        btnAdd.setEnabled(true);
    }
    
    public void refreshTable() {
        tblContacts.setModel(new DefaultTableModel());
        Methods.populateTable(tblContacts, getUserId());
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
            java.util.logging.Logger.getLogger(contactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new contactsForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBrowseImage;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirstItem;
    private javax.swing.JButton btnLastItem;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JButton btnNextItem;
    private javax.swing.JButton btnPreviousItem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbContactPicture;
    private javax.swing.JLabel lbContacts;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbFirstName1;
    private javax.swing.JLabel lbFirstName2;
    private javax.swing.JLabel lbFirstName3;
    private javax.swing.JLabel lbFirstName4;
    private javax.swing.JLabel lbFirstName5;
    public javax.swing.JLabel lbPicture;
    public javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsername3;
    private javax.swing.JLabel lbUsername4;
    public javax.swing.JTable tblContacts;
    private javax.swing.JTextArea tbxAddress;
    private javax.swing.JTextField tbxContactId;
    private javax.swing.JTextField tbxEmail;
    private javax.swing.JTextField tbxFirstName;
    private javax.swing.JTextField tbxLastName;
    private javax.swing.JTextField tbxPhone;
    // End of variables declaration//GEN-END:variables
}
