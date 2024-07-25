abstract class Base
{
    Base(int a, int b)
    {
        int iSum = a + b;
        System.out.println("Addition is: " + iSum);
    }
}
public class Derived extends Base
{
    Derived()
    {
        super.Base(11,21);
        System.out.println("Derived Constructor");
    }
}

public class Abstractinherit {
    public static void main(String args[])
    {
        Derived dobj = new Derived();
    }
}
