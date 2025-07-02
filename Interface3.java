interface  Sindhu
{
void Sai();
}
class Brother implements Sindhu
{
public void Sai()
{
System.out.println("SAI is SINDHU's brother");
}
}
class Interface3
{
public static void main(String[] args)
{
Sindhu s= new Brother();    //used interface instance  to call the implemented method
s.Sai();
}
}
