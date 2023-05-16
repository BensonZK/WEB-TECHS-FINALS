package AddtoCart.Cart.Controller;

import AddtoCart.Cart.Model.Item;
import AddtoCart.Cart.Service.ItemInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API23190")
public class ItemController {
    private ItemInterface itemInterface;

    public ItemController(ItemInterface itemInterface) {
        this.itemInterface = itemInterface;
    }

    @PostMapping()
    public ResponseEntity<Item> saveItem(@RequestBody Item item){
        return  new ResponseEntity<Item>(itemInterface.saveItem(item), HttpStatus.CREATED);
    }


    @GetMapping
    public List<Item> getAllItems(){
        return itemInterface.getAllItems();
    }


    @GetMapping("{name}")
    public ResponseEntity<Item> getItemName(@PathVariable("name") String name){
        return new ResponseEntity<Item>(itemInterface.getItemName(name), HttpStatus.OK);

    }


    @PutMapping("{title}")

    public ResponseEntity<Item> updateItem(@PathVariable("name") String name, @RequestBody Item item){
        return new ResponseEntity<Item>(itemInterface.updateItem(item, name), HttpStatus.OK);
    }


    @DeleteMapping("{name}")
    public ResponseEntity<String> deleteItem(@PathVariable("name") String name){

        itemInterface.deleteItem(name);
        return new ResponseEntity<String>("Item removed successfully from the cart", HttpStatus.OK);
    }

}
