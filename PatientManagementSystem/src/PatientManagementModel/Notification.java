/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementModel;

import java.util.ArrayList;
import utilities.*;

/**
 *
 * @author jbrew
 */
public abstract class Notification implements Subject
{
    protected String notificationMessage;
    private ArrayList<Observer> observers = null;
    
    @Override
    public Boolean removeObserver(Observer o)
    {
        Boolean removed = false;
        if (o != null) 
        {
            if(this.observers != null && this.observers.size() > 0)
            {
                removed = this.observers.remove(o);
            }
        }
        return removed;
    }
    
    @Override
    public Boolean registerObserver(Observer o)
    {
        Boolean registered = false;
        if (o != null) 
        {
            if (this.observers == null) 
            {
                this.observers = new ArrayList<>();
            }
            if(!this.observers.contains(o))
            {
                registered = this.observers.add(o);
            }
        }
        return registered;
    }
    
    @Override
    public void notifyObservers()
    {
        
    }
}
