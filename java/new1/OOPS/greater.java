import java.util.Scanner;
class Largest
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
 public int greater()
 {
  if(a>b)
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
  Largest ob=new Largest();
 ob.setData(sc);
 ob.getData();
 int res=ob.greater();
 System.out.println("MAX.="+res);
 }
}
