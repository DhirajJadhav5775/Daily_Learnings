import java.util.Arrays;
import java.util.Scanner;

public class program 
{
    public static void main(String ar[])
    {
        int num1 = 10;
        int num2 = 20;
        
        System.out.println("Enter your choice: ");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println(num1+num2);
                break;
        
            case 2:
                System.out.println(num1-num2);
                break;

            case 3:
                System.out.println(num1*num2);
                break;

            case 4:
                System.out.println(num1/num2);
                break;

            default:
                break;
        }

        BinarySearch();
    }    

    public static void BinarySearch()
    {
        int nums[] = {34,12,4,23,56,88,02};
                      //02,4,12,23,34,56,88
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Element To Search For: ");
        int target = scan.nextInt();

        int start = 0;
        int end = nums.length-1;
        int mid = start + end / 2;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println("Step: "+i);
            if(target == nums[mid])
            {
                System.out.println("Element Found At: " + mid);
                break;
            }
            else if (target < nums[mid])
            {
                end = mid;
                mid = start + end / 2;
            }
            else if(target > nums[mid])
            {
                start = mid;
                mid = start + end / 2;
            }
            else{
                System.out.println("Element Not Found.");
            }
        }
    }
}


// [
//     DATA A TYPE I VALUE 10.
//     DATA B TYPE I VALUE 20.
//     DATA C TYPE I.
//     C = A + B.

//     WRITE: 'ADDITION IS: ',C.


//     PARAMETERS A TYPE I.
//     PARAMETERS B TYPE I.

//     DATA SUM TYPE I.
//     SUM = A+B.
//     WRITE: 'ADDITION IS: '
// ]