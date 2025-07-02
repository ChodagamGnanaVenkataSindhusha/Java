interface Icecream
{
void Chocobar();
}
class MyFavourite implements Icecream
{
public void Chocobar()
{
System.out.println("One of my favourite Icecream");
}
}
public class Interface1
{
public static void main(String[] args)
{
MyFavourite m = new MyFavourite();
m.Chocobar();
}
}
