public class BinarySearch 
{
    public static void main(String args[])
    {
        int Arr[] = {1,3,5,7,9,11,13};
        int target = 5;
        
        int start = Arr[0];
        int end = (Arr.length)-1;
        for(int iCnt = start; iCnt < end; iCnt++)
        {
            int mid = start + end / 2;
            if(Arr[mid] == target)
            {
                System.out.println(iCnt);
            }
            else if(Arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
    }
}
