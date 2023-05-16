package AddtoCart.Cart.Service;

import AddtoCart.Cart.Model.Item;

import java.util.List;

public interface ItemInterface {
    Item saveItem(Item item);
    List<Item> getAllItems();
    Item getItemName(String name);
    Item updateItem(Item item, String name);
    void deleteItem(String name);
}
