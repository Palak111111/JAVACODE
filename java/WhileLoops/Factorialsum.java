class SumFactorial
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.println(" Enter any number");
int n=sc.nextInt();
int i=1;
int fact=1;
int sum=0;
while(i<=n)
{
fact=fact*i;
sum=sum+fact;
i++;
}
System.out.println("SUM="+sum);
}
}

