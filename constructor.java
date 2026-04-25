 

class keyword{ 
   String name; 
    int age; 
    char gender; 
    double cgpa; 
    keyword() 
    { 
        name="Saad"; 
        age=23; 
        gender='M'; 
        cgpa=3.90; 
    } 
    keyword(int a,char g) 
    { 
        name ="Mahi"; 
        age = a; 
        gender =g; 
        cgpa= 2.99; 
    } 
    keyword(keyword k) 
    { 
        name="Monir"; 
        age =k.age; 
        gender=k.gender; 
        cgpa =3.67; 
    } 

                         

 
 
    keyword(String name,int age,char gender,double cgpa) 
    { 
        this.name=name; 
        this.age=age; 
        this.gender=gender; 
        this.cgpa=cgpa; 
    } 
    void display() 
    { 
        System.out.println("Student Name : " +name); 
        System.out.println("Student Age : " +age); 
        System.out.println("Student Gender : " +gender); 
        System.out.println("Student Cgpa : " +cgpa); 
        System.out.println(); 
    } 
} 
public class constructor { 
    static void main(String[] args) { 
        keyword s1=new keyword(); 
        keyword s2= new keyword(21,'M'); 
        keyword s3 =new keyword(s2); 
        keyword s4 =new keyword("Sami",24,'M',3.88); 
        System.out.println("[Default Constructor] " ); 
        s1.display(); 
        System.out.println("[Parameterize Constructor] "); 
        s2.display(); 
        System.out.println("[Copy Constructor]"); 
        s3.display(); 
        System.out.println("[Constructor overloading and this keyword uses] "); 
        s4.display(); 
    } 
}