class SeriesTen
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER=");
double n=sc.nextDouble();
double s=0;
double j=2;
double  div=0;
for (double i=1,sum=1;i<=n;i++)
{
System.out.print("!"+i+"/"+j);
	if(i<n )
{
	System.out.print(" + ");
	}
sum=sum*i;
div=sum/(i+1);
s=s+div;
j++;
}
System.out.print("="+s);
}
}
// Output 
// !1.0/2.0 + !2.0/3.0 + !3.0/4.0 + !4.0/5.0 + !5.0/6.0=27.46666666666667
