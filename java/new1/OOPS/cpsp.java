import java.util.Scanner;
class Amount
{
	int c,s;
	public void input(Scanner sc,Amount ob)
	{
		System.out.println("Enter cost price");
		int cp=sc.nextInt();
		System.out.println("Enter selling price");
		int sp=sc.nextInt();
		ob.setData(cp,sp);
	}
	public void setData(int cp,int sp)
	{
		this.c=cp;
		this.s=sp;
	}
	public void profitLoss()
	{
		int profit=0,loss=0;
		if(s>c)
		{
			profit=s-c;
			System.out.println("profit="+profit);
		}
		else if(c>s)
		{
			loss=c-s;
			System.out.println("loss="+loss);
		}
		else if(c==s)
		System.out.println("No profit No loss");
	
	}
}
class Test
{
	public static void main(String args[])
	{
		Amount ob=new Amount();
		Scanner sc=new Scanner(System.in);
		ob.input(sc,ob);
		ob.profitLoss();
	}

}
