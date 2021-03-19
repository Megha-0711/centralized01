package pkg1;

public class Selenium extends Automation
{

		public Selenium()
		{
			super(4,3,3,4);
			System.out.println("child Default Constructor");
		}
		public Selenium(int a)
		{
			this(3,2,4);
			System.out.println("child one parameterized Constructor");
		}
		public Selenium(int a, int b)
		{
			this(6,3,2,2);
			System.out.println("child two parameterized Constructor");
		}
		public Selenium(int a , int b , int c)
		{
			this(2,2);
			System.out.println("child three parameterized Constructor");
		}
		public Selenium(int a , int b , int c , int d)
		{
	        this();
			System.out.println("child four parameterized Constructor");
		}
		public static void main(String[] args) {
			Selenium constructor = new Selenium(4);
		}
	}

