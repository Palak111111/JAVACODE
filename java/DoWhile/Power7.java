class PowerSeven
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
int j=1;
double div=0;
	do

	{
	System.out.print(j+"/" +x+ "^"+i);
	if(i<y)
	System.out.print("+");
	 b=b*x;
	 div=(i)/b;
	 a=a+div;	
	i++;
	
	}
		while(i<=y);
	System.out.print(" = " +a);
	}
}
// OUTPUT= 1/2^1+1/2^2+1/2^3+1/2^4+1/2^5 = 1.78125
