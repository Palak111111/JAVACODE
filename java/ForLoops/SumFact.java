class SumFact
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("Enter NUMBER :");
int n=sc.nextInt();
for(int i=1,fact=1,sum=0;i<=n;i++)
{
fact=fact*i;
sum=sum+fact;
System.out.println("SUM IS="+sum);
}
}
}
/*OUTPUT=Enter NUMBER :5
SUM IS=1
SUM IS=3
SUM IS=9
SUM IS=33
SUM IS=153*/


