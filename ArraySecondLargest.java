public class ArraySecondLargest
{
    public static void main(String[] args)
    {
        int[] arr = {10, 50, 30, 20, 40};
int max = arr[0];
int secondMax = Integer.MIN_VALUE;
for (int i = 1; i < arr.length; i++)
{
            int num = arr[i];
            if (num > max)
            {
                secondMax = max;
                max = num;
            }

            else if (num > secondMax && num != max)
            {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE)
        {
            System.out.println("No second largest number found.");
        }
        else 
        {
            System.out.println("Second largest number is: " + secondMax);
        }
    }
}
o/p:
Second largest number is: 40
