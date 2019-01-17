/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;
import java.util.*;
import Users.*;
import java.io.Serializable;

/**
 *
 * @author jbrew
 */
public class AccountManagement implements Serializable 
{
    private String AdminPass = "AdminPass01";
    private List<Appointment> requestedAppointments = new ArrayList<Appointment>();
    private List<Patient> requestedAccountCreation = new ArrayList<Patient>();
    private List<Patient> requestedAccountTermination = new ArrayList<Patient>();
    private List<User> accounts = new ArrayList<User>();
    private List<Doctor> doctors = new ArrayList<Doctor>();
    private List<Patient> patients = new ArrayList<Patient>();
    private MedacineManager medacineManager;
    private AppointmentNotification appointmentNotification = new AppointmentNotification();
    private AccountNotification accountNotification = new AccountNotification();
    private MedacineNotification medacineNotification = new MedacineNotification();
    private int noOfDoctors = 0;
    private int noOfPatients = 0;
    private int noOfSecretaries = 0;
    private int noOfAdmins = 0;
    private Boolean instantiated;

    /**
     *
     */
    public AccountManagement() 
    {
        instantiated = true;
        medacineManager = new MedacineManager(medacineNotification);
    }
    
    /**
     *
     * @return
     */
    public String getAdminPass() {
        return AdminPass;
    }

    /**
     *
     * @return
     */
    public MedacineManager getMedacineManager() {
        return medacineManager;
    }
    
    /**
     *
     * @param newPatient
     */
    public void requestAccount(Patient newPatient)
    {
        requestedAccountCreation.add(newPatient);
        newPatient.setUniqueID(createID("patient"));
        accountNotification.newPatient();
    }    
    
    /**
     *
     * @param appointment
     */
    public void requestAppointment(Appointment appointment)
    {
        requestedAppointments.add(appointment);
    }
    
    /**
     *
     * @param approvedPatient
     */
    public void approveAccout(Patient approvedPatient)
    {
        requestedAccountCreation.remove(approvedPatient);
        accounts.add(approvedPatient);
        patients.add(approvedPatient);
    }
    
    /**
     *
     * @param doctor
     */
    public void createDoctor(Doctor doctor)
    {
        accounts.add(doctor);
        doctors.add(doctor);
        doctor.setUniqueID(createID("doctor"));
    }
    
    /**
     *
     * @param doctor
     */
    public void removeDoctor(Doctor doctor)
    {
        accounts.remove(doctor);
        doctors.remove(doctor);
    }
    
    /**
     *
     * @param secretary
     */
    public void createSecretary(Secretary secretary)
    {
        accounts.add(secretary);
        secretary.setUniqueID(createID("secretary"));
        appointmentNotification.registerObserver(secretary);
        accountNotification.registerObserver(secretary);
        medacineNotification.registerObserver(secretary);
    }
    
    /**
     *
     * @param secretary
     */
    public void removeSecretary(Secretary secretary)
    {
        accounts.remove(secretary);
        
    }
    
    /**
     *
     * @param admin
     */
    public void createAdmin(Admin admin)
    {
        accounts.add(admin);
        admin.setUniqueID(createID("admin"));
    }
    
    /**
     *
     * @param patientToRemove
     */
    public void requestAccountTermination(Patient patientToRemove)
    {
        requestedAccountTermination.add(patientToRemove);
        accountNotification.removePatient();
    }
    
    /**
     *
     * @param userToRemove
     */
    public void removeAccount(User userToRemove)
    {
        accounts.remove(userToRemove);
        patients.remove(userToRemove);
    }
    
    /**
     *
     * @param patientToRemove
     */
    public void approveTermination(Patient patientToRemove)
    {
        requestedAccountTermination.remove(patientToRemove);
        accounts.remove(patientToRemove);
        patients.remove(patientToRemove);
    }
    
    /**
     *
     * @param deniedPatient
     */
    public void denyAccount(Patient deniedPatient)
    {
        requestedAccountCreation.remove(deniedPatient);
    }
    
    /**
     *
     * @param type
     * @return
     */
    public String createID(String type)
    {
        String ID = "";
        switch(type)
        {
            case "doctor":
                ID = String.format("D%04d", noOfDoctors);
                noOfDoctors++;
                break;
            case "patient":
                ID = String.format("P%04d", noOfPatients);
                noOfPatients++;
                break;
            case "secretary":
                ID = String.format("S%04d", noOfSecretaries);
                noOfSecretaries++;
                break;
            case "admin":
                ID = String.format("A%04d", noOfAdmins);
                noOfAdmins++;
                break;
        }
        return ID;
    }
    
    /**
     *
     * @param IDToFind
     * @return
     */
    public User findByID(String IDToFind)
    {
        User userFound = null;
        
        for(int i = 0; i < accounts.size(); i++)
        {
            if(accounts.get(i).getUniqueID().equals(IDToFind))
            {
                userFound = accounts.get(i);
            }
        }
        
        return userFound;
    }
    
    /**
     *
     * @param IDToFind
     * @return
     */
    public Doctor findDoctorByID(String IDToFind)
    {
        Doctor doctorFound = null;
        
        for(int i = 0; i < doctors.size(); i++)
        {
            if(doctors.get(i).getUniqueID().equals(IDToFind))
            {
                doctorFound = doctors.get(i);
            }
        }
        
        return doctorFound;
    }
    
    /**
     *
     * @param IDToFind
     * @return
     */
    public Patient findPatientByID(String IDToFind)
    {
        Patient patientFound = null;
        
        for(int i = 0; i < patients.size(); i++)
        {
            if(patients.get(i).getUniqueID().equals(IDToFind))
            {
                patientFound = patients.get(i);
            }
        }
        
        return patientFound;
    }
    
    /**
     *
     * @return
     */
    public List<Appointment> getRequestedAppointments()
    {
        return requestedAppointments;
    }

    /**
     *
     * @return
     */
    public List<Patient> getRequestedAccountCreation() {
        return requestedAccountCreation;
    }

    /**
     *
     * @return
     */
    public List<Patient> getRequestedAccountTermination() 
    {
        return requestedAccountTermination;
    }
    
    /**
     *
     * @param attendingDoctor
     * @param attendingPatient
     * @param date
     * @return
     */
    public Appointment createAppointment(Doctor attendingDoctor, Patient attendingPatient, String date)
    {
        Appointment appointment = new Appointment(attendingDoctor, attendingPatient, date);
        return appointment;
    }
    
    /**
     *
     * @param attendingDoctor
     * @param attendingPatient
     * @param appointment
     */
    public void addAppointment(Doctor attendingDoctor, Patient attendingPatient, Appointment appointment)
    {
        attendingDoctor.addAppointment(appointment);
        attendingPatient.setUpComingAppointment(appointment);
        appointmentNotification.addAppointment(attendingPatient, attendingDoctor);
    }
    
    /**
     *
     * @param user
     * @return
     */
    public char findIDType(User user)
    {
        char IDType = user.getUniqueID().charAt(0);
        return IDType;
    }
    
    /**
     *
     * @return
     */
    public List<User> getSecretaries()
    {
        List<User> secretaries = new ArrayList<User>();
        for(User user : accounts)
        {
            if(user.getUniqueID().charAt(0) == 'S')
            {
                secretaries.add(user);
            }
        }
        return secretaries;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<User> getDoctors()
    {
        ArrayList<User> doctors = new ArrayList<User>();
        for(User user : accounts)
        {
            if(user.getUniqueID().charAt(0) == 'D')
            {
                doctors.add(user);
            }
        }
        return doctors;
    }
    
    /**
     *
     * @return
     */
    public List<Patient> getPatients()
    {
        return patients;
    }
    
    public void addReview(Doctor doctor, String reveiw)
    {
        doctor.setRating(reveiw);
    }
}
