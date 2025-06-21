class String1
{
public static void main (String[] args)
{
String s1="Sviet";
String s2="Sviet";
String s3="Sviet";
String s4= new String("Sviet");
String s5="SVIET";
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println(s1==s5);
System.out.println(s4==s5);
System.out.println(s1.equalsIgnoreCase(s4));
System.out.println(s1.equalsIgnoreCase(s5));
}
}
/*o/p:
true
true
false
false
false
true
true*/
