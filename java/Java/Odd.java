import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=10;
	int i=1,num;
	int sum=0;
	while(i<=n)
	{
		num=i*2-1;
		sum=sum+num;
		System.out.println(num);
		i++;
	}
	System.out.println(sum);
	}
}
