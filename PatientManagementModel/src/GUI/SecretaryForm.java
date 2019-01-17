/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Controller;
import PatientManagementModel.Appointment;
import PatientManagementModel.Medacine;
import Users.Patient;
import Users.User;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jjbrewer
 */
public class SecretaryForm extends javax.swing.JFrame {
    
    Controller controller;
    private DefaultTableModel accountRequestTableModel, appointmentRequestTableModel, medacineRequestTableModel, accountRemovalTableModel, accountTerminationTableModel;
    /**
     * Creates new form SecretaryForm
     * @param controller
     */
    public SecretaryForm(Controller controller) 
    {
        initComponents();
        this.controller = controller;
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
        resetAppointmentTable();
        resetAccountRemovalTable();
        resetAccountTerminationTable();
        resetMedacinTable();
        
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
     *
     */
    public void resetTable()
    {
        String[] cols = {"ID", "First name", "Surname"};
        accountRequestTableModel = new DefaultTableModel(cols,0);
        
        tblUser.setModel(accountRequestTableModel);
        
        populateTable();
    }
    
    /**
     *
     */
    public void populateTable()
    {
        List<Patient> waitingForApproval = controller.getRequestingAccount();
        if(waitingForApproval != null)
        {
            for(User user : waitingForApproval)
            {
                Object[] obj = {user.getUniqueID(), user.getGivenName(), user.getSurname()};
                accountRequestTableModel.addRow(obj);
            }
        }
    }
    
    /**
     *
     */
    public void resetAppointmentTable()
    {
        String[] cols = {"Suggested by", "Doctor ID", "Patient ID", "Date"};
        appointmentRequestTableModel = new DefaultTableModel(cols,0);
        
        tblAppointments.setModel(appointmentRequestTableModel);
        
        populateAppointmentTable();
    }
    
    /**
     *
     */
    public void populateAppointmentTable()
    {
        List<Appointment> requestedAppointment = controller.getRequestedAppointments();
        if(requestedAppointment != null)
        {
            for(Appointment appointment : requestedAppointment)
            {
                Object[] obj = {appointment.getProposedBy().getUniqueID(), appointment.getDoctor().getUniqueID(), appointment.getPatient().getUniqueID(), appointment.getDate()};
                appointmentRequestTableModel.addRow(obj); 
            }
        }
    }
    
    /**
     *
     */
    public void resetAccountRemovalTable()
    {
        String[] cols = {"ID", "First Name", "Surname"};
        accountRemovalTableModel = new DefaultTableModel(cols,0);
        
        tblRemoveUsers.setModel(accountRemovalTableModel);
        
        populateAccountRemovalTable();
    }
    
    /**
     *
     */
    public void populateAccountRemovalTable()
    {
        List<Patient> patients = controller.getPatients();
        if(patients != null)
        {
            for(Patient patient : patients)
            {
                Object[] obj = {patient.getUniqueID(), patient.getGivenName(), patient.getSurname()};
                accountRemovalTableModel.addRow(obj); 
            }
        }
    }
    
    /**
     *
     */
    public void resetAccountTerminationTable()
    {
        String[] cols = {"ID", "First Name", "Surname"};
        accountTerminationTableModel = new DefaultTableModel(cols,0);
        
        tblRequestedTermination.setModel(accountTerminationTableModel);
        
        populateAccountRemovalTable();
    }
    
    /**
     *
     */
    public void populateAccountTerminationTable()
    {
        List<Patient> requestedAccountTermination = controller.getRequestingTermination();
        if(requestedAccountTermination != null)
        {
            for(Patient patient : requestedAccountTermination)
            {
                Object[] obj = {patient.getUniqueID(), patient.getGivenName(), patient.getSurname()};
                accountTerminationTableModel.addRow(obj); 
            }
        }
    }
    
    /**
     *
     */
    public void resetMedacinTable()
    {
        String[] cols = {"Medacine Name", "Quantity"};
        medacineRequestTableModel = new DefaultTableModel(cols,0);
        
        tblMedacineRequests.setModel(medacineRequestTableModel);
        
        populateMedacinTable();
    }
    
    /**
     *
     */
    public void populateMedacinTable()
    {
        List<Medacine> medacineToRestock = controller.getMedacineToRestockList();
        if(medacineToRestock != null)
        {
            for(Medacine medacine : medacineToRestock)
            {
                Object[] obj = {medacine.getName(), medacine.getStock()};
                medacineRequestTableModel.addRow(obj); 
            }
        }
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblUserID = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnLogOff = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        txtUserIDToApprove = new javax.swing.JTextField();
        btnApproveUserByID = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtDate = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        txtPatient = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCreateAppointment = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtMedacineName = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        spnQuantity = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGiveMedacine = new javax.swing.JButton();
        txtUserID = new javax.swing.JPanel();
        txtUserIDToRemove = new javax.swing.JTextField();
        btnRemoveUserByID = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRequestedTermination = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblRemoveUsers = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUserIDToTerminate = new javax.swing.JTextField();
        btnApproveTermination = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtOrderMedacineName = new javax.swing.JTextField();
        spnOrderQuantity = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnOrderMedacine = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMedacineRequests = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUserID.setText("User ID");

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
                .addContainerGap(687, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserID)
                .addGap(107, 107, 107)
                .addComponent(btnLogOff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Welcome", jPanel1);

        tblUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "First Name", "Surname"
            }
        ));
        jScrollPane2.setViewportView(tblUser);

        txtUserIDToApprove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserIDToApprove.setText("Insert user ID");

        btnApproveUserByID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnApproveUserByID.setText("Approve acoount");
        btnApproveUserByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveUserByIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserIDToApprove)
                    .addComponent(btnApproveUserByID, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtUserIDToApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnApproveUserByID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Account requests", jPanel2);

        tblAppointments.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
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
                "Suggested by", "Doctor", "Patient", "Date"
            }
        ));
        jScrollPane3.setViewportView(tblAppointments);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGap(165, 165, 165)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Requested appointments", jPanel3);

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate.setText("Date");

        txtDoctor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDoctor.setText("Doctor ID");

        txtPatient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPatient.setText("Patient ID");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Create Appointment");

        btnCreateAppointment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateAppointment.setText("Create");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create appointment", jPanel4);

        txtMedacineName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMedacineName.setText("Medacine name");
        txtMedacineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedacineNameActionPerformed(evt);
            }
        });

        txtPatientID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPatientID.setText("Patient ID");
        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });

        spnQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Patient ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Medacine name");

        btnGiveMedacine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGiveMedacine.setText("Give medacine");
        btnGiveMedacine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveMedacineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGiveMedacine, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(txtPatientID)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMedacineName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedacineName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btnGiveMedacine, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Give medacine", jPanel5);

        txtUserIDToRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserIDToRemove.setText("Insert user ID");

        btnRemoveUserByID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemoveUserByID.setText("Remove user by ID");
        btnRemoveUserByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveUserByIDActionPerformed(evt);
            }
        });

        tblRequestedTermination.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblRequestedTermination.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "First Name", "Surname"
            }
        ));
        jScrollPane4.setViewportView(tblRequestedTermination);

        tblRemoveUsers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblRemoveUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "First Name", "Surname"
            }
        ));
        jScrollPane6.setViewportView(tblRemoveUsers);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Requesting termination");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Patients");

        txtUserIDToTerminate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserIDToTerminate.setText("Insert user ID");

        btnApproveTermination.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnApproveTermination.setText("Approve termination");
        btnApproveTermination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveTerminationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtUserIDLayout = new javax.swing.GroupLayout(txtUserID);
        txtUserID.setLayout(txtUserIDLayout);
        txtUserIDLayout.setHorizontalGroup(
            txtUserIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtUserIDLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(txtUserIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserIDToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txtUserIDLayout.createSequentialGroup()
                        .addGroup(txtUserIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserIDToTerminate)
                            .addComponent(btnApproveTermination, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveUserByID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(txtUserIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
            .addGroup(txtUserIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtUserIDLayout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        txtUserIDLayout.setVerticalGroup(
            txtUserIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtUserIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addComponent(txtUserIDToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnRemoveUserByID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtUserIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txtUserIDLayout.createSequentialGroup()
                        .addComponent(txtUserIDToTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnApproveTermination, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(txtUserIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtUserIDLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Account removal", txtUserID);

        txtOrderMedacineName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOrderMedacineName.setText("Medacine name");
        txtOrderMedacineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderMedacineNameActionPerformed(evt);
            }
        });

        spnOrderQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Medacine name");

        btnOrderMedacine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOrderMedacine.setText("Order medacine");
        btnOrderMedacine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderMedacineActionPerformed(evt);
            }
        });

        tblMedacineRequests.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblMedacineRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medacine name", "Quantity"
            }
        ));
        jScrollPane5.setViewportView(tblMedacineRequests);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnOrderMedacine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrderMedacineName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnOrderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrderMedacineName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(btnOrderMedacine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Order medacine", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
        // TODO add your handling code here:
        controller.logOut();
    }//GEN-LAST:event_btnLogOffActionPerformed

    private void btnApproveUserByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveUserByIDActionPerformed
        // TODO add your handling code here:
        controller.approvePatient(txtUserIDToApprove.getText());
        resetTable();
        resetAppointmentTable();
        resetAccountRemovalTable();
        resetAccountTerminationTable();
        resetMedacinTable();
    }//GEN-LAST:event_btnApproveUserByIDActionPerformed

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        // TODO add your handling code here:
        controller.CreateAppointment(txtDoctor.getText(), txtPatient.getText(), txtDate.getText());
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    private void txtMedacineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedacineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedacineNameActionPerformed

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void btnGiveMedacineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveMedacineActionPerformed
        // TODO add your handling code here:
        int quantity = 0;
        try
        {
            spnQuantity.commitEdit();
        }
        catch(java.text.ParseException e)
        {
            quantity = (Integer) spnQuantity.getValue();
        }
        controller.giveMedacine(txtMedacineName.getText(), quantity);
    }//GEN-LAST:event_btnGiveMedacineActionPerformed

    private void txtOrderMedacineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderMedacineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderMedacineNameActionPerformed

    private void btnOrderMedacineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderMedacineActionPerformed
        // TODO add your handling code here:
        int quantity = 0;
        try
        {
            spnOrderQuantity.commitEdit();
        }
        catch(java.text.ParseException e)
        {
            quantity = (Integer) spnOrderQuantity.getValue();
        }
        controller.orderMedacine(txtOrderMedacineName.getText(), quantity);
    }//GEN-LAST:event_btnOrderMedacineActionPerformed

    private void btnRemoveUserByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveUserByIDActionPerformed
        // TODO add your handling code here:
        controller.removeUserByID(txtUserIDToRemove.getText());
        resetTable();
        resetAppointmentTable();
        resetAccountRemovalTable();
        resetAccountTerminationTable();
        resetMedacinTable();
    }//GEN-LAST:event_btnRemoveUserByIDActionPerformed

    private void btnApproveTerminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveTerminationActionPerformed
        // TODO add your handling code here:
        controller.terminateUserByID(txtUserIDToTerminate.getText());
        resetTable();
        resetAppointmentTable();
        resetAccountRemovalTable();
        resetAccountTerminationTable();
        resetMedacinTable();
    }//GEN-LAST:event_btnApproveTerminationActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveTermination;
    private javax.swing.JButton btnApproveUserByID;
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnGiveMedacine;
    private javax.swing.JButton btnLogOff;
    private javax.swing.JButton btnOrderMedacine;
    private javax.swing.JButton btnRemoveUserByID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JSpinner spnOrderQuantity;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JTable tblMedacineRequests;
    private javax.swing.JTable tblRemoveUsers;
    private javax.swing.JTable tblRequestedTermination;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtMedacineName;
    private javax.swing.JTextField txtOrderMedacineName;
    private javax.swing.JTextField txtPatient;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JPanel txtUserID;
    private javax.swing.JTextField txtUserIDToApprove;
    private javax.swing.JTextField txtUserIDToRemove;
    private javax.swing.JTextField txtUserIDToTerminate;
    // End of variables declaration//GEN-END:variables
}
