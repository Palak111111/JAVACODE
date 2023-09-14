import java.util.*;
class Test
{
public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter any number:");
   int n=sc.nextInt();
   int a=2;
   int s=0;
   for(int i=1; i<=n;i++)
   {
		System.out.print("!"+a+"/"+(a-1));
		if(i<n){
		System.out.print(" + ");
		}
		int fact=1;
		for(int j=1;j<=a;j++)
		  {
          fact=fact*j;
		  }
            s=s+(fact/(a-1));
		    a=a+2;
   }
   System.out.println(" = "+s);
   }
}

//output
//!2/1 + !4/3 + !6/5=154

//74.
import java.util.*;
class Test
{
public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter any number:");
   int n=sc.nextInt();
   int a=2;
   int s=0;
   for(int i=1; i<=n;i++)
   {
		System.out.print("!"+a+"/"+(a-1));
		if(i%2==0 && i<n){
		System.out.print(" + ");
		}
	    else if(i<n){
		System.out.print(" - ");
		}
		int fact=1;
		for(int j=1;j<=a;j++)
		  {
          fact=fact*j;
		  }
            if(i%2==0)
            s=s-(fact/(a-1));
            else
            s=s+(fact/(a-1));
		    a=a+2;
   }
   System.out.println("="+s);
   }
}

//output
//!2/1 - !4/3 + !6/5=138

//75.
import java.util.*;
class Test
{
public static void main(String args[])
   {
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter any number:");
   int n=sc.nextInt();
   int a=2;
   int s=0;
   for(int i=1; i<=n;i++)
   {
		System.out.print("!"+a+"/"+(a-1));
		if(i%2==0 && i<n){
		System.out.print(" - ");
		}
	    else if(i<n){
		System.out.print(" + ");
		}
		int fact=1;
		for(int j=1;j<=a;j++)
		  {
          fact=fact*j;
		  }
            if(i%2==0)
            s=s+(fact/(a-1));
            else
            s=s-(fact/(a-1));
		    a=a+2;
   }
   System.out.println(" = "+s);
   }
}

//output
//!2/1 + !4/3 - !6/5 = -138
