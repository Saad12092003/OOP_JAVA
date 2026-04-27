class Student {
    String name;
    int age;
    char gender;
    int roll;
    double cgpa;
    Student(String n, int a, char g, int i, double c) {
        name = n;
        age = a;
        gender = g;
        roll = i;
        cgpa = c;
    }
    void display()
    {
        System.out.println("Student Name   : " +name);
        System.out.println("Student Age    : " +age);
        System.out.println("Student Gender : " +gender);
        System.out.println("Student Roll     : " +roll);
        System.out.println("Student Cgpa   : " +cgpa);
        System.out.println();
    }
}
public class ArrayofObject {
    static void main(String[] args) {

        Student[] s1 = new Student[3];
        s1[0] = new Student("Saad", 23, 'M', 24, 3.65);
        s1[1] = new Student("Mahin", 22, 'M', 49, 3.89);
        s1[2] = new Student("Aman", 24, 'M', 23, 3.90);
        System.out.println("Student Info :");
        for (Student s : s1) {
            s.display();
        }
    }
}


