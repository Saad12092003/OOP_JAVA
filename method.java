 

 

class variable { 
    static String name; 
    int id; 
    double cgpa; 
 
    void InstanceMethod() 
    { 
        System.out.println("Instance Method : "  ); 
        System.out.println("Name : " + name); 
        System.out.println("ID   : " + id); 
        System.out.println("cgpa : " + cgpa); 
    } 
 

 

 

 

 

 
    static void StaticMethod() 
    { 
        System.out.println("Static Method : "  ); 
        System.out.println("Name : " + name); 
 
        System.out.println("ID   :  Not printed" ); 
        System.out.println("cgpa :  Not printed" ); 
        System.out.println("Note: [Here id and cgpa can not print beacause " + 
                "there are instance variable]"); 
    } 
 
    void methodsum(int x,int y) 
    { 
        System.out.println("Sum of Two number : " +(x+y)); 
    } 
 
    void methodsum(double x,double y) 
    { 
        System.out.println("Sum of Two number : " +(x+y)); 
 
    } 
} 
public class method { 
 
    public static void main(String[] args) { 
 
        variable s1 = new variable(); 
        s1.name="Saad"; 
        s1.id=79; 
        s1.cgpa=3.56; 
 
        s1.InstanceMethod(); 
        System.out.println(); 
        variable.StaticMethod(); 
 
        System.out.println(); 
 
        System.out.println("Method Overloading : " ); 
        s1.methodsum(100,200); 
        s1.methodsum(100.01,200.01); 
 
    } 
} 
 

 