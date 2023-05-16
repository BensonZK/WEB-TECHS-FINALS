/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DolphiX People's
 */
@Entity
public class Item {
    private String quantity;
    @Id
    private String name;
    private String price;

    public Item(String quantity, String name, String price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public Item() {
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
