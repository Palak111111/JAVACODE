import java.util.*;
class Test
{
 public static void main(String[] agrs)
 {
	 System.out.print("Enter N:");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.print("Enter X:");
	 int x=sc.nextInt();
	 int a=1;
	 float o=0;
	 for(int i=1;i<=n;i++)
		 {
	    System.out.print("!"+a+"/"+x+"^"+(a+1));
		   if(i%2==0 && i<n)
		   System.out.print(" + ");
	       else if(i<n)
		   System.out.print(" - ");
	    float z=1;
		float fact=1;
		float sum=0;
	    for(int j=1;j<=a+1;j++)
		 {
	      z=z*x;
		 }
		 for(int j=1;j<=a;j++)
		 {
		 fact=fact*j;
		 }
	    sum=fact/z;
		if(i%2==0)
	     o=o-sum;
         else
	     o=o+sum;
		a=a+2;
	     }
		 
	     System.out.println(" = "+o);
	 }
	 }
	 
//output
//!1/3^2 - !3/3^4 + !5/3^6 = 0.20164609