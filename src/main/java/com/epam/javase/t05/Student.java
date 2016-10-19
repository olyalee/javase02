package com.epam.javase.t05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Olya Lee on 18.10.2016.
 */
public class Student {
    String name;
    String lastName;

    Map<Subject,Mark> groupsAndMarks = new HashMap<>();

    Student(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + name;
    }

    public void printAllStudentGroups(){
        System.out.println(lastName + " " + name + "'s groups and marks: ");
        for(Map.Entry<Subject, Mark> entry: groupsAndMarks.entrySet()){
            System.out.println(entry.getKey().toString() + " "+ entry.getValue().toString());
        }
    }

    public String compareMarks(Subject subject1, Subject subject2){
        String result = "";
        double mark1 = 0.0;
        double mark2 = 0.0;

        //Make both marks double
        if(groupsAndMarks.get(subject1).getMark() instanceof Double){
            mark1 = (double)groupsAndMarks.get(subject1).getMark();
        }else if(groupsAndMarks.get(subject1).getMark() instanceof Integer){
            mark1 = (double)(Integer)groupsAndMarks.get(subject1).getMark();
        }
        if(groupsAndMarks.get(subject2).getMark() instanceof Double){
            mark2 = (double)groupsAndMarks.get(subject2).getMark();
        }else if(groupsAndMarks.get(subject2).getMark() instanceof Integer){
            mark2 = (double)(Integer)groupsAndMarks.get(subject2).getMark();
        }

        //Compare marks
        if(mark1 < mark2){
            result = subject2 + " mark is higher than " + subject1;
        }else if(mark1 > mark2){
            result = subject1 + " mark is higher than " + subject2;
        }else {
            result = subject2 + " mark == " + subject1 + " mark";
        }
        return result;
    }

}
