package pkg1;

public class Parent {
public void obj()
{
	this.obj2(4,4);
	System.out.println("Default Parent Constructor");
}

public void obj1(int a)
{
	this.obj4(3,3,3,3);
	System.out.println("One Parent Constructor");
}
public void obj2(int a, int b)
{
	System.out.println("Two Parent Constructor");
}
public void obj3(int a , int b , int c)
{
	this.obj1(4);
	System.out.println("Three Parent Constructor");
}
public void obj4(int a , int b , int c , int d)
{
	this.obj();
	System.out.println("Four Parent Constructor");
}
public static void main(String[] args)
{
	Parent method = new Parent();
}
}
