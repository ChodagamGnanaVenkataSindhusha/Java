public class IndexArray
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};
        int num =30;
        int index = -1; 
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == num) 
            {
                index = i;
                break;
            }
        }
        if (index != -1) 
        {
            System.out.println("Number found at index: " + index);
        } 
        else 
        {
            System.out.println("Number not found in array.");
        }
    }
}

