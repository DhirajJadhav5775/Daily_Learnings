public class InsertionSort 
{
    public static void main(String args[])
    {
        int arr[] = {5,6,2,3,1};
        System.out.println("Given Array: ");
        for(int i : arr)
        {
            System.out.print(" " + i);
        }
        System.out.println();

        InsertionSort(arr);
    }   

    public static void InsertionSort(int arr[])
    {
        int key = 0;
        for(int i = 1; i < arr.length; i++)
        {
            key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array After Sorting: ");
        for(int i : arr)
        {
            System.out.print(" " + i);
        }
    }
}
