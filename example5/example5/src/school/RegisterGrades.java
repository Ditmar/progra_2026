package school;

import java.util.ArrayList;

public class RegisterGrades {
    private ArrayList<Student> studentList = new ArrayList<>();
    public RegisterGrades() {
        studentList = new ArrayList<>();
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void getTotalReview() {
        Integer countGradeFromStudents = 0;
        for (Student student : studentList) {
            if (student.getGrade() != null) {
                countGradeFromStudents++;
            }
        }
        System.out.println("Total de estudiantes evaluados " + countGradeFromStudents);
    }
    public void showStudents() {
        for (Student student : studentList) {
            student.print();
        }
    }
    public void getAverage() {
        
        Double average = 0.0;
        Double total = 0.0;
        Integer count = 0;
        ArrayList<Student> perfectStudentList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getGrade() != null) {
                if (student.getGrade().toString().contains("100")) {
                    perfectStudentList.add(student);
                }
                total += student.getGrade();
                count++;
            }
        }
        average = total / count;
        System.out.println("El promedio total de las notas es  " + average);
        for (Student perfectStudent : perfectStudentList) {
            perfectStudent.print();
        }
    }
    public void cleanRegister() {
        studentList.clear();
    }


}