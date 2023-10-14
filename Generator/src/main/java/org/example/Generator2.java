package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Generator2 {
    public static List<newGenerator> generateCombinedModels() {
        List<newGenerator> combinedModels = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String productName = "Product" + i;
            double productPrice = 10.0 + random.nextDouble() * 100.0;
            int productId = random.nextInt();
            Product product = new Product(productName, productPrice, productId);

            String warehouseName = "Warehouse" + i;
            String warehouseAddress = "Address" + i;
            int warehouseNumber = random.nextInt();
            Warehouse warehouse = new Warehouse(warehouseName, warehouseAddress, warehouseNumber);

            String workerName = "Worker" + i;
            String workerPost = "Post" + i;
            int workerId = random.nextInt();
            Worker worker = new Worker(workerName, workerPost, workerId);

            newGenerator combinedModel = new newGenerator(product, warehouse, worker);
            combinedModels.add(combinedModel);
        }

        return combinedModels;
    }
}
