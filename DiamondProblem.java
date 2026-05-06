/*
        ### Diamond Problem
         A
       /   \
      B     C
       \   /
         D
 */

interface A
{
    default void show()
    {
        System.out.println("Show from A");
    }
}

interface B extends A
{
    default void show()
    {
        System.out.println("Show from B");
    }
}

interface C extends A
{
    default void show()
    {
        System.out.println("Show from C");
    }
}
class D implements B,C
{
    public void show()
    {
       //choose one path explicitly
        B.super.show();   // or C.super.show()
    }
}

public class DiamondProblem{
    public static void main(String[] args) {
        D obj =new D();
        obj.show();

    }
}