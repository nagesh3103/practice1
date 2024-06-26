package student.service;

import student.model.Student;
import student.model.Subject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentService {
    public String marksService(Student student){
        Subject[] subjectArray = new Subject[4];
        Subject subject1 = new Subject();
        subject1.subjectName = "Maths";
        subject1.marks = 70;
        subjectArray[0] = subject1;

        Subject subject2 = new Subject();
        subject2.subjectName = "Science";
        subject2.marks = 60;
        subjectArray[1] = subject2;

        Subject subject3 = new Subject();
        subject3.subjectName = "Social";
        subject3.marks = 50;
        subjectArray[2] = subject3;

        Subject subject4 = new Subject();
        subject4.subjectName = "enlish";
        subject4.marks = 30;
        subjectArray[3] = subject4;

        student.subjects = subjectArray;


        if(subject1.marks>35){
            System.out.println(subject1.subjectName+ " Pass");
        }else{
            System.out.println("Fail");
        }
        if(subject2.marks>35){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        if(subject3.marks>35){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        if(subject4.marks>35){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        return "";
    }
}
