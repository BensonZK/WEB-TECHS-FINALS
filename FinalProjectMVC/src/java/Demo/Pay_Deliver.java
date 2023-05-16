/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import DAO.Pay_Del_DAO;
import Model.AddtoCartM;
import Model.Payment_Delivery;
import java.text.DecimalFormat;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author DolphiX People's
 */
@ManagedBean(name = "pd")
public class Pay_Deliver {
    private Payment_Delivery pay = new Payment_Delivery();
    private Pay_Del_DAO lDao = new Pay_Del_DAO();
    private String action = "Pay";
    
    public String register(){
        try{
            FacesMessage msg = null;
            if(action.equals("Pay")){
               lDao.create(pay);
               msg = new FacesMessage("Item payed");
            }else if(action.equals("Update")){
                lDao.update(pay);
                msg = new FacesMessage("Employee updated");
            }
            else if(action.equals("Delete")){
                lDao.delete(pay);
                msg = new FacesMessage("Employee deleted");
            }
            
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "lifeList";
        }catch(Exception ex){
            FacesMessage msg = new FacesMessage(ex.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "index";
        }
    }
    
     public String update(Payment_Delivery p){
        pay = p;
        action = "Update";
        return "index1";
    }
    public String delete(Payment_Delivery p){
       pay = p;
        action = "Delete";
        return "index1";
    }

    public  Payment_Delivery  getPay() {
        return pay;
    }

    public List<Payment_Delivery > getPayList(){
        return lDao.findAll();
    }
    
    
//    public String getDiff(){
//        List<LifeReality> list = lDao.findAll();
//        Double diff = null;
//        for(LifeReality l : list){
//           diff = l.getSalary() + l.getExpenses();
//        }
//        DecimalFormat df = new DecimalFormat("#,### FRW");
//        return df.format(diff);
//    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
    
    
}
