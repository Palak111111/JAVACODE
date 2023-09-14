
class Student 
{
 String name,Fname;
 int roll,percentage;
 public void input()
 {
	name= "palak";
	Fname= "x y z";
    roll= 123;	
	percentage = 86 ;
	 
 } 

}
class Result extends Student
{
 public void show()
 {
	System.out.println("Name = "+name+"\n Fname = "+Fname+"\n roll number "+roll+"\n percentage = "+percentage); 
 
 }

}
class Test
{
 public static void main(String args[])
 {
  Result ob=new Result();
  ob.input();
  ob.show();
 }

}