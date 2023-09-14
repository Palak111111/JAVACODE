import java.util.*;
class SeriesSeventeen
{
public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter any number:");
   int n=sc.nextInt();
   int i=1;
   int j=2
   double sum=1;
   double s=0;
   double div=0;
   while(i<=n)
   {
	    System.out.print(j+"/!"+i);
		if(i%2==0 && i<n)
		System.out.print(" + ");
		else if(i<n)
		System.out.print(" - ");
   sum=sum*i;
   div=(i*2)/sum;
   if(i%2==0)
       s=s-div;
   else
	   s=s+div;
   i++;
   j=j+2;
   }
   System.out.println(" = "+s);
   }
}

//output
// 2/!1 - 4/!2 + 6/!3 - 8/!4 + 10/!5=0.7500000000000001

