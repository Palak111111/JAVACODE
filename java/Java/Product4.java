import java.util.Scanner;
//!1/1+!2/2+!3/3+!4/4+!5/5=34
class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=sc.nextInt();
	int i=1;
	int fact=1;
	int div=0;
	int sum=0;
	while(i<=n)
	{
	 	fact=fact*i;
		div=fact/i;
		sum=sum+div;
		System.out.println(fact);
		i++;
	}	
		
	System.out.println(sum);
	}
}

