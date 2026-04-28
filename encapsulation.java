class student
{
    private String name;
    private int id;
    private String dept;
    private double cgpa;

    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setCgpa(double cgpa)
    {
        this.cgpa=cgpa;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }
    public String getDept()
    {
        return this.dept;
    }
    public double getCgpa()
    {
        return this.cgpa;
    }
}

public class encapsulation {
   public  static void main(String[] args) {
        student s = new student();
        s.setName("Saad");
        s.setId(56);
        s.setDept("CSE");
       s.setCgpa(3.66);
       System.out.println("Student Info :");

       System.out.println("Student Name :" + s.getName());
        System.out.println("Student ID   :"   +s.getId());
        System.out.println("Student Dept :" +s.getDept());
        System.out.println("Student Cgpa :"+s.getCgpa());


    }
}
