package com.epam.javase.t03;

/**
 * Created by Olya Lee on 16.10.2016.
 */
public abstract class Paper extends Stationary {

    private String name;
    private double price;

    public String getName(){return name;}
    public double getPrice(){return price;}

    public Paper(String name, double price){
        super(name,price);
    }

    public abstract void use();
}
