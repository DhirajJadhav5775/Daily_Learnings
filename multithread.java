class ThreadDemo1 extends Thread
{
    public void run()
    {
        System.out.println("ThreadDemo1 run method");
        for(int iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.print(" "+ iCnt);

        }
    }
}
class ThreadDemo2 extends Thread
{
    public void run()
    {
        System.out.println("ThreadDemo2 run method");
        for(int iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.print(" "+iCnt);
        }
    }
}

public class ThreadDemo6
{
    public static void main(String[] args) 
    {
        ThreadDemo1 td1 = new ThreadDemo1(); //thread object goes into new state as we crete new object
        ThreadDemo2 td2 = new ThreadDemo2(); //thread object goes into new state as we crete new object

        td1.start();
        try {
            Thread.sleep(1000); // Main thread sleeps for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        td2.start();
    }
}
