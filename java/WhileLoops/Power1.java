class PowerOne
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int i=1;
int b=1;
int a=0;
	while(i<=y)
	{
	System.out.print(x+"^"+i);
	if(i<y)
	System.out.print("+");
	 b=b*x;
	 a=b+a;	
	i++;
	}
	System.out.print(" power is " +a);
	}
}
