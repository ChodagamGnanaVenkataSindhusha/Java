interface Arunachalam
{
void LordSiva();
}
interface Kedharinadh
{
void LordSiva();
}
class Temples implements Arunachalam,Kedharinadh
{
public void LordSiva()
{
System.out.println("Arunachalam and Kedharinadh are favourite temples of Mahadev");
}
}
class Interface5
{
public static void main(String[] args)
{
Temples t= new Temples();
t.LordSiva();
}
}
