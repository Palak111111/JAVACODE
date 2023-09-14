import java.util.Scanner;
//!1+!2+!3+!4+!5=153
class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=sc.nextInt();
	int i=1;
	int pro=1;
	int sum=0;
	while(i<=n)
	{
		pro=pro*i;
		sum=sum+pro;
		System.out.println(i+"!+"+");
		i++;
	}
	System.out.println(" ="+sum);
	System.out.println(sum);
	}
}
