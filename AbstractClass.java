abstract class animal
{
    abstract void sound();// Abstract method(Dosen't have any body)

    void mortal() // normal method
    {
        System.out.println("Animal is not mortal");
    }
}
class Dog extends animal
{
    // Body of sound is provided here
    void sound()
    {
        System.out.println("Animal makes Sound");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.mortal();
        d.sound();


    }
}

