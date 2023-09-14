class Substraction
{
 private int a,b;
 public void setData(int a,int b)
 {
  this.a=a;
  this.b=b;
 }
 public void getData()
 {
  System.out.println("A="+this.a+"B="+this.b); 
 }
 public int sub()
 {
  int c=this.a-this.b;
  return c;
 }
 public int multi()
 {
  int d=this.a*this.b;
  return d;
  }
}
class Test
{
 public static void main(String args[])
 { 
 Substraction ob=new Substraction();
 ob.setData(8,5);
 int res=ob.sub();
 int res1=ob.multi();
 System.out.println("RESULT="+res);
 System.out.println("RESULT="+res1);
 }
}
