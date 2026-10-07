package org.example.shop;


// ta sama klasa pakietu, widzi public, protected i package-private
public class Warehouse {
    
    public String report(Product product) {
        return product.name + " " + product.sku + " " + product.stock;
    }
}
