class  Series
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=2;
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

// !2/2+!4/4+!6/6=127


//5.
class  Series5
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=2;
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
 // !2/2-!4/4+!6/6=115

//6.

class  Series6
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=2;
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
// !2/2+!4/4-!6/6=-115			
			
			
					
			
			
			
			
