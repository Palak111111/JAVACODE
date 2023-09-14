class PowerFourteen
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
int j=2;
double div=1;
	do
	{
	System.out.print(j+"/" +x+ "^"+i);
	if(i%2==0&&i<y)
	System.out.print("+");
	else if (i<y)
	System.out.print("-");
	 b=b*x;
	 div=(i+1)/b;
	 if (i%2==0)
	 a=a-div;
	 else
	 a=a+div;	
	i++;
	j++;
	}
	while(i<=y);
	System.out.print(" = " +a);
	}
}

// Output= 2/2^1-3/2^2+4/2^3-5/2^4+6/2^5 = 0.625
