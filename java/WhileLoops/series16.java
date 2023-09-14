 import java.util.*;
class SeriesSixteen
{
public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter any number:");
   int n=sc.nextInt();
   int i=1;
   int j=2;
   double sum=1;
   double s=0;
   double div=0;
   while(i<=n)
   {
	    System.out.print(j+"/!"+i);
		if(i<n){
		System.out.print(" + ");
		}
   sum=sum*i;
   div=(i*2)/sum;
   s=s+div;
   i++;
   j=j+2;
   }
   System.out.println(" = "+s);
   }
}

//output
//2/!1 + 4/!2 + 6/!3 + 8/!4 + 10/!5 = 5.416666666666666




