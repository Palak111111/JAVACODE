class PFour 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("Enter number:");
int x=sc.nextInt();
System.out.print("Enter number:");
int  y=sc.nextInt();
int i=1;
double b=1;
double a=0;
double div=0;
	do
	{
	System.out.print(x+"^"+i+ "/"+i);
	if(i<y)
	System.out.print("+");
	 b=b*x;
	 div=b/(i);
	 a=a+div;	
	i++;
	System.out.print(" = " +a);
	}
	
	
	while(i<=y);
	}
}

// OUTPUT= 2.0^1/1+2.0^2/1+2.0^3/1+2.0^4/1+2.0^5/1 = 17.066666666666666
