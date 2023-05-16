package AddtoCart.Cart.Service;

import AddtoCart.Cart.Exception.ResourceNotFound;
import AddtoCart.Cart.Model.Item;
import AddtoCart.Cart.Repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemInterface{

    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemName(String name) {
        return itemRepository.findById(name).orElseThrow(() ->
                new ResourceNotFound("Item", "name", name));
    }

    @Override
    public Item updateItem(Item item, String name) {
        Item existingitem=itemRepository.findById(name).orElseThrow(() ->
                new ResourceNotFound("Item", "name", name));
        existingitem.setQuantity(item.getQuantity());
       existingitem.setName(item.getName());
       existingitem.setPrice(item.getPrice());

        //save existing
        itemRepository.save(existingitem);
        return existingitem;
    }

    @Override
    public void deleteItem(String name) {
        itemRepository.findById(name).orElseThrow(()
                -> new ResourceNotFound("Item", "name",name));
        itemRepository.deleteById(name);
    }
}
