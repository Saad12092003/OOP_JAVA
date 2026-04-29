class std {
    private String name;
    private int id;
    private double cgpa;

    // Constructor
    public std(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

public class  arrayUsingEncapsulation {
    public static void main(String[] args) {

        // Array of Student objects
        std[] s = new std[3];

        // Initializing objects
        s[0] = new std("Saad", 101, 3.75);
        s[1] = new std("Ali", 102, 3.90);
        s[2] = new std("Rahim", 103, 3.50);

        // Display student details
        System.out.println("Student Details:");
        for (std x : s) {
            System.out.println(" Student Name  : " + x.getName());
             System.out.println(" Student ID   : " + x.getId());
              System.out.println("Student Cgpa : " + x.getCgpa());
               System.out.println(" ");

        }
    }
}