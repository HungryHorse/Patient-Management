/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package patientmanagementproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import PatientManagementModel.*;
import Users.*;

/**
 *
 * @author jjbrewer
 */
public class PatientManagementProject{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        AccountManagement accountManager = new AccountManagement();
        MedacineManager medacineManager = accountManager.getMedacineManager();
        
        Patient patient = new Patient("password","Harry","Gills","18 womworth road, Plymouth", 17,"Male", accountManager);
        Doctor doctor = new Doctor( accountManager, medacineManager, "doctorPassword", "Steve", "Blim", " Fictitious Clinic, Diagon Alley,\n" + "Drake Circus, Plymouth, PL4 8AA.");
        
        accountManager.requestAccount(patient);
        accountManager.approveAccout(patient);
        accountManager.createDoctor(doctor);
        
        patient = new Patient("password","Nigel","Webb","27 womworth road, Plymouth", 34,"Male", accountManager);
        doctor = new Doctor( accountManager, medacineManager, "doctorPassword", "Yoko", "Frath", " Fictitious Clinic, Diagon Alley,\n" + "Drake Circus, Plymouth, PL4 8AA.");
        
        accountManager.requestAccount(patient);
        accountManager.createDoctor(doctor);
        
        patient = new Patient("password","Alex","Rouse","24 plym road, Plymouth", 22,"Female", accountManager);
        doctor = new Doctor( accountManager, medacineManager, "doctorPassword", "Butch", "Blake", " Fictitious Clinic, Diagon Alley,\n" + "Drake Circus, Plymouth, PL4 8AA.");
        
        accountManager.requestAccount(patient);
        accountManager.createDoctor(doctor);
        
        Admin admin = new Admin(accountManager, medacineManager, "pass", "Blimby", "Undel", " Fictitious Clinic, Diagon Alley,\n" + "Drake Circus, Plymouth, PL4 8AA.");
        Secretary secretary = new Secretary(accountManager, medacineManager, "secretaryPassword", "Brian", "Hull", " Fictitious Clinic, Diagon Alley,\n" + "Drake Circus, Plymouth, PL4 8AA.");
        
        accountManager.createAdmin(admin);
        accountManager.createSecretary(secretary);
        
        Controller.Controller controller  = new Controller.Controller(accountManager, medacineManager);
        
    }
    
}
