package pkg1;

import java.util.Scanner;

public class Prime 
{
public static void main(String[] args) 
{
	Scanner s= new Scanner(System.in);
	System.out.println("Please enter value of a");
	int n = s.nextInt();
	int temp=0;
	for(int i=2; i<=n-1; i++)
	{
	if(n%i==0)
	{
		temp=temp+1;
	}
	}
	if(temp==0)
	{
		System.out.println(n+ "is a prime number");
	}
	else
	{
		System.out.println(n+ " is not a prime number");
	}
}
}
