public class InsertionSort
{
    public static void main(String args[])
    {
        int nums[] = {3,4,5,1,2,0};
        System.out.println("Array Before Sorting: ");
        for(int i : nums)
        {
            System.out.print(" " + i);
        }
        System.out.println();
        insertionSort(nums);
    }

    public static void insertionSort(int nums[])
    {
        System.out.println("Array After Sorting: ");

        for(int i = 0; i < nums.length -1; i++)
        {
            for(int j = i + 1; j > 0; j--)
            {
                if(nums[j] < nums[j - 1])
                {
                    int iTemp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = iTemp;
                }
                else
                {
                    break;
                }
            }
            for(int p : nums)
            {
                System.out.print(" "+ p);
            }
            System.out.println();
        }
        System.out.println("Array After Sorting: ");
        for(int num : nums)
        {
            System.out.print(" " + num);
        }
    }
}
