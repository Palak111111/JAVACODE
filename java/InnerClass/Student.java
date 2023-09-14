class Student 
{
 int rollno,marks;
 double height,weight;
 String name, Fname,Mname;
 Address add;
 // Constructor 
 public Student (int rollno,int marks,double height,double weight,String name,String Mname,String Fname,int hno,int flatno,String city,String state,String colony)
 {
	this.rollno=rollno;
    this.marks=marks;    
    this.height=height;
	this.weight=weight;
	this.name=name;
	this.Fname=Fname;
	this.Mname=Mname;
	add= new Address(hno,flatno,city,state,colony);
	}
	public void  displayStud()
	{
		System.out.println("NAME OF STUDENT="+this.name);
		System.out.println("FATHER'S NAME OF STUDENT="+this.Fname);
		System.out.println("MOTHER'S NAME OF STUDENT="+this.Mname);
		System.out.println("HEIGHT OF STUDENT="+this.weight);
		System.out.println("WEIGHT  OF STUDENT="+this.height);
		System.out.println("MARKS OF STUDENT="+this.marks);
		System.out.println("ROLL NUMBER OF STUDENT="+this.rollno);
		this.add.displayAdd();
	}
	class Address 
	{
		int hno,flatno;
		String city,state,colony;
		public Address(int hno,int flatno,String city,String state,String colony)
		{
			this.hno=hno;
			this.flatno=flatno;
			this.city=city;
			this.state=state;
			this.colony=colony;
		}
		public void displayAdd()
		{
			System.out.println("HOUSE NUMBER OF STUDENT="+this.hno);
			System.out.println("FLAT NUMBER OF STUDENT="+this.flatno);
			System.out.println("COLONY OF STUDENT="+this.colony);
			System.out.println("CITY  OF STUDENT="+this.city);
			System.out.println("STATE OF STUDENT="+this.state);
		}
	}
	
}
class Test
{
	public static void main(String args[])
	{
		Student ob=new Student(123,45,45,34.5,"palak","fdfdd","rewff",19,2,"INDORE","M.P.","tilak nagar");
		ob.displayStud();
	}
}
// int rollno,int marks,double height,double weight,String name,String Mname,String Fname,int hno,int flatno,String city,String state,String colony