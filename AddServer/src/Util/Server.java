/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Service.ItemServiceImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author DolphiX People's
 */
public class Server {

  public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(6690);
        registry.rebind("itemService", new ItemServiceImpl());
        System.out.println("Server is running...");
    }
    
}
