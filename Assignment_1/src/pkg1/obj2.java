package pkg1;

import java.util.Scanner;

public class obj2 extends obj
{
	public static void main(String[] args)
	{
		obj rule = new obj();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First number");
		int x1= s.nextInt();
		System.out.println("Enter Second number");
		int x2= s.nextInt();
		int x3=rule.div(x1, x2);
		System.out.println("Division of First and Second number is "+x3);
		
		System.out.println("Enter third number which you want to add in above result.");
		int x4= s.nextInt();
		int x5=rule.sum(x3, x4);
		System.out.println("Sum is "+x5);
		
		System.out.println("Enter Fourth number which you want to substract from above result.");
		int x6= s.nextInt();
		int x7=rule.sub(x5, x6);
		System.out.println("Result is "+x7);
		
		System.out.println("Enter Fifth number which you want to Substract from above result.");
		int x8= s.nextInt();
		int x9=rule.sub(x7, x8);
		System.out.println("Result is "+x9);
		
		System.out.println("Enter Sixth number which you want to multiple with above result.");
		int x10= s.nextInt();
		int x11=rule.mul(x9, x10);
		System.out.println("Final result is "+x11);
}
}
