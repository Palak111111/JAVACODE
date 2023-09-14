 import java.util.*;
class PowerTwentySeven
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
	 do
		 {
	    System.out.print("!"+i+"/"+x+"^"+i);
		if(i%2==0 && i<y)
		System.out.print(" - ");
	    else if(i<y)
		System.out.print(" + ");
	 fact=fact*x;
	 power=power*i;
	 div=power/fact;
	 if(i%2==0)
	 sum=sum+div;
	 else
	 sum=sum-div;
	 i++;
	 }
	 while(i<=y);
	 System.out.println(" = "+sum);
	 }
	 }
	 
//output
//!1/2^1 + !2/2^2 - !3/2^3 + !4/2^4 - !5/2^5 = -3.0
