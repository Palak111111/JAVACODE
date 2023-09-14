import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=4;
	int i=1,j;
	int sum=0;
	while(i<=n)
	{
		j=i*i*i;
		sum=sum+j;
		System.out.println(j);
		i++;
	}
	System.out.println(sum);
	}
}
