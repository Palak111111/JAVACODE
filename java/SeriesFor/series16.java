class  Series
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=1;
   float s=0;
        for(int i=1;i<=n;i++)
          {
           System.out.print(a+"/!"+a);
                       if(i<n){
	                System.out.print("+");}
                          float fact=1;
                      for(int j=1;j<=a;j++)
				{
				    fact=fact*j;                  
				    }
				    s=(a/fact)+s;
				     a=a+2;
				     	}
						System.out.print("=" +s);

					}
			}
// ENTER NUMBER :3
// 1/!1+3/!3+5/!5=1.5416666	

//17.
class  Series17
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=1;
    float s=0;
        for(int i=1;i<=n;i++)
          {
           System.out.print(a+"/!"+a);
                       if(i<n&&i%2==0)
                       {
	                System.out.print("+");}
      	                  else if (i<n){
      	                    System.out.print("-");}
                        float fact=1;
                      for(int j=1;j<=a;j++)
				{
				    fact=fact*j;                  
				    }
				      if(i%2==0)
				    s=s-a/fact;
				       else 
				          s=s+a/fact;
				             a=a+2;
				     	}
				         System.out.print("=" +s);
				}
			}		
// ENTER NUMBER :3
// 1/!1-3/!3+5/!5=0.5416667			

//18.

class  Series18
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=1;
    float s=0;
        for(int i=1;i<=n;i++)
          {
           System.out.print(a+"/!"+a);
                       if(i<n&&i%2==0)
                       {
	                System.out.print("-");}
      	                  else if (i<n){
      	                    System.out.print("+");}
                        float fact=1;
                      for(int j=1;j<=a;j++)
				{
				    fact=fact*j;                  
				    }
				      if(i%2==0)
				    s=s+a/fact;
				       else 
				          s=s-a/fact;
				             a=a+2;
				     	}
				         System.out.print("=" +s);
				}
			}			
			
