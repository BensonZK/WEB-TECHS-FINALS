package AddtoCart.Cart.Repository;

import AddtoCart.Cart.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
