class  PowerSeries67
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
	          System.out.print(+y+"^"+a+"/"+i);
		    if(i<n)
		        System.out.print(" + ");
	                int b=1;
	                  for(int j=1;j<=a;j++)
		            {
	                     b=b*y;
		            }
	                    sum=sum+(b/i);
		                a=a+2;
	        }
		       System.out.println(" = "+sum);
}
}
//  Enter number :3         Enter second number :3
// 3^2/1 + 3^4/2 + 3^6/3 = 292


//68.
class PowerSeries68
{
 public static void main(String[] agrs)
 {
        java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.print("Enter number :");
	 int n=sc.nextInt();
	 System.out.print("Enter second number :");
	 int y=sc.nextInt();
	 int a=2;
	 float sum=0;
	 for(int i=1;i<=n;i++)
		 {
	          System.out.print(+y+"^"+a+"/"+i);
		   if(i%2==0 && i<n)
		   System.out.print(" + ");
	           else if(i<n)
		   System.out.print(" - ");
	        float b=1;
	    for(int j=1;j<=a;j++)
	     {
	      b=b*y;
             }
	      if(i%2==0)
	         sum=sum-(b/i);
              else
	         sum=sum+(b/i);
		a=a+2;
	     }
	       System.out.println(" = "+sum);
	 }
	 }
// Enter number :3        Enter second number :3
// 3^2/1 - 3^4/2 + 3^6/3 = 211.5

//69.

class PowerSeries69
{
 public static void main(String[] agrs)
 {
        java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.print("Enter number :");
	 int n=sc.nextInt();
	 System.out.print("Enter second number :");
	 int y=sc.nextInt();
	 int a=2;
	 float sum=0;
	 for(int i=1;i<=n;i++)
		 {
	          System.out.print(+y+"^"+a+"/"+i);
		   if(i%2==0 && i<n)
		   System.out.print("-");
	           else if(i<n)
		   System.out.print("+");
	        float b=1;
	    for(int j=1;j<=a;j++)
	     {
	      b=b*y;
             }
	      if(i%2==0)
	         sum=sum+(b/i);
              else
	         sum=sum-(b/i);
		a=a+2;
	     }
	       System.out.println(" = "+sum);
	 }
	 }
// Enter number :3        Enter second number :3
// 3^2/1+3^4/2-3^6/3 =-211.5
	 
