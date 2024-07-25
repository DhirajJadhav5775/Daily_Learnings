import java.util.*;
import myPackage.Arithmetic1;

public class importpackage 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int iNo1 = obj.nextInt();

        System.out.println("Enter The Second Number: ");
        int iNo2 = obj.nextInt();

        Arithmetic1 aobj = new Arithmetic1(iNo1, iNo2);

        int iRet = aobj.Addition();
        System.out.println("Addition is: " + iRet);

        iRet = aobj.Subtraction();
        System.out.println("Subtraction is: " + iRet);
    }    
}
