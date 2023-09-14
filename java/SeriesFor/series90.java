import java.util.*;
class Test
{
 public static void main(String[] agrs)
 {
	 System.out.print("Enter X:");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.print("Enter Y:");
	 int x=sc.nextInt();
	 int a=2;
	 float sum=0;
	 for(int i=1;i<=n;i++)
		 {
	       System.out.print(+x+"^"+a+"/"+(a+2));
		   if(i%2==0 && i<n)
		   System.out.print(" - ");
	       else if(i<n)
		   System.out.print(" + ");
	    float z=1;
	    for(int j=1;j<=a;j++)
		 {
	      z=z*x;
		 }
		 if(i%2==0)
	     sum=sum+(z/(a+2));
         else
	     sum=sum-(z/(a+2));
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
// 3^2/4 + 3^4/6 - 3^6/8 = -79.875