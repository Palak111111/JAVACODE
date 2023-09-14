//Person and Employee Relationship via Inheritance...

import java.util.Scanner;
class Person
{
    String name;
	int age,weight,height;
	
	public void setData(String name,int age,int weight,int height)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
	}
	
	public void infoP()
	{
		System.out.println(" Name    : "+name);
		System.out.println(" Age     : "+age+" yrs.");
		System.out.println(" Weight  : "+weight+" kg.");
		System.out.println(" Height  : "+height+" feet.");
	}
}

class Employee extends Person
{
	private String work,company;
	private int id,salary;
	
	public void setData(String name,String work,String company,int age,int weight,int height,int id,int salary)
	{
		this.setData(name,age,weight,height);
	    this.work=work;
		this.company=company;
		this.id=id;
		this.salary=salary;
	}
	
	public void infoE()
	{
		this.infoP();
		System.out.println(" Work    : "+work);
		System.out.println(" Company : "+company);
		System.out.println(" ID      : "+id);
		System.out.println(" Salary  : "+salary+" rs.");
	}
}

class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Employee ob = new Employee();
		String n,w,c;int a,wt,h,id,s;
		
		System.out.print("\n Enter Name of Employee : ");
		n = sc.nextLine();
		System.out.print("\n Enter Work of Employee : ");
		w = sc.nextLine();
		System.out.print("\n Enter Company of Employee : ");
		c = sc.nextLine();
		System.out.print("\n Enter Age of Employee : ");
		a = sc.nextInt();
		System.out.print("\n Enter Weight of Employee : ");
		wt = sc.nextInt();
		System.out.print("\n Enter Height of Employee : ");
		h = sc.nextInt();
		System.out.print("\n Enter ID of Employee : ");
		id = sc.nextInt();
		System.out.print("\n Enter Salary of Employee : ");
		s = sc.nextInt();
		
		ob.setData(n,w,c,a,wt,h,id,s);
		
		System.out.println("\n Attributes of a Person --> \n");
		ob.infoP();
		
		System.out.println("\n Attributes of an Employee --> \n");
		ob.infoE();
	}
}