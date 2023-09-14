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
int fact=1;
for(int j=1;j<=a;j++)
{
fact=fact*j;
}
System.out.print("!"+a);
if(i<n)

System.out.print("+");

sum=sum+fact;
a=a+2;
}
System.out.print("=" +sum);

}
}
//  ENTER NUMBER :3
//      !2+!4+!6=746

//2. 
class Series2 
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
       int fact=1;
       for(int j=1;j<=a;j++)
               {
		fact=fact*j;
               }
		if(i<n&&i%2==0)
		   {
	            sum=sum-fact;
			 System.out.print("-");
			     System.out.print("!"+a);
	           }
                else 
                 {
		   sum=sum+fact;
			  System.out.print("+");
			     System.out.print("!"+a);
	          }
		           	a=a+2;
              }
                 System.out.print("=" +sum);

}
}
// +!2-!4+!6=698
   
   //3.
class Series3 
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
       int fact=1;
       for(int j=1;j<=a;j++)
               {
		fact=fact*j;
               }
		if(i<n&&i%2==0)
		   {
	            sum=sum+fact;
			 System.out.print("+");
			     System.out.print("!"+a);
	           }
                else 
                 {
		   sum=sum-fact;
			  System.out.print("-");
			     System.out.print("!"+a);
	          }
		           	a=a+2;
              }
                 System.out.print("=" +sum);

}
}
// ENTER NUMBER :3   :  -!2+!4-!6=-698





