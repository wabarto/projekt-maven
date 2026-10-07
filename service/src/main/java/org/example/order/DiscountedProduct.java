package org.example.order;

import org.example.shop.Product;
import org.example.user.UserService;
//import org.example.user.UserServiceImpl;


// podklasa w innym pakiecie, widzi tylko public i protected
public class DiscountedProduct extends Product {

    public String label() {
        return this.name + " " + this.sku;
    }
}
