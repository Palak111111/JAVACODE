class SeriesFiveteen
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
	if(i<n &&i%2==0  ){
	System.out.print("-");
	}
	else
	System.out.print("+");
	
sum=sum*i;
div=sum/(i*2);
if(i%2==0)
s=s+div;
else 
s=s-div;
j=j+2;
}
System.out.print("="+s);

}
}

