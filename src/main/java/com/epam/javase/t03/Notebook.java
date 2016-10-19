package com.epam.javase.t03;

/**
 * Created by Olya Lee on 16.10.2016.
 */
public class Notebook extends Paper {
    public Notebook(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("Using the Notebook");
    }
}
