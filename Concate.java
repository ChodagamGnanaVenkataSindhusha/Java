//2 Immutable [ plus ,concat]
import java.util.Scanner;
class Concate
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter first string:");
String s1=s.nextLine();
System.out.println("Enter first string:");
String s2=s.nextLine();
String result1=s1+s2;                         //we have to declare 'string'
String result2=s1.concat(s2);
System.out.println("using plus:"+ result1);
System.out.println("using concat:"+result2);
}
}
o/p:
  nter first string:
SINDHU
Enter first string:
SHA
using plus:SINDHUSHA
using concat:SINDHUSHA
