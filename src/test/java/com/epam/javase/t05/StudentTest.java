package com.epam.javase.t05;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Olya Lee on 18.10.2016.
 */
public class StudentTest {
    @Test
    public void createStudents(){
        Student s1 = new Student("Ivan","Ivanov");
        Student s2 = new Student("Petr","Petrov");
        Student s3 = new Student("Fedor","Fedorov");
        Student s4 = new Student("Elena","Lenina");
        Student s5 = new Student("Tatiana", "Tanina");

        Group math = new Group(Subject.Math);
        Group astronomy = new Group(Subject.Astronomy);
        Group physics = new Group(Subject.Physics);

        math.addStudent(s1,new Mark(5));
        math.addStudent(s2,new Mark(4));
        math.addStudent(s3,new Mark(4));

        astronomy.addStudent(s1,new Mark(4.8));
        astronomy.addStudent(s3,new Mark(4.2));
        astronomy.addStudent(s4, new Mark(4.5));

        math.printAllStudentsWithMarks();
        System.out.println();
        astronomy.printAllStudentsWithMarks();
        System.out.println();

        s1.printAllStudentGroups();
        System.out.println();
        s4.printAllStudentGroups();

        System.out.println(s1.compareMarks(Subject.Astronomy, Subject.Math));
    }
}
