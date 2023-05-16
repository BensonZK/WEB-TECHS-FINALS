/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.ItemDao;
import MODEL.Item;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author DolphiX People's
 */
public class ItemServiceImpl extends UnicastRemoteObject implements ItemInterface {
public ItemServiceImpl() throws RemoteException {
        super();
    }
    @Override
    public void RegisterItem(Item item) throws RemoteException {
       ItemDao dao = new ItemDao();
        dao.RegisterItem(item);
    }

    @Override
    public ArrayList<Item> getAllItems() throws RemoteException {
        ItemDao dao = new ItemDao();
        return dao.getAllItems();
    }
    
}
