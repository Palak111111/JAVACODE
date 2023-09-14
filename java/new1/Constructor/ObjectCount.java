class Object
{
 static int c;
 public Object()
 {
  c++;
 }
 public int getcount()
 {
  return c;
 }
 
}
class Test
{
  public static void main(String args[])
  {
   Object ob=new Object();
   Object ob1=new Object();
   Object ob2=new Object();
   Object ob3=new Object();
   System.out.println("OBJECT COUNT="+ob1.getcount());
  }
}