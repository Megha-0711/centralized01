package pkg1;

public class Dayy2
{
	public int sum(int x1,int x2)
	{
		int x3;
		x3=x1+x2;
		System.out.println("Sum is "+x3);
		return x3;
	}
	public int sub(int x4, int x5)
	{
		int x6;
		x6=x4-x5;
		System.out.println("Sub is "+x6);
		return x6;
	}
	public void mul(int x7,int x8)
	{
		int x9;
		x9=x7*x8;
		System.out.println("Final result is "+x9);

	}
	public int div(int x10, int x11)
	{
		int x12;
		x12=x10/x11;
		System.out.println("Div is "+ x12);
		return x12;
	}
	public static void main(String[] args)
	{
	Dayy2 bodmas=new Dayy2();
	int result1=bodmas.div(10,2);
	int result2=bodmas.sum(result1,2);
	int result3=bodmas.sub(result2,2);
	int result4=bodmas.sum(result3,2);
	bodmas.mul(result4,2);
	}
}
	

