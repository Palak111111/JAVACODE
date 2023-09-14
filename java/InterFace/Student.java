class Student 
{
  int roll;
  String Name,Fname,Mname;
  public Student()
  {
  }
  public Student(int roll,String Name,String Fname,String Mname)
  {
    this.roll=roll;
	this.Name=Name;
	this.Fname=Fname;
	this.Mname=Mname;
  }
  public void display()
  {
   System.out.println("Roll Number = "+this.roll);
   System.out.println("Name = "+this.Name);
   System.out.println("Father Name = "+this.Fname);
   System.out.println("Mother Name = "+this.Mname);
   
  }
}
interface Extra
{
  int total();
}
class Marks extends Student
{
 int p,c,m,h,e;
 public Marks()
 {
 }
 public Marks(int p,int c,int m,int h,int e,int roll,String Name,String Fname,String Mname)
 {
  super(roll,Name,Fname, Mname);
  this.p=p;
  this.c=c;
  this.m=m;
  this.h=h;
  this.e=e;
 }
 public void display()
 {
   super.display();
   System.out.println("MARKS OF PHYSICS = "+this.p);
   System.out.println("MARKS OF CHEMISTRY = "+this.c);
   System.out.println("MARKS OF MATHS = "+this.m);
   System.out.println("MARKS OF HINDI = "+this.h);
   System.out.println("MARKS OF ENGLISH = "+this.e);
 }
 
}
class Result extends Marks implements Extra
{
	public Result()
	{
		
	}
	public Result(int p,int c,int m,int h,int e,int roll,String Name,String Fname,String Mname)
	{
		super(p,c,m,h,e,roll,Name,Fname,Mname);
	}
	//@override
	public int total()
	{
		return this.p+this.c+this.m+this.h+this.e;
		
	}
	public void display()
	{
		super.display();
	}
	public double percentage(int tot)
	{
		double per=total()/5.0;
		return per;
	}

}
class Test
{
	public static void main(String args[])
	{
		Result ob=new Result(45,67,54,78,56,102,"KAMAL","ABC","XYZ");
		ob.display();
		int tot =ob.total();
		double per=ob.percentage(tot);
		System.out.println("TOTAL MARKS = "+tot);
        System.out.println("PERCENTAGE = "+per);
		
	}
}