class SeriesFourteen
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
	if(i<n ){
	System.out.print("+");
	}
sum=sum*i;
div=sum/(i*2);
s=s+div;
i++;
j=j+2;

System.out.print("="+s);
}
}
}
//!1.0/2.0+=0.5!2.0/4.0+=1.0!3.0/6.0+=2.0!4.0/8.0+=5.0!5.0/10.0=17.0
