class PowerTwo
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
	do
	{
	System.out.print(x+"^"+i);
	if(i%2==0&&i<y)
	System.out.print("+");
	else if(i<y)
		System.out.print("-");
	 b=b*x;
	 if(i%2==0)
	 a=a-b;
	 else
	 a=a+b;
	
	i++;
	}
	while(i<=y);
	System.out.print(" power is " +a);
	}
}
