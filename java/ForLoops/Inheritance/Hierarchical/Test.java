class Test
{
 int x;
 public Test(int x)
 {
  this.x=x;
  //System.out.println("Test constructor....");
 }
 void display()
 {
  System.out.println("X = "+this.x);
 }
}
class Test1 extends Test
{
 int y;
 public Test1(int x1,int x2)
 {
  super(x1);
  this.y=x2;
  //System.out.println("Test1 constructor....");
 }
 void display()
 {
   super.display();
  System.out.println(" Y = "+this.y);
 }
}
class Test2 extends Test1
{
  int z;
 public Test2 (int x1,int x2)
 {
   super(x1,x2);
   this.z=x2;
  //System.out.println("Test2 constructor....");
 }
 void display()
 {
   super.display();
  System.out.println(" Z = "+this.z);
 }
}
 class TestMain
 {
  public static void main(String args[])
  {
     Test ref;
    Test ob=new Test(8);
	 Test1 ob1=new Test1(2,3);
	  Test2 ob2=new Test2(4,5);
	 //  ref ob;
	  // ref.display();
	  // ref ob1;
	   //ref.display();
	   ref = ob2;
	   ref.display();
  }
 }