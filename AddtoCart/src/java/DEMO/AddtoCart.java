/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import DAO.AddtoCartDAO;
import Model.AddtoCartM;
import java.text.DecimalFormat;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author DolphiX People's
 */
@ManagedBean(name = "ac")
public class AddtoCart {
    private AddtoCartM add = new AddtoCartM();
    private AddtoCartDAO aDao = new AddtoCartDAO();
    private String action = "Add to cart";
    
    public String adding(){
        try{
            FacesMessage msg = null;
            if(action.equals("Add to cart")){
               aDao.create(add);
               msg = new FacesMessage("Item payed");
            }else if(action.equals("Update")){
                aDao.update(add);
                msg = new FacesMessage("Employee updated");
            }
            else if(action.equals("Delete")){
                aDao.delete(add);
                msg = new FacesMessage("Item deleted");
            }
            
            
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "ItemsList";
        }catch(Exception ex){
            FacesMessage msg = new FacesMessage(ex.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "index1";
        }
    }
    
   
    public String Checkout(AddtoCartM  a){
        a.setQuantity("Item Checked out");
        aDao.update(a);
        FacesMessage msg = new FacesMessage(a.getName()+" is checked out");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return "ItemsList";
    }
    
    public String update(AddtoCartM a){
        add = a;
        action = "Update";
        return "index1";
    }
    public String delete(AddtoCartM a){
       add = a;
        action = "Delete";
        return "index1";
    }
    

    public  AddtoCartM  getAdd() {
        return add;
    }

    public List<AddtoCartM > getPayList(){
        return aDao.findAll();
    }
    
public String getTotalSalary(){
        List<AddtoCartM> list = aDao.findAll();
        Double total = 0.0;
        for(AddtoCartM a : list){
            total = total + a.getPrice();
        }
        DecimalFormat df = new DecimalFormat("#,### $");
        return df.format(total);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
}
