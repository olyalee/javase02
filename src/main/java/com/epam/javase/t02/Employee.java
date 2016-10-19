package com.epam.javase.t02;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    int employee_id;
    String name;
    String surname;
    Double stationary_cost = 0.0;

    ArrayList<Stationary> employee_stationary = new ArrayList<>();

    public Employee(int employee_id, String name, String surname){
        this.employee_id = employee_id;
        this.name = name;
        this.surname = surname;
    }

    public void addProductToEmployee(String product, String producerName, double price){
//    public void addProductToEmployee(){
//        String product = "pen";
//        String producerName = "Bic";
//        Double price = 1.02;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter product name:");
//        String product = sc.nextLine();
//        System.out.println("Enter producer name:");
//        String producerName = sc.nextLine();
//        System.out.println("Enter price:");
//        Double price = sc.nextDouble();
        Stationary stationary = new Stationary(product,producerName,price);
        employee_stationary.add(stationary);
        stationary_cost += price;
    }

    public void showAllProduct(){
        for (int i=0; i<employee_stationary.size(); ++i){
            System.out.println(i + " - " + employee_stationary.get(i).getProduct() + " ("+ employee_stationary.get(i).getProducerName()+")"+" - " + employee_stationary.get(i).getPrice());
        }
    }

    public void printTotalPrice(){
        System.out.printf("Total price of all stationary: %.2f",stationary_cost);
    }
}

