package pkg1;

public class Child extends  Parent
{
	public void ob()
	{
		super.obj3(3,3,3);
		this.ob3(3,3,3);
		System.out.println("Default Child Constructor");
	}

	public void ob1(int a)
	{
		this.ob2(2,2);
		System.out.println("One Child Constructor");
	}
	public void ob2(int a , int b)
	{
		this.ob();
		System.out.println("Two Child Constructor");
	}
	public void ob3(int a , int b, int c)
	{
		System.out.println("Three Child Constructor");
	}
	public void ob4(int a , int b, int c , int d)
	{
		this.ob1(1);
		System.out.println("Four Child Constructor");
	}
	public static void main(String[] args) {
		Child method = new Child();
		method.ob4(3,3,3,3);
	}
}

