class SeriesThirteen
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("ENTER NUMBER=");
double n=sc.nextDouble();
double s=0;
for (double i=1,sum=1,j=2,div=0;i<=n;i++)
{
System.out.print("!"+i+"/"+j);
	if(i<n && i%2==0)
{
	System.out.print(" - ");
	}
	else if(i<n)
	 System.out.print(" + ");
sum=sum*i;
div=sum/(i+1);
if(i%2==0)
{
s=s+div;
}
else
s=s-div;

j++;
}
System.out.print("="+s);
}
}
// !1.0/2.0 + !2.0/3.0 - !3.0/4.0 + !4.0/5.0 - !5.0/6.0=-16.533333333333335
