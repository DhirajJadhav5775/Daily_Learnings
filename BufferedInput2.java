import java.io.*;
import java.util.*;

public class BufferedInput2 
{
    public static void main(String args[])
    {
        try
        {
            // System.out.println("Enter The Number: ");
            // InputStreamReader in = new InputStreamReader(System.in);
            // BufferedReader bobj = new BufferedReader(in);

            // int iNo = Integer.parseInt(bobj.readLine());
            // System.out.println(iNo);

            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int iNo = obj.nextInt();
            System.out.println(iNo);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("OOPS");
        }
    }    
}
