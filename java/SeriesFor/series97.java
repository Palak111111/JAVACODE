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
	    System.out.print((a+2)+"/"+x+"^"+(a-1));
		if(i<n)
		System.out.print(" + ");
	    float z=1;
	    for(int j=1;j<=a-1;j++)
		 {
	      z=z*x;
		 }
	    sum=sum+((a+2)/z);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
//4/3^1 + 6/3^3 + 8/3^5 = 1.5884774