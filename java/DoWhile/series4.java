class SeriesFour
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER=");
int n=sc.nextInt();
int i=1;
int sum=1;
int s=0;
int div=0;
do
{
System.out.print("!"+i+ "/"+i);
	if(i<n)
{
	System.out.print("+");
	}
sum=sum*i;
div=sum/i;
s=s+div;
i++;
}
while (i<=n);
System.out.print("="+s);
}
}
// OUTPUT
// !1/1+!2/2+!3/3+!4/4+!5/5=34
