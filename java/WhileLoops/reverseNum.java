class ReverseNum
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("ENTER NUMBER= ");
int n=sc.nextInt();
int rev=0;
int s=0;
while(n>0)
{
   s=n%10;
   n=n/10;
   rev=rev*10+s;
   }
   System.out.print("REVERSE="+rev);
   int sq=rev*rev;
          System.out.println("Square of number is="+sq);
          int sum=rev+rev;
          System.out.println("Sum is ="+sum);
                                                                                                               
   }
   }
