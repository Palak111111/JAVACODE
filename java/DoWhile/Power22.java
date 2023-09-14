 import java.util.*;
class PowerTwentyTwo
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
	    System.out.print(x+"^"+i+"/!"+i);
		if(i<y)
		System.out.print(" + ");
	 fact=fact*x;
	 power=power*i;
	 div=fact/power;
	 sum=sum+div;
	 i++;
	 }
	 while(i<=y);
	 System.out.println(" = "+sum);
	 
	 	 }
	 }
	 
//output
//2^1/!1 + 2^2/!2 + 2^3/!3 + 2^4/!4 + 2^5/!5 = 6.266666666666667


