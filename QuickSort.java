public class QuickSort 
{
    public static void quickSort(int nums[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi - 1); // Recursive call to the left of the pivot
            quickSort(nums, pi + 1, high); // Recursive call to the right of the pivot
        }
    }
    
    public static int partition(int nums[], int low, int high)
    {
        int pivot = nums[high];
        int i = low - 1;

        for(int j = low; j < high; j++)
        {
            if(nums[j] < pivot)
            {
                i++;
                // Swap nums[i] and nums[j]
                int iTemp = nums[i];
                nums[i] = nums[j];
                nums[j] = iTemp;
            }
        }
        // Swap nums[i + 1] and nums[high] (pivot)
        int iTemp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = iTemp;

        return i + 1; // Return the pivot index
    }

    public static void main(String[] args)
    {
        int nums[] = {2, 4, 1, 5, 3, 8, 11, 7};
        int size = nums.length;

        quickSort(nums, 0, size - 1); // Correct range for quicksort

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }    
}
