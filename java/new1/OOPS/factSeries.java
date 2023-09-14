import java.util.Scanner;
class FactorialS
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
		int i=1,fact=1,s=0;;
		while(i<=n)
		{
		System.out.print("!"+i);
		 if(i<n)
		 {
		  System.out.print("+");
		 }
			fact=fact*i;
			s= fact+s;
			i++;
	        }
		System.out.println(" = "+s);
		}
	} 

class Test
{
	public static void main(String args[])
	{
		FactorialS ob=new FactorialS();
		Scanner sc=new Scanner(System.in);
		ob.setData(sc);
		ob.fact();
	}
}
