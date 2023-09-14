import java.util.Scanner;
class LeapY
{
	private int n;
	public int setData(Scanner sc)
	{
		System.out.print("Enter a number=");
		int n=sc.nextInt();
		this.n=n;
		return n;
	}
	public void leap()
	{
          if(n%4==0)
          System.out.println("leap year");
          if(n%4!=0)
          System.out.println("not a leap year");		
	}
}
class Test
{
	public static void main(String args[])
	{
		LeapY ob=new LeapY();
		Scanner sc=new Scanner(System.in);
		ob.setData(sc);
		ob.leap();
	}
}

