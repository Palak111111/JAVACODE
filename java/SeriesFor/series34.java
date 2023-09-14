 class PowerSeries34
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
 int a=1;
	 float sum=0;
	 for(int i=1;i<=x;i++)
		 {
	    System.out.print(a+"/"+y+"^"+a);
		if(i<x)
		System.out.print(" + ");
	    float b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
	    sum=sum+(a/b);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
//1/3^1 + 3/3^3 + 5/3^5 = 0.4650205

//35.
class PowerSeries35
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
 int a=1;
	 float sum=0;
	 for(int i=1;i<=x;i++)
		 {
	       System.out.print(a+"/"+y+"^"+a);
		   if(i%2==0 && i<x)
		   System.out.print(" + ");
	       else if(i<x)
		   System.out.print(" - ");
	    float b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
		 if(i%2==0)
	     sum=sum-(a/b);
         else
	     sum=sum+(a/b);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
// 1/3^1 - 3/3^3 + 5/3^5 = 0.24279837

//36.
class PowerSeries36
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
	 float sum=0;
	 for(int i=1;i<=x;i++)
		 {
	       System.out.print(a+"/"+y+"^"+a);
		   if(i%2==0 && i<x)
		   System.out.print(" - ");
	       else if(i<x)
		   System.out.print(" + ");
	    float b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
		 if(i%2==0)
	     sum=sum+(a/b);
         else
	     sum=sum-(a/b);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
// 1/3^1 + 3/3^3 - 5/3^5 = -0.24279837
