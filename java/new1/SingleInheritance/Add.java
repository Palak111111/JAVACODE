class Square
{
 int a;
 public void setData(int a)
 {
  this.a=a;
 }
 public int squ()
 {
  return this.a*this.a;
 }
 
}
class Addition
{
  private int b;
  public void setData(int a,int b)
  {
    this.setData(a);
    this.b=b;
  }
  public int add()
  {
  return this.a+this.b;
  }
}
class Test
{
 public static void main(String args[])
 {
  Addition ob=new Addition();
  ob.setData(4,5);
  ob.setData(3);
 System.out.println("Addition = "+ob.add());
 System.out.println("Square = "+ob.squ());
 }
}


