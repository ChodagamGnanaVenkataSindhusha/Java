public class Example3 {
    static int a = 50;
    static int b = 75;

    void printStaticVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.printStaticVars();
    }
}
