package pkg1;

public class Day2 
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
public int mul(int x7,int x8)
{
	int x9;
	x9=x7*x8;
	System.out.println("Mul is "+x9);
	return x9;
}
public void div(int x10, int x11)
{
	int x12;
	x12=x10/x11;
	System.out.println("Final result is "+ x12);
}
public static void main(String[] args)
{
Day2 bodmas=new Day2();
int result1=bodmas.sum(10,2);
int result2=bodmas.sub(result1,2);
int result3=bodmas.sum(result2,2);
int result4=bodmas.mul(result3,2);
bodmas.div(result4,2);



}
}
