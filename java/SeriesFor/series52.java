class PowerSeries52
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=2;
float s=0;
	 for(int i=1;i<=x;i++)
		 {
	              System.out.print(i+"/!"+a);
		                     if(i<x)
		                      System.out.print(" + ");
	                                    float  fact=1;
	                                     for(int j=1;j<=a;j++)
		                                  {
	                                              fact=fact*j;
		                                  }
	                                                 s=s+((a-i)/fact);
		                                             a=a+2;
	        }
		                                               System.out.println(" = "+s);
}
}
// ENTER ANY NUMBER: 3         ENTER ANY  Second NUMBER: 3
// 1/!2 + 2/!4 + 3/!6 = 0.5875


//53.
class PowerSeries53
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=2;
float s=0;
	 for(int i=1;i<=x;i++)
		 {
	              System.out.print(i+"/!"+a);
	                     if(i%2==0 && i<x)
		               System.out.print(" + ");
	                            else if(i<x)
		                           System.out.print(" - ");
	                                              float  fact=1;
	                                                for(int j=1;j<=a;j++)
		                                             {
	                                                       fact=fact*j;
		                                              } 
		                                                if(i%2==0)
	                                                            s=s-((a-i)/fact);
                                                                 else
	                                                            s=s+((a-i)/fact);                           
		                                                                   a=a+2;
	         }
		 
	                                                                               System.out.println(" = "+s);
}
}              
	              
// ENTER ANY NUMBER: 3       ENTER ANY  Second NUMBER: 3
// 1/!2 - 2/!4 + 3/!6 = 0.42083332
	                   
//54.
class PowerSeries54
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=2;
float s=0;
	 for(int i=1;i<=x;i++)
		 {
	              System.out.print(i+"/!"+a);
	                     if(i%2==0 && i<x)
		               System.out.print(" - ");
	                            else if(i<x)
		                           System.out.print(" + ");
	                                              float  fact=1;
	                                                for(int j=1;j<=a;j++)
		                                             {
	                                                       fact=fact*j;
		                                              } 
		                                                if(i%2==0)
	                                                            s=s+((a-i)/fact);
                                                                 else
	                                                            s=s-((a-i)/fact);                           
		                                                                   a=a+2;
	         }
		 
	                                                                               System.out.println(" = "+s);
}
}              
	              	              
// ENTER ANY NUMBER: 3        ENTER ANY  Second NUMBER: 3
// 1/!2 + 2/!4 - 3/!6 = -0.42083332
	              
	              

