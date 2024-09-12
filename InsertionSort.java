public class InsertionSort 
{
    public static void main(String args[])
    {
        int arr[] = {5,6,2,3,1,70,92,4};
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
        for(int i = 1; i < arr.length; i++)
        {
            int iTemp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > iTemp)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = iTemp;
        }
        System.out.println("Sorted Array: ");
        for(int num : arr)
        {
            System.out.print(" " + num);
        }
    }
}