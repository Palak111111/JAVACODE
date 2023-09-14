class Test
{
 public void display()
  {
   System.out.println("HELLO DISPLAY");
    this.show();
  }
 public void show()
  {
   System.out.println("HELLO SHOW");
  }   
 public static void main(String args[])
 {
  Test ob=new Test();
  ob.display();
 }
}
