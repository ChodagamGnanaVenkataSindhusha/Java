class String2
{
public static void main(String[] args)
{
String s1="sviet";
String s2="sviet";String s3="Sviet";//stores in constant pool
String s4="SVIET";
String s5= new String("sviet");// stores in heap memory(object created)
String s6=new String("SVIET");
System.out.println(s1.equals(s2));//equal checks the content is same or not
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equals(s5));
System.out.println(s1.equals(s6));
System.out.println(s5.equals(s6));
System.out.println(s1==s2); //== checks the memory address is same or not
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println(s1==s5);//stores in differnt locations so false
System.out.println(s1==s6);
System.out.println(s5==s6);
}
}
/*o/p:
  true
false
false
true
false
false
true
false
false
false
false
false*/
