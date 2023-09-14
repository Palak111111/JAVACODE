class PowerFour
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
double x=sc.nextDouble();
System.out.print("ENTER ANY  Second NUMBER: ");
double y=sc.nextDouble();
int i=1;
double b=1;
double a=0;
int j=1;
double div=0;
	while(i<=y)
	{
	System.out.print(x+"^"+i+ "/"+j);
	if(i<y)
	System.out.print("+");
	 b=b*x;
	 div=b/(i);
	 a=a+div;	
	i++;
	
	}
	System.out.print(" = " +a);
	}
}
//OUTPUT= 2.0^1/1+2.0^2/1+2.0^3/1+2.0^4/1+2.0^5/1 = 17.066666666666666
