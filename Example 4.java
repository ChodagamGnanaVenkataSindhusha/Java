public class Example4 
{
    void greet() 
    {
        System.out.println("Hello from instance method");
    }

    static void callInstance()
    {
        Example4 obj = new Example4();
        obj.greet();
    }

    public static void main(String[] args)
    {
        callInstance();
    }
}
