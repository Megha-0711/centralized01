package pkg1;

import java.util.Scanner;

public class Swap_without {
	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter value of X and Y");
		Scanner s = new Scanner(System.in);
		x= s.nextInt();
		y= s.nextInt();
		x = x + y;
	    y= x - y;
		x =x - y;
		System.out.println("After swaping:"+x+" "+y);
		
		
		
		
		
	}

}
