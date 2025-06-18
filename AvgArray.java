public class AvgArray
{
    public static void main(String[] args)
    {
       int arr[]={2,4,6,8,10};
       int sum=0;
       for( int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
         }
         double avg=sum/arr.length;
         System.out.println("Average is:"+avg);
    }
}
