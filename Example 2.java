public class Example2 
{
    int x = 100;
    int y = 200;

    static void displayInstance()
{
        Example2 obj = new Example2();
        System.out.println("x = " + obj.x);
        System.out.println("y = " + obj.y);
    }

    public static void main(String[] args) 
{
        displayInstance();
}
}
