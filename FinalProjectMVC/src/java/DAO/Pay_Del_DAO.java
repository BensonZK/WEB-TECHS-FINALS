/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Payment_Delivery;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author DolphiX People's
 */
public class Pay_Del_DAO {
    public void create(Payment_Delivery p){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(p);
        ss.getTransaction().commit();
        ss.close();
    }
    
    public void update(Payment_Delivery p){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(p);
        ss.getTransaction().commit();
        ss.close();
        
    }
    
    public void delete(Payment_Delivery p){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(p);
        ss.getTransaction().commit();
        ss.close();
        
    }
    
    public Payment_Delivery findbyId(String id){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Payment_Delivery p = (Payment_Delivery)ss.get(Payment_Delivery.class, id);
        ss.close();
        return p;
    }
    
    public List<Payment_Delivery> findAll(){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query qry = ss.createQuery("select p from Payment_Delivery p");
        List<Payment_Delivery> payList = qry.list();
        ss.close();
        return payList;
    }
}
