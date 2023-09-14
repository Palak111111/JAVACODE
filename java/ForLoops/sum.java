class Sum
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("ENTER NUMBER=");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;sum=sum+i,i++);
{
System.out.print("Sum="+sum);
}
}
}
