package school;

public class Student {
    private String name;
    private String lastName;
    private String ci;
    private Double grade;
    public Student(String name, String lastName, String ci) {
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
    }
    public void print() {
        System.out.println("Nombre: " + name + " " + lastName + " CI: " + ci + " Nota: " + grade);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public Double getGrade() {
        return grade;
    }
    public void setGrade(Double grade) {
        this.grade = grade;
    }
    
}
