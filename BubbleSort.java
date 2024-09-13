/*public class BubbleSort
{
    public static void main(String args[])
    {
        int nums[] = {6,5,2,8,9,4};
        int iSize = nums.length - 1;
        int iTemp = 0;
        System.out.println("Before Sorting: ");
        for(int i : nums)
        {
            System.out.print(" " + i);
        }

        System.out.println();
        for(int i = 0; i < iSize; i++)
        {
            for(int j = 0; j < iSize - i; j++)
            {
                if(nums[j] > nums[j + 1])
                {
                    iTemp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = iTemp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for(int i: nums)
        {
            System.out.print(" " + i);
        }
    }
}*/

// public class BubbleSort
// {
//     public static void main(String[] args)
//     {
//         int nums[] = {6,5,2,8,9,4};
//         int iSize = nums.length - 1;
//         int iTemp = 0;

//         System.out.println("Before Sorting: ");
//         for(int iCnt : nums)
//         {
//             System.out.print(" " + iCnt);
//         }
//         System.out.println();
//         System.out.println("After Sorting: ");

//         for(int i = 0; i < iSize; i++)
//         {
//             for(int j = 0; j < iSize; j++)
//             {
//                 if(nums[j] > nums[j + 1])
//                 {
//                     iTemp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = iTemp;
//                 }
//             }
//         }

//         for(int i: nums)
//         {
//             System.out.print(" " + i);
//         }
//     }
// }

public class BubbleSort
{   
    public static void main(String ar[])
    {
        int nums[] = {10,12,8,9,13,90,3};
        int iSize = nums.length - 1;

        System.out.println("Before Sorting: ");
        for(int iCnt : nums)
        {
            System.out.print(" " + iCnt);
        } System.out.println();
        BubbleSort(nums,iSize);
    }

    public static void BubbleSort(int nums[], int iSize)
    {
        int iTemp = 0;
        int steps = 0;
        for(int i = 0; i < iSize; i++)
        {
            steps++;
            for(int j = 0; j < iSize; j++)
            {
                if(nums[j] > nums[j + 1])
                {
                    iTemp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = iTemp;
                }
            }
                for(int iCnt : nums)
                {
                    System.out.print(" " + iCnt);
                }
                System.out.println();
        }
        System.out.println("After Sorting: ");
        for(int iCnt : nums)
        {
            System.out.print(" " + iCnt);
        }
        System.out.println();
        System.out.println("Steps Required: " + steps);
    }
}