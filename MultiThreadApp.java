class DemoMultiThread extends Thread
{
    int iNo = 0;
    public DemoMultiThread(int iNum)
    {
        this.iNo = iNum;
    }

    public void run()
    {
        try
        {
            for(int iCnt = 1; iCnt <= 5; iCnt++)
            {
                System.out.println(iCnt + " From Thread " + iNo);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){}
    }
}

public class MultiThreadApp 
{
    public static void main(String ar[])
    {
        for(int i = 1; i < 6; i++)
        {
            DemoMultiThread obj = new DemoMultiThread(i);
            obj.start();
        }
    }    
}
