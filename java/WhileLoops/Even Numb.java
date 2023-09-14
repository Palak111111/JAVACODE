class Even
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("ENTER ANY NUMBER:");
int n=sc.nextInt();
int a=0;
int i=0;
int j=1;
while(i<=n)
{
 j=2*i+1;
 System.out.print(j);
 if(i<n)
 	{
 		System.out.print("EVEN NUMBER:");
	}
 a=a+j;
 i++;
 }
 
 System.out.print("="+a);
 
 
 }
}
