class Test
{
 int x;
 public Test(int x)
 {
  this.x=x;
  System.out.println("Test constructor....");
 }
 void display()
 {
  System.out.println("TEST CLASS X = "+this.x);
 }
}
class Test1 extends Test
{
 int x;
 public Test1(int x1,int x2)
 {
  super(x1);
  this.x=x2;
  System.out.println("Test1 constructor....");
 }
 void display()
 {
   super.display();
  System.out.println("TEST1 CLASS X = "+this.x);
 }
}
class Test2 extends Test1
{
  int x;
 public Test2 (int x1,int x2,int x3)
 {
   super(x1,x2);
   this.x=x3;
  System.out.println("Test2 constructor....");
 }
 void display()
 {
   super.display();
  System.out.println("TEST2 CLASS X = "+this.x);
 }
}
 class TestMain
 {
  public static void main(String args[])
  {
    Test2 ob=new Test2(8,3,2);
	ob.display();
  }
 }