package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        List<newGenerator> generator = Generator2.generateCombinedModels();
        for (org.example.newGenerator newGenerator : generator) {
            System.out.println(newGenerator);
        }

        Serialization serializer = new Serialization();
        String json = serializer.serialize(generator);
        System.out.println("-----------------------------");
        System.out.println(json);
        Desirialization desirialization = new Desirialization();
        List<newGenerator> generator2 = desirialization.deserialize(json);
        System.out.println("---------------------");
        for (org.example.newGenerator newGenerator : generator2) {
            System.out.println(newGenerator);
        }
    }
}
