class SeriesEleven
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER=");
double n=sc.nextDouble();
double s=0;
for (double i=1,sum=1,j=2,div=0;i<=n;i++)
{
System.out.print(+j+"/ !"+i);
	if(i<n )
{
	System.out.print(" + ");
	}
sum=sum*i;
div=(i+1)/sum;
s=s+div;
j++;
}
System.out.print("="+s);
}
}

// ENTER NUMBER=5
//2.0/ !1.0 + 3.0/ !2.0 + 4.0/ !3.0 + 5.0/ !4.0 + 6.0/ !5.0=4.425
