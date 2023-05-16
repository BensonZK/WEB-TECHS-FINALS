/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DolphiX People's
 */
@Entity
public class AddtoCartM {
    private String quantity;
    @Id
    private String name;
    private String price;

    public AddtoCartM() {
    }

    public AddtoCartM(String quantity, String name, String price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
            
    
}
