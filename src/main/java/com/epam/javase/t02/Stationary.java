package com.epam.javase.t02;
/**
 * Created by Olya Lee on 13.10.2016.
 */

public class Stationary {

    private String product;
    private String producerName;
    private double price;

    public Stationary(String product, String producerName, Double price) {
        this.product = product;
        this.producerName = producerName;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
