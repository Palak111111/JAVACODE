import java.util.*;
class PowerNineteen
{
 public static void main(String[] agrs)
 {
	 System.out.print("Enter X:");
	 Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 System.out.print("Enter Y:");
	 int y=sc.nextInt();
	 int i=1;
	 int j=1;
	 double b=1;
	 double a=0;
	 double div=1;
	do
		 {
	    System.out.print(j+"/"+x+"^"+i);
		if(i<y)
		System.out.print(" + ");
	 b=b*x;
	 div=j/b;
	 a=a+div;
	 i++;
	 j=j+2;
	 }
	  while(i<=y);
	 System.out.println(" = "+a);
	 }
	 }
//output
//1/2^1 + 3/2^2 + 5/2^3 + 7/2^4 + 9/2^5 = 2.59375
