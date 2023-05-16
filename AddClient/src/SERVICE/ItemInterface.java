/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICE;

import MODEL.Item;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author DolphiX People's
 */
public interface ItemInterface extends Remote{
    public void RegisterItem(Item item) throws RemoteException;
    public ArrayList<Item> getAllItems() throws RemoteException;
//    public void RegisterCitizenVaccine(TicketPerspec citizenvaccine) throws RemoteException;
//    public ArrayList<TicketPerspec> getAllVaccinedCitizens() throws RemoteException;
//    public void deleteCitizen(String clientId) throws RemoteException;
    
}
