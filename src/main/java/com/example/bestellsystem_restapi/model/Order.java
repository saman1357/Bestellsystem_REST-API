package com.example.bestellsystem_restapi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {


    //FIELDS
    private String id;
    private List<Product> products = new ArrayList<>();


    //CONSTRUCTOR
    public Order(String id, List<Product> products) {
        this.id = id;
        this.products = products;
    }


    //GETTER SETTER
    public String getId() {
        return id;
    }


    //METHODS
    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }




    public void setProducts(List<Product> products) {
        this.products = products;
    }


    //FIELD OPERATIONS
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }
}
