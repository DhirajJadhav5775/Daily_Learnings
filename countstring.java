import java.util.*;

public class countstring 
{

    static void CountCharacter(String str)
    {
        int count = 0;
        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter The String: ");
        str = obj.nextLine();

        CountCharacter(str);
    }    
}
