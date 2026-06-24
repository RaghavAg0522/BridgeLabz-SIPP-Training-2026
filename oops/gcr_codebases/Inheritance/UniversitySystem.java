class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    private final int studentId;
    protected double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, int studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gradStudent =
                new GradStudent("Raghav", 22, 101, 9.2,
                        "Artificial Intelligence");

        System.out.println("GradStudent Object:");
        System.out.println(gradStudent);

        System.out.println("\nIS-A Relationship Demonstration:");

        Student student = gradStudent; // GradStudent IS-A Student
        Person person = gradStudent;   // GradStudent IS-A Person

        System.out.println("Student Reference: " + student);
        System.out.println("Person Reference : " + person);
    }
}