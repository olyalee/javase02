package com.epam.javase.t03;

/**
 * Created by Olya Lee on 16.10.2016.
 */
public class HolePunch extends Desktop {

    public HolePunch(String name, double price){
        super(name,price);
    }

    @Override
    public void use() {
        System.out.println("Using the Hole Punch!");
    }
}
