class PowerSeries61
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
float sum=0;
	 for(int i=1;i<=x;i++)
	 {
	     System.out.print(y+"^"+a+"/"+i);
	         if(i<x)
		      System.out.print(" + ");
	                   float  b=1;
	                       for(int j=1;j<=a;j++)
		                {
	                          b=b*y;
		                }
	                                  sum=sum+(b/i);
		                                   a=a+2;
	  }
		                                            System.out.println(" = "+sum);
}
}
// ENTER ANY NUMBER: 3    ENTER ANY  Second NUMBER: 3
// 3^1/1 + 3^3/2 + 3^5/3 = 97.5

//62.
class PowerSeries62
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
float sum=0;
	 for(int i=1;i<=x;i++)
		 {
	             System.out.print(y+"^"+a+"/"+i);
		                if(i%2==0 && i<x)
		                        System.out.print(" + ");
	                                           else if(i<x)
		                                           System.out.print(" - ");
	                                                          float b=1;
	                                                            for(int j=1;j<=a;j++)
		                                                   {
	                                                            b=b*y;
		                                                    } 
		                                                         if(i%2==0)
	                                                                    sum=sum-(b/i);
                                                                          else
	                                                                       sum=sum+(b/i);                           
		                                                                         a=a+2;
	         } 
	                                                                 System.out.println(" = "+sum);
}
}

// ENTER ANY NUMBER: 3      ENTER ANY  Second NUMBER: 3
// 3^1/1 - 3^3/2 + 3^5/3 = 70.5


//63.
class PowerSeries63
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
float sum=0;
	 for(int i=1;i<=x;i++)
		 {
	             System.out.print(y+"^"+a+"/"+i);
		                       if(i%2==0 && i<x)
		                                 System.out.print("-");
	                                           else if(i<x)
		                                           System.out.print("+");
	                                                          float b=1;
	                                                            for(int j=1;j<=a;j++)
		                                                   {
	                                                            b=b*y;
		                                                    } 
		                                                         if(i%2==0)
	                                                                    sum=sum+(b/i);
                                                                          else
	                                                                       sum=sum-(b/i);                           
		                                                                         a=a+2;
	         } 
	                                                                 System.out.println(" = "+sum);
}
}

// ENTER ANY NUMBER: 3    ENTER ANY  Second NUMBER: 3
//3^1/1+3^3/2-3^5/3 = -70.5

