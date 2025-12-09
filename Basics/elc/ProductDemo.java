package Basics.elc;

import Basics.blc.Product;

public class ProductDemo {
    static void main() {
        int id = Integer.parseInt(IO.readln("Enter Product id: "));
        String name = IO.readln("Enter Product Name: ");
        double price = Double.parseDouble(IO.readln("Enter Product Price: "));


        Product product = new Product();
        product.setProductDetails(id,name,price);
        product.calculateDiscount();
        IO.println(product);
    }
}
