class PowerSeries37
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
	 for(int i=1;i<=x;i++)
		 {
	    System.out.print(y+"^"+a+"/ !"+a);
		if(i<x)
		System.out.print(" + ");
	    float b=1;
	    float fact=1;
	    float sum=0;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
	      fact=fact*j;
		 }
		 sum=b/fact;
	          s=s+sum;
		a=a+2;
	     }
		 
	     System.out.println(" = "+s);
	 }
	 }

// ENTER ANY NUMBER: 3      ENTER ANY  Second NUMBER: 3
// 3^1/ !1 + 3^3/ !3 + 3^5/ !5 = 9.525

//38.

class PowerSeries38
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
	 for(int i=1;i<=x;i++)
	   {
	       System.out.print(y+"^"+a+"/!"+a);
		   if(i%2==0 && i<x)
		   System.out.print(" + ");
	       else if(i<x)
		   System.out.print(" - ");
	      float b=1;
	      float fact=1;
	      float sum=0;
	           for(int j=1;j<=a;j++)
		 {
	              b=b*y;
	              fact=fact*j;
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
	 // 3^1/!1 - 3^3/!3 + 3^5/!5 = 0.5250001
	 
//39.	
 
class PowerSeries39
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
	      for(int i=1;i<=x;i++)
		  {
	            System.out.print(y+"^"+a+"/!"+a);
		       if(i%2==0 && i<x)
		              System.out.print(" - ");
	                             else if(i<x)
		                             System.out.print("+");
		            float b=1;
			    float fact=1;
			    float sum=0;
	                         for(int j=1;j<=a;j++)
		                    {
	                               b=b*y;
	                                fact=fact*j;
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
		            
	
	
