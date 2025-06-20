public class Example5
{
    static void sayHi()
    {
        System.out.println("Hi from static method");
    }
    void callStatic()
    {
        sayHi();
    }

    public static void main(String[] args) 
    {
        Example5 obj = new Example5();
        obj.callStatic();
    }
}
