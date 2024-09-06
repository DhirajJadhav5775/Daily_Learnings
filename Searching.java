import java.util.Scanner;

public class Searching 
{
    public static void main(String args[])
    {
        int Arr[] = {3,5,7,9,11};
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Element To Search: ");
        int target = obj.nextInt();

        LinearSearch(Arr,target);
        BinarySearch(Arr,target);
    }   

    public static void LinearSearch(int Arr[], int target)
    {
        int steps = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            steps++;
            if(Arr[iCnt] == target)
            {
                System.out.println("Element Found At Index: " + iCnt);
            }
        }
        System.out.println("steps required: " + steps);
    }

    public static void BinarySearch(int Arr[], int target)
    {
        try
        {
            int steps = 0;
            int left = 0;
            int right = Arr.length - 1;
            while(left <= right)
            {
                steps++;
                int mid = (left + right) / 2;
                if(Arr[mid] == target)
                {
                    System.out.println("Element Found At Index: " + mid);
                    break;
                }
                else if(Arr[mid] < target)
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
            System.out.println("steps required: " + steps);
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
    }
}
