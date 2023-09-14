class University
{
  int establish;
  String name;
  public University(int establish,String name)
  {
	this.establish=establish;
	this.name=name;
  }
  void display()
  {
   System.out.println("NAME OF UNIVERSITY..."+this.name);
   System.out.println("ESTABLISHMENT OF UNIVERSITY..."+this.establish);
  }
}
class College extends University
{
	int code,classes;
	Address add;
	public College(int code,int classes,int cno,String city,String state,String colony,int establish,String name)
	{    
		super (establish,name);
		this.code=code;
		this.classes=classes;
		add= new Address(cno,city,state,colony);
	}
	void display()
	{
		System.out.println("CODE OF COLLEGE="+this.code);
		System.out.println("CLASSES OF COLLEGE="+this.classes);
		this.add.displayAdd();
		
	}
	class Address 
	{
		int cno;
		String city,state,colony;
		public Address(int cno,String city,String state,String colony)
		{
			this.cno=cno;
			this.city=city;
			this.state=state;
			this.colony=colony;
		}
		public void displayAdd()
		{
			System.out.println("COLLEGE NUMBER OF STUDENT="+this.cno);
			System.out.println("COLONY OF STUDENT="+this.colony);
			System.out.println("CITY  OF STUDENT="+this.city);
			System.out.println("STATE OF STUDENT="+this.state);
		}
	}
	
}
class Student extends University
{
	int rollno,marks;
    double height,weight;
    String name, Fname,Mname;
	public Student (int rollno,int marks,double height,double weight,String name,String Mname,String Fname,int establish,String name,int code,int classes,int cno,String city,String state,String colony)
	{
	    super(code,classes,add);
		
		this.rollno=rollno;
		this.marks=marks;    
		this.height=height;
		this.weight=weight;
		this.name=name;
		this.Fname=Fname;
		this.Mname=Mname;	 
		 
	}
	void display()
	{
	   System.out.println("NAME OF STUDENT="+this.name);
		System.out.println("FATHER'S NAME OF STUDENT="+this.Fname);
		System.out.println("MOTHER'S NAME OF STUDENT="+this.Mname);
		System.out.println("HEIGHT OF STUDENT="+this.weight);
		System.out.println("WEIGHT  OF STUDENT="+this.height);
		System.out.println("MARKS OF STUDENT="+this.marks);
		System.out.println("ROLL NUMBER OF STUDENT="+this.rollno);
		
	}
}
class Test
{
	public static void main(String args[])
	{
		University ref;
		//University ob=new University(1990,"RGPV BHOPAL");
		College ob1=new College(0956,3,02,"INDORE","M.P.","POLOGROUND",1990,"RGPV BHOPAL");
		Student ob2=new Student("LALU","RAMU","LEELA",34,44,56,1);
		ref = ob;
		ref.display();
	}
}