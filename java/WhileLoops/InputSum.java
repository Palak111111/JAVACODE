class SumInput
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("ENTER NUMBER= ");
int n=sc.nextInt();
int sum=0;
int r=0;
int i=0;
while(n>0)
{
  r=n%10;
   sum=sum+r;
   n=n/10;
   i++;
   }
   System.out.print("SUM="+sum);
   }
   }
   
