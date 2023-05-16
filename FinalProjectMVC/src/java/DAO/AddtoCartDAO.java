/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AddtoCartM;
import Model.Payment_Delivery;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DolphiX People's
 */
public class AddtoCartDAO {
    public void create(AddtoCartM a){
        Session ss = HibernateUtil1.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(a);
        ss.getTransaction().commit();
        ss.close();
    }
    
    public void update(AddtoCartM a){
        Session ss = HibernateUtil1.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(a);
        ss.getTransaction().commit();
        ss.close();
        
    }
    
    public void delete(AddtoCartM a){
        Session ss = HibernateUtil1.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(a);
        ss.getTransaction().commit();
        ss.close();
        
    }
    
    public AddtoCartM findbyId(String id){
        Session ss = HibernateUtil1.getSessionFactory().openSession();
        AddtoCartM a = (AddtoCartM)ss.get(Payment_Delivery.class, id);
        ss.close();
        return a;
    }
    
    public List<AddtoCartM> findAll(){
        Session ss = HibernateUtil1.getSessionFactory().openSession();
        Query qry = ss.createQuery("select a from AddtoCartM a");
        List<AddtoCartM> addList = qry.list();
        ss.close();
        return addList;
    }
    
}
