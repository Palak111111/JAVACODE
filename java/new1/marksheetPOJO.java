import java.util.Scanner;
class MarksPOJO
{
	private String name,fname,mname,course,branch;
	private int roll,year,sem,p,c,m,h,e,total;
	private double per;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public String getFname()
	{
		return this.fname;
	}
	public void setMname(String mname)
	{
		this.mname=mname;
	}
	public String getMname()
	{
		return this.mname;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return this.course;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public String getBranch()
	{
		return this.branch;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public int getRoll()
	{
		return this.roll;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setSem(int sem)
	{
		this.sem=sem;
	}
	public int getSem()
	{
		return this.sem;
	}
	public void setPhysics(int p)
	{
		this.p=p;
	}
	public int getPhysics()
	{
		return this.p;
	}
	public void setChemistry(int c)
	{
		this.c=c;
	}
	public int getChemistry()
	{
		return this.c;
	}
	public void setMaths(int m)
	{
		this.m=m;
	}
	public int getMaths()
	{
		return this.m;
	}
	public void setHindi(int h)
	{
		this.h=h;
	}
	public int getHindi()
	{
		return this.h;
	}
	public void setEnglish(int e)
	{
		this.e=e;
	}
	public int getEnglish()
	{
		return this.e;
	}
	public void setTotal()
	{
		this.total=p+c+m+h+e;
	}
	public int getTotal()
	{
		return this.total;
	}
	public void setPercentage()
	{
		this.per=getTotal()/5;
	}
	public double getPer()
	{
		return this.per;
	}
}

class Student
{
	public void display(MarksPOJO s[],int i,int n)
	{
		//for(i=0;i<n;i++) 
		//{
			String name=s[i].getName(),fname=s[i].getFname(),mname=s[i].getMname(),course=s[i].getCourse(),branch=s[i].getBranch();
			int roll=s[i].getRoll(),sem=s[i].getSem(),year=s[i].getYear(),p=s[i].getPhysics(),c=s[i].getChemistry(),m=s[i].getMaths(),e=s[i].getEnglish(),h=s[i].getHindi(),total=s[i].getTotal();
			double per=s[i].getPer();
		
			  System.out.println("\t\t\tRGPV");
			  System.out.println("-----------------------------------------------------------------------");
			  System.out.println("Roll no. :"+roll+"\t\t\t\t\t\t" +"Course :"+course);
			  System.out.println("Name    :"+name+"\t\t\t\t\t\t" +"Branch :"+branch);
			  System.out.println("FName   :"+fname+"\t\t\t\t\t\t" +  "Sem    :"+sem);
			  System.out.println("MName   :"+mname+"\t\t\t\t\t\t" +"Year   :"+year);
			  System.out.println("----------------------------------------------------------------------");
			  System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark");
			  System.out.println("|\tcs101       Physics        100            33            "+p );
			  System.out.println("|\tcs102       Chemistry      100            33            "+c );			
			  System.out.println("|\tcs103       Maths          100            33            "+m );
			  System.out.println("|\tcs104       Hindi          100            33            "+h );
			  System.out.println("|\tcs105       English        100            33            "+e );
			  System.out.println("-----------------------------------------------------------------------\n");
			 total=(p+c+m+h+e);
		     per=(total)/5;
			 System.out.println("Total Marks="+total);
			 System.out.println("Percentage="+per);
			  
			if(p<33 && c<33 && m<33 && h<33 && e<33 )
			
			   System.out.println("fail in all subjects");

			else if((p<33 && c<33 && m<33 && h<33)||(p<33 && c<33 && h<33 && e<33)||(c<33 && m<33 && h<33 && e<33)|| (c<33 && m<33 && e<33 && p<33)||(h<33 && m<33 && e<33 && p<33))
			{
				System.out.println("Fail in 4 sub phy,math,hindi,eng ");
				 if(h<33 && m<33 && e<33 && p<33)
				{
				 System.out.println("Fail in 4 sub phy,math,hindi,eng ");
				}
				 else if(c<33 && m<33 && e<33 && p<33)
				 {
				System.out.println("Fail in 4 sub phy, che,math,eng ");
				 }
				else if(c<33 && m<33 && h<33 && e<33)
				{
				System.out.println("Fail in 4 sub eng, che,math,hindi ");
				}
				else if(p<33 && c<33 && h<33 && e<33)
				{
				  System.out.println("Fail in 4 sub phy, che,hindi,eng ");
				}
				else
				System.out.println("Fail in 4 sub phy, che,hindi,math ");
			}
    
    
			else if ((p<33&&c<33&&m<33)||(p<33&&h<33&&e<33)||(p<33&&c<33&&h<33)||(p<33&&c<33&&e<33)||(p<33&&h<33&&m<33)||(p<33&&m<33&&e<33)||(c<33&&m<33&&h<33)||(c<33&&m<33&&e<33)||(c<33&&h<33&&e<33)||(m<33&&h<33&&e<33))
				{ 
				
				System.out.println("Fail in three sub");
				
				   if(p<33&&c<33&&m<33)
				  {
				  System.out.println("Fail in sub math,chem,eng");
				  }
				else if(p<33&&h<33&&e<33)
				{
				System.out.println("Fail in sub phy,hindi,eng");
					} 
					   else if(h<33&&p<33&c<33)
					   {
				System.out.println("Fail in sub hindi,chem,phy");
					   }
				else if(c<33&&p<33&&e<33)
				{
				System.out.println("Fail in sub chem,eng,phy");
				}
				  
				else if(p<33&&h<33&&m<33)
				{  
				System.out.println("Fail in sub phy,hindi,math");
				}
				 else if(p<33&&m<33&&e<33)
				{  
				System.out.println("Fail in sub phy,eng,math");
				}
				 else if(c<33&&h<33&&m<33)
				{  
				System.out.println("Fail in sub chem,hindi,math");
				}
				 else if(c<33&&e<33&&m<33)
				{  
				System.out.println("Fail in sub chem,eng,math");
				}
				 else if(c<33&&h<33&&e<33)
				{  
				System.out.println("Fail in sub chem,hindi,eng");
				}
				 else //if(m<33&&h<33&&e<33)
				{  
				System.out.println("Fail in sub math,hindi,eng");
				}
			}   
			else if((p<33&&c<33)||(p<33&&m<33)||(p<33&&h<33)||(p<33&&e<33)||(c<33&&m<33)||(c<33&&e<33)||(m<33&&h<33)||(m<33&&e<33)||(h<33&&e<33))
			{ 
				   System.out.println("Fail in two subject");
				   if(p<33&&c<33)
				   System.out.println("Fail in phy,chem");
				   else if(p<33&&m<33)
				   System.out.println("Fail in phy,math");
				   else if(p<33&&h<33)
				   System.out.println("Fail in phy,hindi");
				   else if(p<33&&e<33)
					System.out.println("Fail in phy,eng");
					else if(c<33&&m<33)
					System.out.println("Fail in chem,math");
					else if(c<33&&e<33)
					System.out.println("Fail in chem,eng");
					else if(m<33&&h<33)
					System.out.println("Fail in hindi,math");
					else if(m<33&&e<33)
					System.out.println("Fail in eng,math");
					else //if(h<33&&e<33)
					System.out.println("Fail in hindi,eng");
			}
				else if(p<33 || c<33 || m<33 || h<33 || e<33)
				{
					System.out.println("Fail in one subject");
				   if(p<33)
					System.out.println("Fail in phy");
					else if(c<33)
					System.out.println("Fail in chem");
					else if(m<33)
					System.out.println("Fail in math");
					else if(h<33)
					System.out.println("Fail in hindi");
					else if(e<33)
					System.out.println("Fail in eng");
				}
					else 
					{
					System.out.println("Pass in all Subject");	
					
					}
				
					if(per>=60)
					System.out.println("1st Division.....");
					else if(per>=45)
					System.out.println("2nd Division.....");
					else if(per>=33)
					System.out.println("3rd Division.....");
					System.out.println("---------------------------------------------------------------------");
		//}
	}
}
	

class Test
{
	public static void main(String args[])
	{
		
		Test.input();
	}
	
	public static void input()
	{
		Scanner sc=new Scanner(System.in);
		MarksPOJO ob1 = new MarksPOJO();
		Student ob = new Student();
		System.out.println("How many record you want to enter:");
		int n = sc.nextInt();
		int i=0;
		MarksPOJO s[] = new MarksPOJO[n];
		
		
		for( i=0;i<n;i++)
		{
			s[i]=new MarksPOJO();
			
			Test.inputRoll(s,i,sc);
			System.out.println("Enter your name");
			s[i].setName(sc.next());
			System.out.println("Enter your Father's name");
			s[i].setFname(sc.next());
			System.out.println("Enter your Mother's name");
			s[i].setMname(sc.next());
			System.out.println("Enter your Course");
			s[i].setCourse(sc.next());
			System.out.println("Enter Your Branch");
			s[i].setBranch(sc.next());
			
		    Test.inputYear(s,i,sc);
			System.out.println("Enter your sem");
			s[i].setSem(sc.nextInt());
			sc.nextLine();
			Test.inputMarks(s,i,sc);
		    s[i].setTotal();
			s[i].setPercentage();
	    }
		Test. searching(s,i,n,ob,sc);
	}
	public static void searching(MarksPOJO s[],int i,int n ,Student ob,Scanner sc)
	{
		//Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("\tyour choices are:");
			System.out.println("\t1 for search by roll no\n\t2 for search by name\n\t3 for search by per");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				
				case 1 :System.out.println("Enter roll no you want to search:");
						int r =sc.nextInt();
						for(i=0;i<n;i++)
						{
							if(s[i].getRoll()==r)
							{
								ob.display(s,i,n);
							}
						}
						break;
				case 2 :System.out.println("Enter name you want to search:");
						String na=sc.next();
						for(i=0;i<n;i++)
						{
							if(s[i].getName().equalsIgnoreCase(na))
							{
								ob.display(s,i,n);
							}
						}
						break;
						
				case 3: System.out.println("Enter percentage you want to search");
						double p=sc.nextDouble();
						for(i=0;i<n;i++)
						{
							if(s[i].getPer()==p)
							{
								ob.display(s,i,n);
							}
						}
						break;
			}
		}
		while(ch!=0);
	}	
		
		//Test.choice();
		
	
	public static void inputRoll(MarksPOJO s[],int i,Scanner sc)
	{
		boolean y=false;
		
		do
		{
			System.out.println("Enter the roll number");
			int roll=sc.nextInt();
			s[i].setRoll(roll);
			sc.nextLine();
			y = false; 	
			for(int k=0;i>0&&k<i; k++)
			if(s[k].getRoll()==roll)
			{
				System.out.println("roll number already exist re enter roll number");
				y=true;
			}
		}
		while(y);
	}
	public static void inputYear(MarksPOJO s[],int i,Scanner sc)
	{
		int year;
		
			do
			{
			System.out.println("Enter your year");
			year=sc.nextInt();
			if(year<0||year>4)
			{
				System.out.println("Invalid year");
			}
		    s[i].setYear(year);
			}
			while(year<0||year>4);
	}
	public static void inputMarks(MarksPOJO s[],int i,Scanner sc)
	{
			int p,c,m,e,h;
			
			do
			{	
				System.out.println("Enter marks of physics");
				p = sc.nextInt(); 
				if(p<0||p>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}
				s[i].setPhysics(p);
			}
			while(p<0||p>100);
			do
			{
				System.out.println("Enter Marks of Chemistry"); 
				c = sc.nextInt();
				if(c<0||c>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}
				s[i].setChemistry(c);
			}while(c<0||c>100);
			do
			{
				System.out.println("Enter Marks of Maths");
				m = sc.nextInt();
				if(m<0||m>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}	
				s[i].setMaths(m);
			}while(m<0||m>100);
			do
			{	 
				System.out.println("Enter the Marks of Hindi");
				h = sc.nextInt();
				if(h<0||h>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}	
				s[i].setHindi(h);
			}while (h<0||h>100);
			do
			{	
				System.out.println("Enter the Marks of English");
				e = sc.nextInt();
				if(e<0||e>100)	
				{
					System.out.println("Invalid Mark  Please Enter Valid Mark");
				}
				s[i].setEnglish(e);
			}while(e<0||e>100);
		
	}
}
	