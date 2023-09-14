class  Series
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=2;
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
// 2/!2+4/!4+6/!6=1.175	

//8.
class  Series8
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=2;
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
//  2/!2-4/!4+6/!6=0.84166664						

//9.
class  Series9
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
   int a=2;
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
// ENTER NUMBER :3
// 2/!2+4/!4-6/!6=-0.84166664					
