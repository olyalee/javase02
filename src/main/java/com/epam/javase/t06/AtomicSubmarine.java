package com.epam.javase.t06;


//Задание 6. Классы внутри классов. Разработайте класс АтомнаяЛодка, создайте внутренний класс – ДвигательДляАтомнойЛодки. Создайте объект АтомнаяЛодка и “запустите его в плавание”.

//Задание 7. Аннотации. Разработайте для класса АтомнаяЛодка из задания 6 (или любого другого класса) аннотацию, которая могла бы обрабатываться утилитой Javadoc. Аннотируйте класс.

/**
 * Created by Olya Lee on 16.10.2016.
 * Represents an atomic submarine. Have inner class for engine.
 */

public class AtomicSubmarine {

    private String name = "";
    private AtomicSubmarineEngine engine;

    /**
     * Create a new AtomicSubmarine with the default name.
     */
    AtomicSubmarine(){
        name = "Shark";
        engine = new AtomicSubmarineEngine();
    }

    /**
     * Create a new AtomicSubmarine with the given name.
     * @param name
     */
    AtomicSubmarine(String name){
        this.name = name;
        engine = new AtomicSubmarineEngine();
    }

    String getName(){
        return name;
    }

    /**
     * Makes the engine on.
     */
    public void startEngine(){
        engine.working = true;
        System.out.println("Start the engine!");
    }

    /**
     * Makes the engine off.
     */
    public void stopEngine(){
        engine.working = false;
        System.out.println("Stop the engine!");
    }

    /**
     * Checks is the submarine diving. Give the info about it on the console.
     */
    public void isDiving(){
        if (engine.working == false){
            System.out.println("The engine is not working");
        }else{
            System.out.println("The engine is working. The submarine " + this.name + " is diving.");
        }
    }

    /**
     * Inner class for AtomicSubmarine. Represents the engine. The state (working or not) can be changed by outer class.
     */
    private class AtomicSubmarineEngine {
        boolean working = false;
    }
}