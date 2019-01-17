/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Controller;
import Users.Doctor;
import Users.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jjbrewer
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    private Controller controller;
    private DefaultTableModel tableModel;
    /**
     * Creates new form LoginRegister
     * @param controller
     */
    public AdminForm(Controller controller) 
    {
        initComponents();
        this.controller = controller;
    }
    
    /**
     *
     */
    public void resetTable()
    {
        String[] cols = {"ID", "Job", "First name", "Surname"};
        tableModel = new DefaultTableModel(cols,0);
        
        tblUser.setModel(tableModel);
        
        populateTable();
    }
    
    /**
     *
     */
    public void populateTable()
    {
        List<User> doctorList = controller.getDoctors();
        List<User> secretaryList = controller.getSecretaries();
        if(doctorList != null)
        {
            for(User user : doctorList)
            {
                Object[] obj = {user.getUniqueID(), "Doctor", user.getGivenName(), user.getSurname()};
                tableModel.addRow(obj);
            }
        }
        if(secretaryList != null)
        {
            for(User user : secretaryList)
            {
                Object[] obj = {user.getUniqueID(), "Doctor", user.getGivenName(), user.getSurname()};
                tableModel.addRow(obj);
            }
        }
    }
    
    /**
     *
     */
    public void populateComboBox()
    {
        
        List<User> doctors = controller.getDoctors();
        List<String> ls = new ArrayList<String>();
        if(doctors != null)
        {
            for(User user : doctors)
            {
                ls.add(user.getGivenName() + " " + user.getSurname());
            }

            cbxDoctors.setModel(new DefaultComboBoxModel(ls.toArray()));
        }
    }
    
    /**
     *
     */
    public void populateFeedbackComboBox()
    {
        
        List<User> doctors = controller.getDoctors();
        List<String> ls = new ArrayList<String>();
        
        if(doctors != null)
        {
            for(User user : doctors)
            {
                ls.add(user.getGivenName() + " " + user.getSurname());
            }

            cbxDoctorsFeedback.setModel(new DefaultComboBoxModel(ls.toArray()));
        }
    }
    
    /**
     *
     */
    public void removeByID()
    {
        controller.removeUserByID(txtUserIDToRemove.getText());
    }
    
    /**
     *
     * @param ID
     */
    public void showGeneratedDoctorID(String ID)
    {
        lblDoctorID.setText(ID);
    }
    
    /**
     *
     * @param ID
     */
    public void showGeneratedSecretaryID(String ID)
    {
        lblSecretaryID.setText(ID);
    }
    
    /**
     *
     */
    public void setWelcomePage()
    {
        User user = controller.populateWelcomePage();
        lblName.setText("Name: " + user.getGivenName());
        lblSurname.setText("Surname: " + user.getSurname());
        lblUserID.setText("User ID: " + user.getUniqueID());
        
        resetTable();
        populateComboBox();
        populateFeedbackComboBox();
        
        if(user.getNotifications().size() > 0)
        {
            for(String notificationMessage : user.getNotifications())
            {
                MessagePopUp(notificationMessage);
            }
        }
        
        resetTable();
    }
    
    /**
     *
     * @param message
     */
    public void MessagePopUp(String message)
    {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblSurname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnLogOff = new javax.swing.JButton();
        lblUserID = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        txtUserIDToRemove = new javax.swing.JTextField();
        btnRemoveUserByID = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbxDoctors = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDocRatings = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cbxDoctorsFeedback = new javax.swing.JComboBox<>();
        txtDoctorFeedback = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDoctorSurname = new javax.swing.JTextField();
        btnCreateDoctor = new javax.swing.JButton();
        txtDoctorName = new javax.swing.JTextField();
        txtDoctorAdress = new javax.swing.JTextField();
        lblDoctorID = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSecretarySurname = new javax.swing.JTextField();
        btnCreateSecretary = new javax.swing.JButton();
        txtSecretaryName = new javax.swing.JTextField();
        txtSecretaryAdress = new javax.swing.JTextField();
        lblSecretaryID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSecretaryPassword = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblSurname.setText("Surname");

        jLabel6.setText("Account Info");

        lblName.setText("Name");

        btnLogOff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogOff.setText("Log off");
        btnLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOffActionPerformed(evt);
            }
        });

        lblUserID.setText("User ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOff, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lblSurname)
                    .addComponent(jLabel6)
                    .addComponent(lblUserID))
                .addContainerGap(785, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserID)
                .addGap(85, 85, 85)
                .addComponent(btnLogOff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Welcome", jPanel1);

        tblUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Job Title", "First Name", "Surname"
            }
        ));
        jScrollPane2.setViewportView(tblUser);

        txtUserIDToRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserIDToRemove.setText("Insert user ID");

        btnRemoveUserByID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemoveUserByID.setText("Remove user by ID");
        btnRemoveUserByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveUserByIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserIDToRemove)
                    .addComponent(btnRemoveUserByID, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtUserIDToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnRemoveUserByID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Remove accounts", jPanel2);

        cbxDoctors.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxDoctors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxDoctors.setToolTipText("List of doctors");
        cbxDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDoctorsActionPerformed(evt);
            }
        });

        txtAreaDocRatings.setColumns(20);
        txtAreaDocRatings.setRows(5);
        jScrollPane3.setViewportView(txtAreaDocRatings);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Doctor ratings", jPanel3);

        cbxDoctorsFeedback.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxDoctorsFeedback.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxDoctorsFeedback.setToolTipText("List of doctors");
        cbxDoctorsFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDoctorsFeedbackActionPerformed(evt);
            }
        });

        txtDoctorFeedback.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDoctorFeedback.setText("Write doctor feed back here");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Submit Feedback");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDoctorFeedback)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbxDoctorsFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxDoctorsFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(txtDoctorFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Give feedback", jPanel4);

        jLabel13.setText("Address:");

        jLabel14.setText("Password:");

        txtDoctorSurname.setToolTipText("");
        txtDoctorSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorSurnameActionPerformed(evt);
            }
        });

        btnCreateDoctor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.setActionCommand("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        txtDoctorName.setToolTipText("");
        txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorNameActionPerformed(evt);
            }
        });

        txtDoctorAdress.setToolTipText("");
        txtDoctorAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorAdressActionPerformed(evt);
            }
        });

        lblDoctorID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDoctorID.setText("Doctor ID is:");

        jLabel10.setText("Name:");

        jLabel11.setText("Surname:");

        txtDoctorPassword.setToolTipText("");
        txtDoctorPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPasswordActionPerformed(evt);
            }
        });

        jLabel15.setText("Password:");

        txtSecretarySurname.setToolTipText("");
        txtSecretarySurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecretarySurnameActionPerformed(evt);
            }
        });

        btnCreateSecretary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateSecretary.setText("Create Secretary");
        btnCreateSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSecretaryActionPerformed(evt);
            }
        });

        txtSecretaryName.setToolTipText("");
        txtSecretaryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecretaryNameActionPerformed(evt);
            }
        });

        txtSecretaryAdress.setToolTipText("");
        txtSecretaryAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecretaryAdressActionPerformed(evt);
            }
        });

        lblSecretaryID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSecretaryID.setText("Secretary ID is:");

        jLabel12.setText("Name:");

        jLabel16.setText("Surname:");

        jLabel17.setText("Address:");

        txtSecretaryPassword.setToolTipText("");
        txtSecretaryPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecretaryPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnCreateDoctor)
                        .addGap(18, 18, 18)
                        .addComponent(lblDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnCreateSecretary)
                        .addGap(18, 18, 18)
                        .addComponent(lblSecretaryID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSecretaryPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSecretaryAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSecretarySurname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSecretaryName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtDoctorSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctorAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtSecretaryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtSecretarySurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSecretaryAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSecretaryPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDoctorID))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCreateSecretary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSecretaryID)))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Add account", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDoctorsActionPerformed
        // TODO add your handling code here:
        int index = cbxDoctors.getSelectedIndex();
        String ID = String.format("D%04d", index);
        Doctor doctor = controller.getDoctorByID(ID);
        List<String> ratings = controller.getDoctorRatings(doctor);
        for(String rating : ratings)
        {
            txtAreaDocRatings.append(rating + "\n");
        }
    }//GEN-LAST:event_cbxDoctorsActionPerformed

    private void txtDoctorPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorPasswordActionPerformed

    private void txtDoctorAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorAdressActionPerformed

    private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorNameActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        controller.CreateDoctor(txtDoctorName.getText(), txtDoctorSurname.getText(), txtDoctorAdress.getText(), txtDoctorPassword.getText());
        populateTable();
        populateComboBox();
        populateFeedbackComboBox();
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void txtDoctorSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorSurnameActionPerformed

    private void txtSecretarySurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecretarySurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecretarySurnameActionPerformed

    private void btnCreateSecretaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSecretaryActionPerformed
        // TODO add your handling code here:
        controller.CreateSecretary(txtSecretaryName.getText(), txtSecretarySurname.getText(), txtSecretaryAdress.getText(), txtSecretaryPassword.getText());
        populateTable();
    }//GEN-LAST:event_btnCreateSecretaryActionPerformed

    private void txtSecretaryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecretaryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecretaryNameActionPerformed

    private void txtSecretaryAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecretaryAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecretaryAdressActionPerformed

    private void txtSecretaryPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecretaryPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecretaryPasswordActionPerformed

    private void cbxDoctorsFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDoctorsFeedbackActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int index = cbxDoctors.getSelectedIndex();
        String ID = String.format("D%04d", index);
        Doctor doctor = controller.getDoctorByID(ID);
        controller.submitFeedback(txtDoctorFeedback.getText(), doctor);
    }//GEN-LAST:event_cbxDoctorsFeedbackActionPerformed

    private void btnRemoveUserByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveUserByIDActionPerformed
        // TODO add your handling code here:
        controller.removeUserByID(txtUserIDToRemove.getText());
        resetTable();
        populateComboBox();
        populateFeedbackComboBox();
    }//GEN-LAST:event_btnRemoveUserByIDActionPerformed

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
        // TODO add your handling code here:
        controller.logOut();
    }//GEN-LAST:event_btnLogOffActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreateSecretary;
    private javax.swing.JButton btnLogOff;
    private javax.swing.JButton btnRemoveUserByID;
    private javax.swing.JComboBox<String> cbxDoctors;
    private javax.swing.JComboBox<String> cbxDoctorsFeedback;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDoctorID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSecretaryID;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextArea txtAreaDocRatings;
    private javax.swing.JTextField txtDoctorAdress;
    private javax.swing.JTextField txtDoctorFeedback;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorSurname;
    private javax.swing.JTextField txtSecretaryAdress;
    private javax.swing.JTextField txtSecretaryName;
    private javax.swing.JTextField txtSecretaryPassword;
    private javax.swing.JTextField txtSecretarySurname;
    private javax.swing.JTextField txtUserIDToRemove;
    // End of variables declaration//GEN-END:variables
}
