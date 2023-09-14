class  Series
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=1;
   int sum=0;
        for(int i=1;i<=n;i++)
          {
           System.out.print("!"+a+ "/"+a);
                       if(i<n)
	                System.out.print("+");
                     int fact=1;
                      for(int j=1;j<=a;j++)
				{
				    fact=fact*j;                  
				    }
				    sum=sum+(fact/a);
				     a=a+2;
				     	}
						System.out.print("=" +sum);

					}
			}
// ENTER NUMBER :3
// !1/1+!3/3+!5/5=27	

//14.
class  Series14
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=1;
   int s=0;
        for(int i=1;i<=n;i++)
          {
           System.out.print("!"+a+ "/"+a);
                       if(i<n&&i%2==0)
                       {
	                System.out.print("+");}
      	                  else if (i<n){
      	                    System.out.print("-");}
                     int fact=1;
                      for(int j=1;j<=a;j++)
				{
				    fact=fact*j;                  
				    }
				      if(i%2==0)
				    s=s-(fact/a);
				       else 
				          s=s+(fact/a);
				             a=a+2;
				     	}
				         System.out.print("=" +s);
				}
			}
			
// ENTER NUMBER :3
// !1/1-!3/3+!5/5=23		


//15.
class  Series15
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=1;
   int s=0;
        for(int i=1;i<=n;i++)
          {
           System.out.print("!"+a+ "/"+a);
                       if(i<n&&i%2==0)
                       {
	                System.out.print("-");}
      	                  else if (i<n){
      	                    System.out.print("+");}
                     int fact=1;
                      for(int j=1;j<=a;j++)
				{
				    fact=fact*j;                  
				    }
				      if(i%2==0)
				    s=s+(fact/a);
				       else 
				          s=s-(fact/a);
				             a=a+2;
				     	}
				         System.out.print("=" +s);
				}
			}			
			
// ENTER NUMBER :3
// !1/1+!3/3-!5/5=-23			
