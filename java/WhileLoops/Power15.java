class PowerFiveteen
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
	System.out.print(j+"/" +x+ "^"+i);
	if(i%2==0&&i<y)
	System.out.print("-");
	else if (i<y)
	System.out.print("+");
	 b=b*x;
	 div=(i+1)/b;
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

