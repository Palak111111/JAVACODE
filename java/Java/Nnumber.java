import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=sc.nextInt();
	int i=1;
	int x=1;
	int sum=0;
	while(i<=n)
	{
		x=n*i;
		sum=sum+x;
		System.out.println(n+"*"+i+"="+x);
		i++;
	}
	System.out.println(sum);
	}
}
