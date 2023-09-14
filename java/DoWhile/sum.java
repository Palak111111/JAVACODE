class Sum
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("enter number ");
int n=sc.nextInt();
int i=1;
int sum=0;
do
{
sum=sum+i;
i++;
}
while(i<=n);
System.out.println(sum);
}
}

