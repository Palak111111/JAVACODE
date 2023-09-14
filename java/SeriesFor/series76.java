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
		System.out.print((a-1)+"/!"+a);
		if(i<n){
		System.out.print(" + ");
		}
		float fact=1;
		for(int j=1;j<=a;j++)
		  {
          fact=fact*j;
		  }
            s=s+((a-1)/fact);
		    a=a+2;
   }
   System.out.println("="+s);
   }
}

//output
//1/!2 + 3/!4 + 5/!6=0.6319444

//77.
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
		System.out.print((a-1)+"/!"+a);
		if(i%2==0 && i<n){
		System.out.print(" + ");
		}
	    else if(i<n){
		System.out.print(" - ");
		}
		float fact=1;
		for(int j=1;j<=a;j++)
		  {
          fact=fact*j;
		  }
            if(i%2==0)
            s=s-((a-1)/fact);
            else
            s=s+((a-1)/fact);
		    a=a+2;
   }
   System.out.println("="+s);
   }
}

//output
//1/!2 - 3/!4 + 5/!6=0.38194445


//78.
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
		System.out.print((a-1)+"/!"+a);
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
            s=s+((a-1)/fact);
            else
            s=s-((a-1)/fact);
		    a=a+2;
   }
   System.out.println(" = "+s);
   }
}

//output
//1/!2 + 3/!4 - 5/!6 = -0.38194445
