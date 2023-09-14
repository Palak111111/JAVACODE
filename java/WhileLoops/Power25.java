import java.util.*;
class PowerTwentyFive
{
 public static void main(String[] agrs)
 {
	 System.out.print("Enter X:");
	 Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 System.out.print("Enter Y:");
	 int y=sc.nextInt();
	 int i=1;
	 double fact=1;
	 double power=1;
	 double sum=0;
	 double div=0;
	 while(i<=y)
		 {
	    System.out.print("!"+i+"/"+x+"^"+i);
		if(i<y)
		System.out.print(" + ");
	 fact=fact*x;
	 power=power*i;
	 div=power/fact;
	 sum=sum+div;
	 i++;
	 }
	 System.out.println(" = "+sum);
	 }
	 }
	 
//output
//!1/2^1 + !2/2^2 + !3/2^3 + !4/2^4 + !5/2^5 = 7.0


