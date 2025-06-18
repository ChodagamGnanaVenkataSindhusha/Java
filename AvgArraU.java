import java.util.Scanner;
public class AvgArray
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       int[] arr= new int[5];
       System.out.println("Enter the elements");
       for(int i=0;i<arr.length;i++)
       {
       arr[i]=s.nextInt();
       }
       int sum=0;
       for( int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
         }
         double avg=sum/arr.length;
         System.out.println("Average is:"+avg);
    }
}
