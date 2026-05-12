
abstract class Person {

    protected String name;
    protected int age;

   Person(String name,int age)
   {
       this.name=name;
       this.age=age;
   }

    abstract void display();
}

class child1 extends Person {

    child1(String name,int age)
    {
        super(name,age);
    }

    public String getname() {
        return this.name;
    }

    public int getage() {
        return this.age;
    }
    
    void display() {
        System.out.println(getname());
        System.out.println(getage());
    }
}










class child2 extends Person {


    child2(String name,int age)
    {
        super(name,age);
    }

    public String getname() {
        return this.name;
    }

    public int getage() {
        return this.age;
    }

    @Override
    void display() {
        System.out.println(getname());
        System.out.println(getage());
    }
}

public class OOPfourPillarCombination {

    public static void main(String[] args) {


        Person s1 = new child1("saad",23);
        Person s2 = new child2("saadi",12);

        s1.display();
        s2.display();
    }
}