import java.util.Scanner;
class Test
{
public static void main(String args[])
{
Scanner sc=new java.util.Scanner (System.in);
Rev ob=new Rev();
ob.setData(sc);
ob.reverse();
}
}
class Rev
{
private int n;
public void setData(Scanner sc)
{
System.out.print("ENTER NUMBER= ");
int n=sc.nextInt();
this.n=n;
}
public void reverse()
{
int rev=0;
int s=0;
while(n>0)
{
   s=n%10;
   n=n/10;
   rev=rev*10+s;
   }
          System.out.println("REVERSE = "+rev);
           int sq=rev*rev;
          System.out.println("Square of number is = "+sq);
          int sum=rev+rev;
          System.out.println("Sum is = "+sum);
                                                                                                               
   }
   }
