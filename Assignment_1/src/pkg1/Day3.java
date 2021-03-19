package pkg1;

public class Day3 
{
	public Day3()
	{
		this(7,6,3,8);
		System.out.println("Default Constructor");
	
	}
	
	public Day3(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	public Day3(int a, int b)
	{
		this(4,5,6);
		System.out.println("Two Parameterized Constructor");
	}
	public Day3(int a, int b, int c)
	{
		this(9);
		System.out.println("Three Parameterized Constructor");
	}
	public Day3(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Constructor");
	}
public static void main(String[] args) 
{
	Day3 constructor = new Day3(2,3);
}
}

