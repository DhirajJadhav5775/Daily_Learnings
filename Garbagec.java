class Demo
{
    int iSize;
    int Arr[];
    public Demo(int iNo)
    {
        iSize = iNo;
        System.out.println("Inside Demo Constructor");
        Arr = new int[iSize];
    }
    protected void Finalize()
    {
        System.out.println("Inside Finalize Method");
        Arr = null;
    }
}

public class Garbagec
{
    public static void main(String[] args) 
    {
        Demo obj = new Demo(4); 
        obj = null;
        System.gc();
    }    
}
