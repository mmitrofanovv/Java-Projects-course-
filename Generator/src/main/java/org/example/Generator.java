package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public static List<Product> generateProducts() {
        List<Product> products = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            String name = "Product" + i;
            double price = 10.0 + random.nextDouble() * 100.0; // Генерация случайной цены
            int id = random.nextInt();
            Product product = new Product(name, price, id);
            products.add(product);
        }

        return products;
    }
}
