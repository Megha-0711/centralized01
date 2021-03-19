package pkg1;

import java.util.Scanner;

public class Palindrome
{
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
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(n==rev)
	{
		System.out.println(n+" is a palindrom number");
	}
	else
	{
		System.out.println(n+" is not a palindrom number");
	}


}
}