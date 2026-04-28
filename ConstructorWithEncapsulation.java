class system
{
    private String name;
    private int id;
    private String dept;

    public system()
    {
        name="saad";
        id=79;
        dept="CSE";
    }
    public system(String name,int id,String dept)
    {
        this.name=name;
        this.id=id;
        this.dept=dept;
    }
    public system(system x)
    {
        name=x.name;
        id=x.id;
        dept=x.dept;
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
}


public class ConstructorWithEncapsulation
{
    static void main(String[] args) {
        system s1 =new system();
        system s2 =new system("Mahin",55,"EEE");
        system s3 =new system(s2);
        System.out.println("Default Constructor :");
        System.out.println("Student Name :"+ s1.getName());
        System.out.println("Student ID   :"+s1.getId());
        System.out.println("Student Dept :"+s1.getDept());

        System.out.println(" ");

        System.out.println("Parameterized Constructor :");
        System.out.println("Student Name :"+ s2.getName());
        System.out.println("Student ID   :"+s2.getId());
        System.out.println("Student Dept :"+s2.getDept());

        System.out.println(" ");

        System.out.println("Copy Constructor :");
        System.out.println("Student Name :"+ s3.getName());
        System.out.println("Student ID   :"+s3.getId());
        System.out.println("Student Dept :"+s3.getDept());

    }
}
