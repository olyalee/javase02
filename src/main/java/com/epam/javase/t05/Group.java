package com.epam.javase.t05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Olya Lee on 18.10.2016.
 */
enum Subject {Astronomy, Math, Physics}

public class Group {
    Subject subject;
    Map <Student,Mark> students;


    Group(Subject subject){
        this.subject = subject;
        students = new HashMap<>();
    }

    public Subject getSubject() {
        return subject;
    }

    public void addStudent(Student student, Mark mark){
        if(students!=null) {
            students.put(student,mark);
            student.groupsAndMarks.put(this.subject,mark);
        }
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void printAllStudentsWithMarks(){
        System.out.println("List of students " + this.getSubject() + " class with their marks:");
        for(Map.Entry<Student, Mark> entry: students.entrySet()){
            System.out.println(entry.getKey().toString()+ ": " + entry.getValue().toString());
        }
    }
}
