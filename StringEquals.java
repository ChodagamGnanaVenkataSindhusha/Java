//7 immutable 
class StringEquals//csase sensitive  small is not equal to capital 
{
public static void main(String[] args)
{
String s1="sviet";
String s2="sviet";
String s3="Sviet";//stores in constant pool
String s4="SVIET";
String s5= new String("sviet");// stores in heap memory(object created)
String s6=new String("SVIET");
System.out.println(s1.equals(s2));//equal checks the content is same or not
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equals(s5));
System.out.println(s1.equals(s6));
System.out.println(s5.equals(s6));
}
}
