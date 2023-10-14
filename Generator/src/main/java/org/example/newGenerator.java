package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class newGenerator {
    private Product product;
    private Warehouse warehouse;

    private Worker worker;

    @JsonCreator
    public newGenerator(@JsonProperty("product") Product product, @JsonProperty("warehouse") Warehouse warehouse,
                        @JsonProperty("worker") Worker worker) {
        this.product = product;
        this.warehouse = warehouse;
        this.worker = worker;
    }

    public Product getProduct() {
        return product;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Worker getWorker() {
        return worker;
    }

    @Override
    public String toString() {
        return "newGenerator{" +
                "product=" + product +
                ", warehouse=" + warehouse +
                ", worker=" + worker +
                '}';
    }
}

