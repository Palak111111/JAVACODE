import java.util.Scanner;
class Factorial
{
	private int n;
	public int setData(Scanner sc)
	{
		System.out.print("Enter a number=");
		int n=sc.nextInt();
		this.n=n;
		return n;
	}
	public void fact()
	{
		int i=1,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		        System.out.println("factorial = "+fact);
		}
	} 
}
class Test
{
	public static void main(String args[])
	{
		Factorial ob=new Factorial();
		Scanner sc=new Scanner(System.in);
		ob.setData(sc);
		ob.fact();
	}
}
