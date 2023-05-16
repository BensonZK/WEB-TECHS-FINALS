/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Item;
import Util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DolphiX People's
 */
public class ItemDao {
    public void RegisterItem(Item item){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans=session.beginTransaction();
        session.save(item);
        trans.commit();
        session.close();
    }
    
    public ArrayList<Item> getAllItems() {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
                
        ArrayList<Item> citizenList = new ArrayList<>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        Query query = session.createQuery(" Item");
        citizenList = (ArrayList<Item>) query.list();        
        trans.commit();
        session.close();        
        
        return citizenList;
    }
}
