class SumSeries
{
public static  void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("ENTER ANY NUMBER : ");
int n=sc.nextInt();
int i=1;
int sum=1;
do
{

  System.out.print("  "+sum);
  
  sum=sum+i;
  i++;
  }
  while(i<n);   
}
}
