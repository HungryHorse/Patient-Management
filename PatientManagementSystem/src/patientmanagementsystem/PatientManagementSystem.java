/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;
import Users.*;
import PatientManagementModel.*;
import Controller.*;

/**
 *
 * @author jjbrewer
 */
public class PatientManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        AccountManagement accountManager = new AccountManagement();
        MedacineManager medacineManager = accountManager.getMedacineManager();
        Controller controller = new Controller(accountManager, medacineManager);
    }
    
}
