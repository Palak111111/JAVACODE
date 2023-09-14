class PowerTwelve
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
	while(i<=y)
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
	System.out.print(" = " +a);
	}
}

// OUTPUT= 1^2/2+2^2/3-3^2/4+4^2/5-5^2/6 = -3.8
