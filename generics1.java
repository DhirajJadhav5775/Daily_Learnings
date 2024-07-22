public class generics1
{
    public static <T extends Number> double fun(T iNo1, T iNo2)
    {
        if(iNo1 instanceof Integer)
        {
            return iNo1.intValue() + iNo2.intValue();
        }
        else if(iNo1 instanceof Float)
        {
            return iNo1.floatValue() + iNo2.floatValue();
        }
        else
        {
            return iNo1.doubleValue() + iNo2.doubleValue();
        }
    }

    public static void main(String args[])
    {
        int iNo = 10;
        int iNo2 = 20;

        float fNo = 10.10f;
        float fNo2 = 20.20f;

        double dNo = 10.100;
        double dNo2 = 20.200;

        try
        {
            double iRet = fun(iNo, iNo2);
            System.out.println("Addition of integers: " + iRet);
            double fRet = fun(fNo,fNo2);
            System.out.println("Addition of floats: " + fRet);
            double dRet = fun(dNo, dNo2);
            System.out.println("Addition doubles: " + dRet);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }    
}
