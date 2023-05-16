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
public class Payment_Delivery {
    private String Name;
    @Id
    private String Phone;
    private String Address;
    private String Card_number;
    private String M;

    public Payment_Delivery(String Name, String Phone, String Address, String Card_number, String M, String Y, String cvv) {
        this.Name = Name;
        this.Phone = Phone;
        this.Address = Address;
        this.Card_number = Card_number;
        this.M = M;
        this.Y = Y;
        this.cvv = cvv;
    }

    public Payment_Delivery() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCard_number() {
        return Card_number;
    }

    public void setCard_number(String Card_number) {
        this.Card_number = Card_number;
    }

    public String getM() {
        return M;
    }

    public void setM(String M) {
        this.M = M;
    }

    public String getY() {
        return Y;
    }

    public void setY(String Y) {
        this.Y = Y;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    private String Y;
    private String cvv;
    
}
