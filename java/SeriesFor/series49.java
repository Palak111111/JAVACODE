class PowerSeries49
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=2;
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
	          s=s+(fact/(a-i));
		a=a+2;
	     }
		 
	     System.out.println(" = "+s);
}
}
// ENTER ANY NUMBER: 3     ENTER ANY  Second NUMBER: 3
// !2/1 + !4/2 + !6/3 = 254


//50.
class PowerSeries50
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=2;
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
	                                                                    s=s-(fact/(a-i));
                                                                          else
	                                                                       s=s+(fact/(a-i));                           
		                                                                         a=a+2;
	         } 
	                                                                 System.out.println(" = "+s);
}
}

// ENTER ANY NUMBER: 3    ENTER ANY  Second NUMBER: 3
// !2/1 - !4/2 + !6/3 = 230

//51.

class PowerSeries51
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=2;
int s=0;
	 for(int i=1;i<=x;i++)
		 {
	    System.out.print("!"+a+"/"+i);
		if(i%2==0 && i<x)
		               System.out.print(" - ");
	                            else if(i<x)
		                           System.out.print(" +");
	        int  fact=1;
	           for(int j=1;j<=a;j++)
		 {
	          fact=fact*j;
		 } 
		            if(i%2==0)
	                             s=s+(fact/(a-i));
                                        else
	                                  s=s-(fact/(a-i));                           
		                          a=a+2;
	        }
		 
	     System.out.println(" = "+s);
}
}

// ENTER ANY NUMBER: 3     ENTER ANY  Second NUMBER: 3
//  !2/1 +!4/2 - !6/3 = -230

