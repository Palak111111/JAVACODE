class PowerSeries55
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
int s=0;
	 for(int i=1;i<=x;i++)
	 {
	     System.out.print("!"+a+"/"+i);
	         if(i<x)
		      System.out.print(" + ");
	                 int  fact=1;
	                       for(int j=1;j<=a;j++)
		                {
	                          fact=fact*j;
		                }
	                                  s=s+(fact/ i);
		                                   a=a+2;
	  }
		                                            System.out.println(" = "+s);
}
}
// ENTER ANY NUMBER: 3     ENTER ANY  Second NUMBER: 3
// !1/1 + !3/2 + !5/3 = 44


//56.
class PowerSeries56
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
int s=0;
	          for(int i=1;i<=x;i++)
		 {
	           System.out.print("!"+a+"/"+i);
		          if(i%2==0 && i<x)
		               System.out.print(" + ");
	                               else if(i<x)
		                                System.out.print(" - ");
	                                            int  fact=1;
	                                                for(int j=1;j<=a;j++)
		                                         {
	                                                    fact=fact*j;
		                                         } 
		                                           if(i%2==0)
	                                                           s=s-(fact/ i);
                                                                      else
	                                                                   s=s+(fact/ i);                           
		                                                                           a=a+2;
	          }
	                                                                                       System.out.println(" = "+s);
}
}

// ENTER ANY NUMBER: 3     ENTER ANY  Second NUMBER: 3
// !1/1 - !3/2 + !5/3 = 38

//57.

class PowerSeries57
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=1;
int s=0;
	          for(int i=1;i<=x;i++)
		 {
	           System.out.print("!"+a+"/"+i);
		          if(i%2==0 && i<x)
		               System.out.print("-");
	                               else if(i<x)
		                                System.out.print("+");
	                                            int  fact=1;
	                                                for(int j=1;j<=a;j++)
		                                         {
	                                                    fact=fact*j;
		                                         } 
		                                           if(i%2==0)
	                                                           s=s+(fact/ i);
                                                                      else
	                                                                   s=s-(fact/ i);                           
		                                                                           a=a+2;
	          }
	                                                                                       System.out.println(" = "+s);
}
}
// ENTER ANY NUMBER: 3     ENTER ANY  Second NUMBER: 3
// !1/1+!3/2-!5/3 = -38



