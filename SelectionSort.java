public class SelectionSort {

    public static void selectionSort(int[] nums) {
        int iSize = nums.length;

        for (int i = 0; i < iSize - 1; i++) {
            // Assume the current index has the minimum value
            int minIndex = i;

            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < iSize; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int iTemp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = iTemp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(nums);

        System.out.println("After Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
