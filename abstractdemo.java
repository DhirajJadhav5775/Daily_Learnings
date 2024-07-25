 abstract class A 
{
	int Addition(int No1, int No2)
	{
		return No1 + No2;
	}
	public abstract int Subtraction(int No1, int No2);
}
class B extends A
{
	public int Subtraction(int No1, int No2)
	{
		return No1 - No2;
	}
}

public class abstractdemo
{
	public static void main(String[] args) {
		B obj = new B();
		int iRet1 = obj.Addition(11,21);
		System.out.println("Addition is: " + iRet1);
		int iRet2 = obj.Subtraction(11,21);
		System.out.println("Subtraction is: " + iRet2);

	}
}
 