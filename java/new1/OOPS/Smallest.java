import java.util.Scanner;
class Smallest
{
 private int a,b;
 public void setData(Scanner sc)
 {
  System.out.print("enter A=");
   int a=sc.nextInt();
   System.out.print("enter B=");
   int b=sc.nextInt(); 
   this.a=a;
   this.b=b;
 }
 public void getData()
 {
  System.out.println("A= "+this.a+ "B= "+this.b); 
 }
 public int small()
 {
  if(a<b)
  return a;
  else
  return b;
 }
}
class Test
{
 public static void main(String args[])
 { 
 Scanner sc=new Scanner(System.in);
 Smallest ob=new Smallest();
 ob.setData(sc);
 ob.getData();
 int res=ob.small();
 System.out.println("MIn.="+res);
 }
}
