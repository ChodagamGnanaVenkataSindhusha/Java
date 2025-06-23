public class BinarySearchArray
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] == key) 
            {
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            } 
            else if (key < arr[mid]) 
            {
                end = mid - 1;
            } else
            {
                start = mid + 1;
            }
        }
        if (!found)
        {
            System.out.println("Not found");
        }
    }
}
