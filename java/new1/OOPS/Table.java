import java.util.Scanner;
class Table
{
	private int n;
	public int setData(Scanner sc)
	{
		System.out.print("Enter a number=");
		int n=sc.nextInt();
		this.n=n;
		return n;
	}
	public void table()
	{
		int i=1,a=0;
		while(i<=10)
		{
			a=n*i;
			System.out.println(n+"*"+i+"="+a);
			i++;
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		Table ob=new Table();
		Scanner sc=new Scanner(System.in);
		ob.setData(sc);
		ob.table();
	}
}
