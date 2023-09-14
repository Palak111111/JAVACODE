class Sum
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER=");
int n=sc.nextInt();
int i=1;
int sum=0;
int r=1;
do
{
n=n/10;
r=n%10;
sum=(sum*10)+r;
System.out.println("series is"+sum );
}
while(i<=n);
}
}

