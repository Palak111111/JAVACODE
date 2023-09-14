class PowerSeries43
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
float s=0;
float sum=0;
	 for(int i=1;i<=x;i++)
		 {
	    System.out.print(y+"^"+a+"/!"+(a+1));
		if(i<x)
		System.out.print(" + ");
	    float b=1;
	    float fact=1;
	           for(int j=1;j<=a;j++)
		 {
	      b=b*y;
	      fact=fact*(j+1);
		 }
		 sum=b/fact;
	          s=s+sum;
		a=a+2;
	     }
		 
	     System.out.println(" = "+s);
	 }
	 }
	 // ENTER ANY NUMBER: 3      ENTER ANY  Second NUMBER: 3
// 3^1/!2 + 3^3/!4 + 3^5/!6 = 2.9625

//44.
class PowerSeries44
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
float s=0;
float sum=0;
	 for(int i=1;i<=x;i++)
		 {
	    System.out.print(y+"^"+a+"/!"+(a+1));
	         if(i%2==0 && i<x)
		               System.out.print(" + ");
	                            else if(i<x)
		                           System.out.print(" - ");
             float b=1;
	    float fact=1;
	           for(int j=1;j<=a;j++)
		 {
	      b=b*y;
	      fact=fact*(j+1);
		 }
		 sum=b/fact;
	          if(i%2==0)
	                                               s=s-sum;
                                                             else
	                                                             s=s+sum;
		                                                                a=a+2;
	     }
		 
	     System.out.println(" = "+s);
	 }
	 }


// ENTER ANY NUMBER: 3      ENTER ANY  Second NUMBER: 3
// 3^1/!2 - 3^3/!4 + 3^5/!6 = 0.7125


//45.
class PowerSeries45
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
float s=0;
float sum=0;
	 for(int i=1;i<=x;i++)
		 {
	    System.out.print(y+"^"+a+"/!"+(a+1));
	         if(i%2==0 && i<x)
		               System.out.print(" -");
	                            else if(i<x)
		                           System.out.print(" + ");
             float b=1;
	    float fact=1;
	           for(int j=1;j<=a;j++)
		 {
	      b=b*y;
	      fact=fact*(j+1);
		 }
		 sum=b/fact;
	          if(i%2==0)
	                                               s=s+sum;
                                                             else
	                                                             s=s-sum;
		                                                                a=a+2;
	     }
		 
	     System.out.println(" = "+s);
	 }
	 }
// ENTER ANY NUMBER: 3       ENTER ANY  Second NUMBER: 3
//  3^1/!2 + 3^3/!4 -3^5/!6 = -0.7125



















