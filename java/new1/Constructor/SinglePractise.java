class Student
{
 static Student st=new Student();
 private Student()
 {
  System.out.print(" Hello Constructor ");
 }
 static Student getInstance()
 {
  return st;
 }
}
class Test
{
 public static void main(String args[])
 {
  Student st1=Student .getInstance();
 }
}