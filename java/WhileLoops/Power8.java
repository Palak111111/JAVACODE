class PowerEight
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int i=1;
double b=1;
double a=0;
double div=0;
	while(i<=y)
	{
	System.out.print(i+"/" +x+ "^"+i);
	if(i<y&& i%2==0)
	{
	System.out.print("+");
	}
	else if(i<y)
	System.out.print("-");
	 b=b*x;
	 div=i/b;
	 if(i%2==0)
	 a=a-div;
	 else
	  a=a+div;	
	i++;
	
	}
	System.out.print(" = " +a);
	}
}




// OUTPUT = 1/2^1-2/2^2+3/2^3-4/2^4+5/2^5 = 0.28125
