package pkg1;

public class Day1
{
int age;
int roll_no;
public void display1()
{
	System.out.println("Welcome all.");
}
public void display2()
{
	System.out.println("Automation is very easy.");
}
public static void main(String[] args) 
{
	Day1 data=new Day1();
	data.display1();
	data.age=20;
	System.out.println("Age is "+data.age);
	data.display2();
	data.roll_no=24;
	System.out.println("Roll no. is "+data.roll_no);

}
}