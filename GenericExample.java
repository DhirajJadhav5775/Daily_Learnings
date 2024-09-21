public class GenericExample 
{
    public static void main(String args[])
    {
        PrinterGen<Double> PG = new PrinterGen<>(10.0);
        PG.Print();
    }    
}

