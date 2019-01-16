/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author jbrew
 */
public interface Subject 
{
    Boolean registerObserver(Observer o);
    Boolean removeObserver(Observer o);
    void notifyObservers();
}
