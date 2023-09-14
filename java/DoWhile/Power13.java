class PowerThirteen
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("Enter Number :");
int x= sc.nextInt();
System.out.print("Enter Number :");
int y= sc.nextInt();
int i=1;
double b=1;
double a=0;
int j=2;
double div=1;
	do
	{
	System.out.print(j+"/"+x+"^"+i);
	if(i%2==0&&i<y)
	System.out.print("+");
	
	 
	 a=a+div;	
	i++;
	j++;
	}
	while(i<=y);
	System.out.print(" = " +a);
	}
}

//2/2^13/2^2+4/2^35/2^4+6/2^5 = 5.0
