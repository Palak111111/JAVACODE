class PowerTwelve
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
	System.out.print(i+"^" +x+ "/"+j);
	if(i%2==0&&i<y)
	System.out.print("-");
	else if (i<y)
	System.out.print("+");
	 b=b*x;
	 div=b/(i+1);
	 if (i%2==0)
	 a=a+div;
	 else
	 a=a-div;	
	i++;
	j++;
	}
	while(i<=y);
	System.out.print(" = " +a);
	}
}