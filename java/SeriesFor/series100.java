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
	 int a=1;
	 float o=0;
	 for(int i=1;i<=n;i++)
		 {
	    System.out.print(a+"^"+a+"/!"+(a+1));
		if(i<n)
		System.out.print(" + ");
	    float z=1;
		float fact=1;
		float sum=0;
	    for(int j=1;j<=a;j++)
		 {
	      z=z*x; 
		 }
		 for(int j=1;j<=a+1;j++)
		 {
		 fact=fact*j;
		 }
	    sum=z/fact;
		o=o+sum;
		a=a+2;
	     }
		 
	     System.out.println(" = "+o);
	 }
	 }
	 
//output
// 1^1/!2 + 3^3/!4 + 5^5/!6 = 2.9625