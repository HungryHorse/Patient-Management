/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementproject;

import PatientManagementModel.*;

/**
 *
 * @author jjbrewer
 */
public class PatientManagementProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        AccountManagement accountManager = new AccountManagement();
        MedacineManager medacineManager = accountManager.getMedacineManager();
        Controller.Controller controller  = new Controller.Controller(accountManager, medacineManager);
    }
    
}
