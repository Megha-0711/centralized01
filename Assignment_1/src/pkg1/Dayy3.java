package pkg1;

public class Dayy3 {

	public void d()
	{
		System.out.println("Default Method");
	}
	public void d1(int a)
	{
		System.out.println("One Parameterized method");
	}
	public void d2(int a, int b)
	{
		System.out.println("Two Parameterized method");
		
	}
	public void d3(int a, int b, int c)
	{
		System.out.println("Three Parameterized method");
		this.d();
		this.d4(5,4,3,5);
		this.d2(3,2);
		this.d1(7);
	}
	public void d4(int a,int b, int c, int d)
	{
		System.out.println("Four Parameterized method");
	}
	public static void main(String[] args) {
		Dayy3 method = new Dayy3();
		method.d3(4,5,6);
	}
}
