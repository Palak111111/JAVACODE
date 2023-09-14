class  PowerSeries22
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.print("Enter number :");
	 int n=sc.nextInt();
	 System.out.print("Enter second number :");
	 int y=sc.nextInt();
	 int a=2;
	 int sum=0;
	 for(int i=1;i<=n;i++)
		 {
	         System.out.print(+y+"^"+a+"/"+a);
		 if(i<n)
		 System.out.print(" + ");
        	 int b=1;
	         for(int j=1;j<=a;j++)
		  {
	           b=b*y;
		  }
	          sum=sum+(b/a);
		  a=a+2;
	     }
		 
	            System.out.println(" = "+sum);
	 }
	 }
	 
//output
// 3^2/2 +  3^4/4 +  3^6/6 = 145


//23.
class PowerSeries23
{
 public static void main(String[] agrs)
 {
        java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.print("Enter number :");
	 int n=sc.nextInt();
	 System.out.print("Enter second number :");
	 int y=sc.nextInt();
	 int a=2;
	 int sum=0;
	 for(int i=1;i<=n;i++)
		 {
	       System.out.print(+y+"^"+a+"/"+a);
		   if(i%2==0 && i<n)
		   System.out.print(" + ");
	       else if(i<n)
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
// 3^2/2 -  3^4/4 +  3^6/6 = 105

	 
//24.

class SeriesPower24
{
 public static void main(String[] agrs)
 {
       java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.print("Enter number :");
	 int n=sc.nextInt();
	 System.out.print("Enter second number :");
	 int y=sc.nextInt();
	
	 int a=2;
	 int sum=0;
	 for(int i=1;i<=n;i++)
		 {
	       System.out.print(+y+"^"+a+"/"+a);
		   if(i%2==0 && i<n)
		   System.out.print(" - ");
	       else if(i<n)
		   System.out.print(" + ");
	    int b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*x;
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
// 3^2/2 + 3^4/4 - 3^6/6 = -105
