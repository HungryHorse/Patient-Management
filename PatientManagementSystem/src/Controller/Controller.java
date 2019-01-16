/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import GUI.*;
import PatientManagementModel.*;
import Users.*;

/**
 *
 * @author jjbrewer
 */
public class Controller 
{
    private LoginRegister loginPanel = new LoginRegister(this);
    private PatientForm patientPanel;
    private DoctorForm doctorPanel;
    private SecretaryForm secretaryPanel;
    private AdminForm adminPanel;
    private AccountManagement accountManager;
    private MedacineManager medacineManager;

    public Controller(AccountManagement accountManager, MedacineManager medacineManager) 
    {
        this.accountManager = accountManager;
        this.medacineManager = medacineManager;
        loginPanel.setVisible(true);
    }
    
    public void LoginBtnPressed(String ID, String Password)
    {
        Boolean loginSuccess = false;
        User user = null;
        
        user = accountManager.findByID(ID);
        
        if(user != null)
        {
            if(user.getPassword().equals(Password))
            {
                loginSuccess = true;
            }
            
            
            if(loginSuccess)
            {
                switch (accountManager.findIDType(user))
                {
                    case 'P':
                        loginPanel.setVisible(false);
                        patientPanel.setVisible(true);
                        break;
                    case 'D':
                        loginPanel.setVisible(false);
                        doctorPanel.setVisible(true);
                        break;
                    case 'S':
                        loginPanel.setVisible(false);
                        secretaryPanel.setVisible(true);
                        break;
                    case 'A':
                        loginPanel.setVisible(false);
                        adminPanel.setVisible(true);
                        break;
                }
            }
            else
            {
                loginPanel.MessagePopUp("Incorrect password");
            }
        }
        else
        {
            loginPanel.MessagePopUp("Account does not yet exist");            
        }
    }
    
    public void registerBtnPressed(String name, String surname, int age, String address, String gender, String password)
    {
        Patient newPatient = new Patient(password, name, surname, address, age, gender, accountManager);
        accountManager.requestAccount(newPatient);
        loginPanel.showGeneratedIDUser(newPatient.getUniqueID());
    }
    
    public void registerAdminBtnPressed(String name, String surname, String address, String password, String adminPass)
    {
        if(adminPass.equals(accountManager.getAdminPass()))
        {
            Admin newAdmin = new Admin(accountManager, medacineManager, password, name, surname, address);
            accountManager.createAdmin(newAdmin);
            loginPanel.showGeneratedIDAdmin(newAdmin.getUniqueID());
        }
        else
        {
            loginPanel.MessagePopUp("Invalid admin pass");
        }
    }
    
    
    
    
}
