class Power
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY NUMBER: ");
int y=sc.nextInt();
int i=1;
int b=1;
	while(i<=y)
	{
	 b=b*x;	
	i++;
	}
	System.out.print("power is "+b);
	}
}
