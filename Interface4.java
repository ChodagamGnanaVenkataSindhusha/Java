interface Bike
{
void RoyalEnfield();
}
interface Car
{
void RollsRoyce();
}
class Vehicles implements Bike,Car
{
public void RoyalEnfield()
{
System.out.println("Enfield is one of my favourite Bike");
}
public void RollsRoyce()
{
System.out.println("RollsRoyce is one of my favourite Car");
}
}
class Interface4
{
public static void main(String[]args)
{
Vehicles v=new Vehicles();
v.RoyalEnfield();
v.RollsRoyce();
}
}
