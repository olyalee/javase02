package com.epam.javase.t02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Olya Lee on 13.10.2016.
 */
public class t02Test {

    @Test
    public void task02(){
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(01,"Ivan","Ivanov");
        Employee employee2 = new Employee(02,"Petr","Petrov");
        Employee employee3 = new Employee(03,"Fedor","Fedorov");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        employee1.addProductToEmployee("pen","Bic",1.02);
        employee1.addProductToEmployee("pencil","Bic",1.45);

        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter the id of employee: " + i);
//        int i = sc.nextInt();

        for(Employee e:employees){
            if (e.employee_id == i)
            {
                e.showAllProduct();
                e.printTotalPrice();
            }
        }
    }
}
