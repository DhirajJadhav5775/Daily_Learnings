// public class MultiThreadApp3 extends Thread
// {
//     public static void main(String args[])
//     {
//         System.out.println("Inside Main Method");
//         MultiThreadApp3 obj = new MultiThreadApp3();
//         MultiThreadApp3 obj2 = new MultiThreadApp3();

//         obj.start();
//         obj2.start();
//     }    
//     public void run()
//     {
//         try
//         {
//             for(int iCnt = 1; iCnt <= 5; iCnt++)
//             {
//                 System.out.println(iCnt);
//                 Thread.sleep(1000);
//             }

//         }
//         catch(Exception e)
//         {
            
//         }
//     }
// }

// class DemoThread implements Runnable
// {
//     public void run()
//     {
//         try
//         {
//             for(int iCnt = 1; iCnt <= 5; iCnt++)
//             {
//                 System.out.println(Thread.currentThread().getName() + " : " + iCnt);
//                 Thread.sleep(1000);
//             }
//         }
//         catch(Exception e)
//         {
//             e.printStackTrace();
//         }
//     }
// }

// public class MultiThreadApp3
// {
//     public static void main(String args[])
//     {
//         System.out.println("Inside Main Method");
//         DemoThread Dobj1 = new DemoThread();
//         DemoThread Dobj2 = new DemoThread();
//         DemoThread Dobj3 = new DemoThread();

//         Thread Tobj1 = new Thread(Dobj1);
//         Thread Tobj2 = new Thread(Dobj2);
//         Thread Tobj3 = new Thread(Dobj3);

//         Tobj1.setName("First");
//         Tobj2.setName("Second");
//         Tobj3.setName("Third");

//         Tobj1.start();
//         Tobj2.start();
//         Tobj3.start();
//     }
// }
import java.util.*;
import java.io.*;

class DemoThread extends Thread
{
    int iNo = 0;
    public DemoThread(int iNo)
    {
        this.iNo = iNo;
    }
    public void run()
    {
        try
        {
            int iMult = 0;
            for(int iCnt = 1; iCnt <= 10; iCnt++)
            {
                iMult = iNo * iCnt;
                System.out.println(iNo + " * " + iCnt + " = " + iMult);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

public class MultiThreadApp3
{
    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        int iNo = scanner.nextInt();
        
        DemoThread obj1 = new DemoThread(iNo);
        DemoThread obj2 = new DemoThread(iNo);

        obj1.start();
        obj2.start();
        // obj1.close();
        // obj2.close();
    }
}