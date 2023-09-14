import java.util.*;
class Twenty
{
public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter any number:");
   int n=sc.nextInt();
   double sum=1;
   double s=0;
   double div=0;
   for (int i=1,j=1;i<=n;i++)
   {
	    System.out.print("!"+i+"/"+j);
		if(i%2==0 && i<n)
		System.out.print(" + ");
		else if(i<n)
		System.out.print(" - ");
   sum=sum*i;
   div=sum/j;
   if(i%2==0)
       s=s-div;
   else
	   s=s+div;
   j=j+2;
   }
   System.out.println(" = "+s);
   }
}

// !1/1 - !2/3 + !3/5 - !4/7 + !5/9 = 11.438095238095238




