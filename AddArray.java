public class AddArray
{
    public static void main(String[] args) 
    {
        int arr[] = {5, 10, 15, 20};  
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum = sum + arr[i]; 
        }
System.out.println("Total sum ="+ sum);
    }
}
