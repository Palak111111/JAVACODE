import java.util.*;
class TwentyThree
{
public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter any number:");
   int n=sc.nextInt();
   int i=1;
   int j=1;
   double sum=1;
   double s=0;
   double div=0;
   while(i<=n)
   {
	    System.out.print(j+"/!"+i);
		if(i%2==0 && i<n)
		System.out.print(" - ");
		else if(i<n)
		System.out.print(" + ");
   sum=sum*i;
   div=j/sum;
   if(i%2==0)
       s=s+div;
   else
	   s=s-div;
   i++;
   j=j+2;
   }
   System.out.println("="+s);
   }
}

// 1/!1 + 3/!2 - 5/!3 + 7/!4 - 9/!5=-0.11666666666666668
