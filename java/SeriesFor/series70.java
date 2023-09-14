class  PowerSeries70
{
public static void main(String args[])
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
	          System.out.print(i+"/"+y+"^"+a);     
		    if(i<n)
		        System.out.print(" + ");
	                  float b=1;
	                  for(int j=1;j<=a;j++)
		            {
	                     b=b*y;
		            }
	                    sum=sum+(i/b);
		                a=a+2;
	        }
		       System.out.println(" = "+sum);
}
}
// Enter number :3       Enter second number :3
//1/3^2 + 2/3^4 + 3/3^6 = 0.1399177


// 71.
class PowerSeries71
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
	         System.out.print(i+"/"+y+"^"+a);    
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
	         sum=sum-(i/b);
              else
	         sum=sum+(i/b);
		a=a+2;
	     }
	       System.out.println(" = "+sum);
	 }
	 }
	 
// Enter number :3      Enter second number :3
// 1/3^2 - 2/3^4 + 3/3^6 = 0.09053498

//72.

class PowerSeries72
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
	         System.out.print(i+"/"+y+"^"+a);    
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
	         sum=sum+(i/b);
              else
	         sum=sum-(i/b);
		a=a+2;
	     }
	       System.out.println(" = "+sum);
	 }
	 }
//  Enter number :3       Enter second number :3
//  1/3^2+2/3^4-3/3^6 = -0.09053498
	 
