import java.util.*;

/*public class generics3<T extends Number> {
    private T n1, n2;

    public generics3(T n1, T n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public T addition() {
        if (n1 instanceof Integer && n2 instanceof Integer) {
            return (T) (Integer) ((n1.intValue() + n2.intValue()));
        } else if (n1 instanceof Float && n2 instanceof Float) {
            return (T) (Float) ((n1.floatValue() + n2.floatValue()));
        } else if (n1 instanceof Double && n2 instanceof Double) {
            return (T) (Double) ((n1.doubleValue() + n2.doubleValue()));
        }
        throw new UnsupportedOperationException("Operation not supported for given types.");
    }

    public static void main(String[] args) {
        int iNo1 = 10, iNo2 = 20;
        float fNo1 = 10.0f, fNo2 = 20.0f;
        double dNo1 = 10.0, dNo2 = 20.0;

        generics3<Integer> intAddition = new generics3<>(iNo1, iNo2);
        System.out.println(intAddition.addition());

        generics3<Float> floatAddition = new generics3<>(fNo1, fNo2);
        System.out.println(floatAddition.addition());

        generics3<Double> doubleAddition = new generics3<>(dNo1, dNo2);
        System.out.println(doubleAddition.addition());
    }
}
*/

/*public class generics3
{

    public static <T> void GenFunction(T Arr[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public static void main(String args[])
    {
        Integer iArr[] = {10,20,30,40};
        GenFunction(iArr);

        Character cArr[] = {'D','H','I','R','A','J'};
        GenFunction(cArr);
    }
}*/

public class generics3
{

    public static <T extends Number> double PrintArray(T n1, T n2)
    {
        if(n1 instanceof Integer)
        {
            return n1.intValue() + n2.intValue();
        }
        else if(n1 instanceof Float)
        {
            return n1.floatValue() + n2.floatValue();
        }
        else if(n1 instanceof Double)
        {
            return n1.doubleValue() + n2.doubleValue();
        }
        else 
        {
            throw new UnsupportedOperationException("Type Not Supported");
        }
    }

    public static void main(String args[])
    {
        Integer iNo1 = 10;
        Integer iNo2 = 20;

        Float fNo1 = 10.0F;
        Float fNo2 = 20.0F;

        System.out.println("Addition of integers: " + PrintArray(iNo1,iNo2));
        System.out.println("Addition of floats: " + PrintArray(fNo1,fNo2));
    }
}