package pkg1;

public class Fibo {

	public static void main(String[] args) {
		
		int a=0, b=1, c;
		System.out.println(""+a);
		System.out.println(""+b);
		for(int i=1; i<=10;i++)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
		
	}
}