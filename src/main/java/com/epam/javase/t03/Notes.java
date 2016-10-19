package com.epam.javase.t03;

import javax.sound.midi.Soundbank;

/**
 * Created by Olya Lee on 16.10.2016.
 */
public class Notes extends Paper {
    public Notes(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("Using the Notes");
    }
}
