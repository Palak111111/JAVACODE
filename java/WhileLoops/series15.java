class SeriesFiveteen
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
while (i<=n)
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
i++;
j=j+2;
}
System.out.print("="+s);

}
}

