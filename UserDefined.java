import java.util.*;

class AgeInvalidException extends Exception
{
    AgeInvalidException(String str)
    {
        super(str);
    }
}

class UserDefined
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int iAge = sobj.nextInt();

        try 
        {
            if(iAge < 15)
            {
                AgeInvalidException aobj = new AgeInvalidException("Your Age Is Less Than 15");
                //throw aobj();
                throw new AgeInvalidException("Your Age Is Less Than 15");
            }
            else
            {
                System.out.println("Age Is Valid");
            }
        }
        catch(AgeInvalidException obj)
        {
            System.out.println(obj);
        }
    }
}
