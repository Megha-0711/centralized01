package pkg1;

public class Automation 
{
	public Automation()
	{
	this(4,4,4);
		System.out.println("Parent Default Constructor");
	}
	public Automation(int a)
	{
	this();
		System.out.println("Parent one parameterized Constructor");
	}
	public Automation(int a, int b)
	{
		this(4);
		System.out.println("Parent two parameterized Constructor");
	}
	public Automation(int a , int b , int c)
	{
		System.out.println("Parent three parameterized Constructor");
	}
	public Automation(int a , int b , int c , int d)
	{
		this(2,3);
		System.out.println("Parent four parameterized Constructor");
	}
	public static void main(String[] args)
	{
		Automation constructor = new Automation();
	}
	
}
