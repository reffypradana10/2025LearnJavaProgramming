package Bagian3.programmer.zaman.now.application;

import Bagian3.programmer.zaman.now.data.*;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Infinix", 100000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
