interface pubgi
{
    void game(); // Abstract method (not declear abstract keyword)
    default void play()   // default method
    {
        System.out.println("Krafton");
    }
}
class freefire implements pubgi
{
    public void game()
    {
        System.out.println("Garena");
    }
}
public class Interface {
    public static void main(String[] args) {
        freefire f =new freefire();
        f.play();
        f.game();

    }
}