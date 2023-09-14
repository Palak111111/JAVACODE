class Test
{
  private int a,b,c;
  public Test()
  {
   this.a=0;
   this.b=0;
   this.c=0;
   System.out.println("ZERO ARGUMENT CONSTRUCTOR....");
  }
  public Test (int a,int b,int c)
  {
   this.a=a;
   this.b=b;
   this.c=c;
   System.out.println("PARAMETARISE ARGUMENT CONSTRUCTOR....");
  }
  public Test(int a,int b)
  {
   this.a=a;
   this.b=b;
  }
  public Test(int a)
  {
   this.a=a;
  }
  public void display()
  {
   System.out.println("A="+this.a+"B="+this.b+"C="+this.c);
  }
  
}
class TestMain
{
 public static void main(String args[])
 {
  Test ob=new Test();
  Test ob2=new Test(1,2,3);
  Test ob3=ob2;
  ob.display();
  ob2.display();
  ob3.display();
 
 }

}