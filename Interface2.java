interface Fruits                     //in class we must call all methods that are in interface 
{
void Mango();
void CustardApple();
}
abstract class Favourite implements Fruits  //abstract is mentioned bcz we have implemented only one interface method
{
public void Mango()
{
System.out.println("mango is one of my favourite fruit");
}
public void CustardApple()
{
//no body for this
}
}
 public class Interface2
{
public static void main(String[] args)
{
Favourite f= new Favourite()
{};                        //abstract class cannot be instantiated
f.Mango();
}
}
