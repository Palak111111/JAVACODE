class PowerSeries40
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
	    System.out.print("!"+a+"/"+y+"^"+a);
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
		 sum=fact/b;
	          s=s+sum;
		a=a+2;
	     }
		 
	     System.out.println(" = "+s);
	 }
	 }
// ENTER ANY NUMBER: 3        ENTER ANY  Second NUMBER: 3
// !1/3^1 + !3/3^3 + !5/3^5 = 1.0493827

//41.
class PowerSeries41
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
	            System.out.print("!"+a+"/"+y+"^"+a);
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
		                  sum=fact/b;
		                                if(i%2==0)
	                                               s=s-sum;
                                                             else
	                                                             s=s+sum;
		                                                                a=a+2;
	     }
		 
	     System.out.println(" = "+s);
	 }
	 }
	            
// ENTER ANY NUMBER: 3    ENTER ANY  Second NUMBER: 3
// !1/3^1 - !3/3^3 + !5/3^5 = 0.60493827
	            
//42.
 class PowerSeries42
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
		                           sum=fact/b;
		                             if(i%2==0)
	                                          s=s+sum;
                                                         else
	                                                      s=s-sum;
		                                                         a=a+2;
	            }
		 
	                                                                        System.out.println(" = "+s);
 }
 }
// ENTER ANY NUMBER: 3   ENTER ANY  Second NUMBER: 3
// 3^1/!1+3^3/!3 - 3^5/!5 = -0.60493827
		            
	
	
