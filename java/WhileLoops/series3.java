class SeriesThree
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
	if(i%2==0  && i<n)
{
	System.out.print("-");
	}
	else
	System.out.print("+");

sum=sum*i;
if(i%2==0)
s=s+sum;
else
s=s-sum;
i++;
}
System.out.print("="+s);
}
}
// output
// !1+!2-!3+!4-!5= -101
