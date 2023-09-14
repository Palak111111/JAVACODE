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
		System.out.print((a+2)+"/!"+a);
		if(i%2==0 && i<n){
		System.out.print(" - ");
		}
	    else if(i<n){
		System.out.print(" + ");
		}
		float fact=1;
		for(int j=1;j<=a;j++)
		  {
          fact=fact*j;
		  }
            if(i%2==0)
            s=s+((a+2)/fact);
            else
            s=s-((a+2)/fact);
		    a=a+2;
   }
   System.out.println(" = "+s);
   }
}

//output
//4/!2 + 6/!4 - 8/!6 = -1.7611111