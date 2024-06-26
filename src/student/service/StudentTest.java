package student.service;

import student.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student student=new Student();
        student.studentName="Ram";
        service.marksService(student);
    }
}
