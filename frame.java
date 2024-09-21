import javax.swing.*;
import java.awt.*;

class createframe extends JFrame
{
    public createframe()
    {
        super("New Frame");
        setSize(100,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class frame 
{
    public static void main(String args[])
    {
        createframe cf1 = new createframe();
    }
}