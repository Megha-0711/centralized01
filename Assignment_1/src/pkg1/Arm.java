package pkg1;

import java.util.Scanner;

public class Arm {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter number");
		int n = s.nextInt();
		int temp=n;
		int rev=0, rem;
		
		while(temp>0)
		{
			rem=temp%10;
			rev=rem*rem*rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println(n+" is an armstrong number");
		}
		else
		{
			System.out.println(n+" is not an armstrong number");
		}


	}

}
