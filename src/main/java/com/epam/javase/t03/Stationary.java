package com.epam.javase.t03;

import java.util.Comparator;

/**
 * Created by Olya Lee on 16.10.2016.
 */
//Задание 3. Наследование. Разработайте иерархию канцелярских товаров. Создайте “набор новичка”, используя созданную иерархию.

public abstract class Stationary implements Comparable<Stationary>{

    private String name;
    private double price;

    public String getName(){return name;}
    public double getPrice(){return price;}

    public Stationary(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract void use();

    public String toString(){
        return name + " costs " + price;
    }

    public int compareTo(Stationary stationary){
        return this.getName().compareTo(stationary.getName());
    }
}
