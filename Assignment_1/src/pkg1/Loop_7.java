package pkg1;

public class Loop_7 {
	public static void main(String[] args) {
		
	int m=1;
	int n=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=n-1;j>=i;j--)
		{
		System.out.print(" ");	
		}
	for(int k=1;k<=m;k++)
	{
		System.out.print("*");
	}
	System.out.println();
	m+=2;
	}
}

}
