class Hospital
{
 int ward,rooms;
 String Pname,Hname,colony ,city,services;
 Doctor doc;
 // Constructor 
 public Student (int ward,int rooms,String Pname,String Hname,String colony,String city,String services,int id,String dname,String specilist)
 {
	this.ward=ward;
    this.rooms=rooms;
    this.Pname=Pname;
	this.Hname=Hname;
	this.colony=colony;
	this.city=city;
	this.services=services;
	doc= new Doctor(id,dname,specilist);
	}
	public void  displayHos()
	{
		System.out.println("NAME OF HOSPITAL = "+this.name);
		System.out.println("WARDS OF HOSPITAL = "+this.Fname);
		System.out.println("ROOMS OF HOSPITAL = "+this.Mname);
		System.out.println("COLONY WHERE HOSPITAL IS ="+this.weight);
		System.out.println("CITY ="+this.height);
		System.out.println("SERVICES WHICH HOSPITAL PROVIDES ="+this.marks);
		this.doc.displayDr();
	}
	class Doctor
	{
		int id;
		String dname,specilist;
		public Doctor(int id,String dname,String specilist)
		{
			this.id=id;
			this.dname=dname;
			this.specilist=specilist;
		}
		public void displayDr()
		{
			System.out.println("ID OF DOCTOR = "+this.id);
			System.out.println("DOCTOR NAME = "+this.dname);
			System.out.println("SPECILIST = "+this.specilist);
		}
	}
	
}
class Test
{
	public static void main(String args[])
	{
		Hospital ob=new Hospital(1,4,"REKHA","CITY HOSPITAL","POLOGROUND","INDORE","PHYSIOTHERAPY",0246,"Dr.MATHUR","PHYSOTHARAPIST");
		ob.displayHos();
	}
}
//int ward,int rooms,String Pname,String Hname,String colony,String city,String services,int id,String dname,String specilist)