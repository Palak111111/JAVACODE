import java.util.Scanner;
class Num
{
 private int n;
 public void setData(Scanner sc)
 {
  System.out.print("enter N=");
   int n=sc.nextInt();
   this.n=n;
 }
 public void getData()
 {
  System.out.println("N= "+this.n); 
 }
 public int Sum()
 {
  int i=1,sum=0;
  while(i<=n)
  {
   System.out.print(i);
   if(i<n)
   {
   System.out.print("+");
   }
   sum=sum+i;
   i++;
  }
  System.out.print("="+sum);
   return sum;
 }
}
class Test
{
 public static void main(String args[])
 { 
 Scanner sc=new Scanner(System.in);
 Num ob=new Num();
 ob.setData(sc);
 ob.getData();
 int res=ob.Sum();
 System.out.println("\nSum="+res);
 }
}
