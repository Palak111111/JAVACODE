class PowerSixteen
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
double div=1;
	while(i<=y)
	{
	System.out.print(i+"^" +x+ "/"+j);
	if(i<y)
	System.out.print("+");
	 b=b*x;
	 div=b/j;
	 a=a+div;	
	i++;
	j=j+2;
	}
	System.out.print(" = " +a);
	}
}


// OUTPUT= 1^2/1+2^2/3+3^2/5+4^2/7+5^2/9 = 10.774603174603175
