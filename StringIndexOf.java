public class StringIndexOf
{
public static void main(String[] args)
{
String str = "Sita Raama";//spaces should be count for characters
int w1 = str.indexOf("Sita");
int w2 = str.indexOf("Raama");//prints the words first index value
int w3 = str.indexOf("Hanuma");// returns -1 if not found
int c1 = str.indexOf('a');//prints first a index value
int c2= str.indexOf('a', c1 + 1 );//indexOff 'i' should be small,index starts from zero
int c3 = str.indexOf('a', c2 + 1);
int c4 = str.lastIndexOf('a');//prints last index value
System.out.println("Index of Sita: "+ w1);
System.out.println("Index of Raama:" + w2);
System.out.println("Index of Hanuma: " + w3);
System.out.println("First 'a' at index: "+ c1);
System.out.println("Second 'a' at index: " + c2);
System.out.println("Third 'a' at index: " + c3);
System.out.println("Last 'a' at index: " + c4);
}
}

O/p:
Index of Sita: 0
Index of Raama:5
Index of Hanuma: -1
First 'a' at index: 3
Second 'a' at index: 6
Third 'a' at index: 7
Last 'a' at index: 9
