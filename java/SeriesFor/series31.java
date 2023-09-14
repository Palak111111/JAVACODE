class PowerSeries31
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
   int a=1;
	 int sum=0;
	 for(int i=1;i<=x;i++)
		 {
	    System.out.print(+y+"^"+a+"/"+a);
		if(i<x)
		System.out.print(" + ");
	    int b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
	    sum=sum+(z/b);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
// 3^1/1 + 3^3/3 + 3^5/5 = 60

//32.
class PowerSeries32
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
	 int sum=0;
	 for(int i=1;i<=x;i++)
		 {
	       System.out.print(+y+"^"+a+"/"+a);
		   if(i%2==0 && i<x)
		   System.out.print(" + ");
	       else if(i<x)
		   System.out.print(" - ");
	    int b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
		 if(i%2==0)
	     sum=sum-(b/a);
         else
	     sum=sum+(b/a);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
//3^1/1 - 3^3/3 + 3^5/5 = 42

//33.
class PowerSeries33
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
     int a=1;
	 int sum=0;
	 for(int i=1;i<=x;i++)
		 {
	       System.out.print(+y+"^"+a+"/"+a);
		   if(i%2==0 && i<x)
		   System.out.print(" - ");
	       else if(i<x)
		   System.out.print(" + ");
	    int b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
		 if(i%2==0)
	     sum=sum+(b/a);
         else
	     sum=sum-(b/a);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
//3^1/1 + 3^3/3 - 3^5/5 = -42




