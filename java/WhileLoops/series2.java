class SeriesTwo
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER=");
int n=sc.nextInt();
int i=1;
int sum=1;
int s=0;
while (i<=n)
{
System.out.print("!"+i);
	if(i%2==0)
{
	System.out.print("+");
	}
	else
	System.out.print("-");

sum=sum*i;
s=sum-s;
i++;
}
System.out.print("="+s);
}
}

