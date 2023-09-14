import java.util.Scanner;
//-!1+!2-!3+!4-!5=-101
class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=sc.nextInt();
	int i=1;
	int fact=1;
	int sum=0;
	while(i<=n)
	{
	 
	if(i%2==0)
	{	
		fact=fact*i;
		sum=sum+fact;
		System.out.println(fact);
		i++;
	}
	else
	{
		fact=fact*i;
	 	sum=sum-fact;
	 	System.out.println(fact);
	 	i++;
	}	
		
	}
	System.out.println(sum);
	}
}
