import java.util.Scanner;
class Arm
{
	private int n;
	public int setData(Scanner sc)
	{
		System.out.println("Enter a number");
		int a=sc.nextInt();
		this.n=a;
		return a;
	}
	public int armstrong()
	{
		int r=0,s=0;
		while(n!=0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		return s;
	}
}
class Test
{
	public static void main(String args[])
	{
		Arm ob=new Arm();
		Scanner sc=new Scanner(System.in);
		int t=ob.setData(sc);
		int res=ob.armstrong();
		if(res==t)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}
