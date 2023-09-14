class SeriesTwelve
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("ENTER NUMBER=");
double n=sc.nextDouble();
double i=1;
double sum=1;
double s=0;
double j=2;
double  div=0;
do
{
System.out.print("!"+i+"/"+j);
	if(i<n && i%2==0)
{
	System.out.print(" + ");
	}
	else if(i<n)
	 System.out.print(" - ");
sum=sum*i;
div=sum/(i+1);
if(i%2==0)
{
s=s-div;
}
else
s=s+div;
i++;
j++;
}
while (i<=n);
System.out.print("="+s);
}
}
//!1.0/2.0 - !2.0/3.0 + !3.0/4.0 - !4.0/5.0 + !5.0/6.0=16.533333333333335
