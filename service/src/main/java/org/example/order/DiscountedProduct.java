package org.example.order;

import org.example.shop.Product;
import org.example.user.UserService;
//import org.example.user.UserServiceImpl;


// podklasa w innym pakiecie, widzi tylko public i protected
public class DiscountedProduct extends Product {

    public String label() {
        return this.name + " " + this.sku;
    }

    // DRY - Don't Repeat Yourself - jedna wiedza w jednym miejscu
    // YAGNI - You Ain't Gonna Need It - nie budujemy tego czego nie potrzebujemy dzisiaj
    // Tell, Don't Ask - nie pytamy obiektu o stan, zeby zdecydowac za niego, mowimy mu co ma zrobic



}
