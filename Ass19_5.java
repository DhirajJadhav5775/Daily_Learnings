/*
 * Accept array from user and check whether that array is sorted in 
decreasinng order or not.
 */

 static boolean SortArray(int iSize, int Arr[]) throws ArrayIndexOutOfBoundsException
 {
     for(int iCnt = 0; iCnt < iSize - 1; iCnt++)
     {
         if(Arr[iCnt] > Arr[iCnt + 1])
         {
             continue;
         }
         else
         {
             return false;
         }
     }
     return true;
 }

 public static void main(String[] args) {
     try{
     Scanner sobj = new Scanner(System.in);
     System.out.println("Enter The Size Of The Array: ");
     int iSize = sobj.nextInt();

     int Arr[] = new int[iSize];
     System.out.println("Enter The Elements: ");
     for(int iCnt = 0; iCnt < iSize; iCnt++)
     {
         Arr[iCnt] = sobj.nextInt();
     }
     boolean bRet = SortArray(iSize, Arr);
     if(bRet == true)
     {
         System.out.println("Given Array Is Sorted Array: ");
     }
     else
     {
         System.out.println("Unsorted Array");
     }
 }
     catch(ArrayIndexOutOfBoundsException e)
     {
         System.out.println(e);
     }
 }
