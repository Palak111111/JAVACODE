class Test
{
 public void display(Test k)
  {
   System.out.println("HELLO DISPLAY");
   k.show();
  }
 public void show()
  {
   System.out.println("HELLO SHOW");
  }   
 public static void main(String args[])
 {
  Test ob=new Test();
  ob.display(ob);
  ob.show();
 }
}
