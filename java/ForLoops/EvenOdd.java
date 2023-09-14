class EvenOdd
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("ENTER ANY NUMBER:");
int n=sc.nextInt();
for(int i=1,esum=0,osum=0;i<=n;i++)
{
if(i%2==0)
esum=esum+i;
else
osum=osum+i;

System.out.println("ESUM ="+esum);
System.out.println("OSUM ="+osum);
}
}
}
/* OUTPUT= ENTER ANY NUMBER:
	5
	ESUM =0
	OSUM =1
	ESUM =2
	OSUM =1
	ESUM =2
	OSUM =4
	ESUM =6
	OSUM =4
	ESUM =6
	OSUM =9*/
	

