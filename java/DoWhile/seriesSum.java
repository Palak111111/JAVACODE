class Sum
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER=");
int n=sc.nextInt();
int i=1;
int sum=0;
int r=0;
do
{
r=n%10;
sum=sum+r;
n=n/10;
}
while(n>0);
System.out.println("series is"+sum );
}
}

