import java.util.*;
class Test
{
public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter any number:");
   int n=sc.nextInt();
   int a=2;
   float s=0;
   for(int i=1; i<=n;i++)
   {
		System.out.print("!"+(a-1)+"/"+a);
		if(i%2==0 && i<n){
		System.out.print(" - ");
		}
	    else if(i<n){
		System.out.print(" + ");
		}
	    float fact=1;
		for(int j=1;j<=a-1;j++)
		  {
          fact=fact*j;
		  }
            if(i%2==0)
            s=s+(fact/a);
            else
            s=s-(fact/a);
		    a=a+2;
   }
   System.out.println("="+s);
   }
}

//output
//!1/2 + !3/4 - !5/6=-19.0