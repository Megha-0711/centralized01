package pkg1;

public class Loop_6 {
	public static void main(String[] args) 
	{
		int m=4;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=m;k++)
			{
			System.out.print(" ");	
			}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		m--;
		}
}
}
