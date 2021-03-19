package pkg1;

import java.util.Scanner;

public class Swap_With {
	public static void main(String[] args)
	{
		int x,y,t;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of X and Y");
		x = s.nextInt();
		y = s.nextInt();
		t=x;
		x=y;
		y=t;
		System.out.println("After swaping:"+x+" "+y);
				
				
	}

}
