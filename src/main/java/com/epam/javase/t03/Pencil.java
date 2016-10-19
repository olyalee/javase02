package com.epam.javase.t03;

/**
 * Created by Olya Lee on 16.10.2016.
 */
public class Pencil extends Writing {
    public Pencil(String name, double price){
        super(name,price);
    }
        public void use(){
            System.out.println("Writing by Pencil");
        }
}
