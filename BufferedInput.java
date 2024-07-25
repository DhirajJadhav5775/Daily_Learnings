import java.io.*;

class BufferedInput
{
    public static void main(String arg[])
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        String Name = null;
        int Age = 0;
        float Marks = 0.0f;

    try
    {
        System.out.println("Enter Your Name: ");
        Name = bobj.readLine();

        System.out.println("Enter Your Age: ");
        Age = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Your Marks: ");
        Marks = Float.parseFloat(bobj.readLine());
    }
    catch(IOException obj)
    {}
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Marks: "+Marks);

    }
}