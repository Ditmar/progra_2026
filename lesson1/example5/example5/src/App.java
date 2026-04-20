import school.RegisterGrades;
import school.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Juan", "Perez", "12345678");
        student1.setGrade(85.0);
        Student student2 = new Student("Maria", "Gomez", "87654321");
        student2.setGrade(90.0);
        Student student3 = new Student("Pedro", "Lopez", "11223344");
        student3.setGrade(100.0);
        Student student4 = new Student("Ana", "Garcia", "44332211");
        student4.setGrade(95.0);
        RegisterGrades register = new RegisterGrades();
        register.addStudent(student1);
        register.addStudent(student2);
        register.addStudent(student3);
        register.addStudent(student4);
        
        System.out.println("Lista de estudaintes");
        register.showStudents();
        System.out.println("----------------------------");
        register.getAverage();
        System.out.println("----------------------------");
        register.getTotalReview();

    }
}
