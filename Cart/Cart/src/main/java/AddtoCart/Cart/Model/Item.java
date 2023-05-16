package AddtoCart.Cart.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name= "Items")
public class Item {
    @Id
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "price")
    private String price;
}
