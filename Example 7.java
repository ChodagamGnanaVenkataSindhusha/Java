public class Example7
{
    static void staticMethod()
    {
        System.out.println("This is a static method");
    }
    void instanceMethod()
    {
        System.out.println("This is an instance method");
    }
    public static void main(String[] args)
    {
        staticMethod();
        Example7 obj = new Example7();
        obj.instanceMethod();
    }
}

