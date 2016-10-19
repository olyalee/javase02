package com.epam.javase.t06;

import org.junit.Test;

/**
 * Created by Olya Lee on 17.10.2016.
 */
public class AtomicSubmarineTest {
    @Test
    /**
     * Test for atomic submarine and its engine.
     */
    public void diving(){
        AtomicSubmarine submarine = new AtomicSubmarine("Nautilus");
        System.out.println("This is \"" + submarine.getName() + "\" submarine." );
        submarine.isDiving();
        submarine.startEngine();
        submarine.isDiving();
        submarine.stopEngine();
        submarine.isDiving();
    }
}
