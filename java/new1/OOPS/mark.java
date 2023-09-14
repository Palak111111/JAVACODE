import java.util.Scanner;
class Student
{ 
   private String name,cou,Br,Mname,Fname;
   private int p,c,m,h,e,total,roll,Sm,Yr;
   private double per;
   public void inputRoll(int n,Student a[],int x,Scanner sc)
    {
	     boolean y= false;
		  System.out.println("Enter roll number ");
		  roll=sc.nextInt();
	      for(int i=0;i<x;i++)
	    { 
			if(a[i].roll==this.roll)
            {
			 System.out.println("THIS ALREADY EXIST !!!");
			 y=true;
			}
	    }
        if(y==true)
        {
			this.inputRoll(n,a,x,sc);
			
		}
    }
   public void input(int n,Student a[],int x)
   {
       	   
         Scanner sc=new Scanner(System.in);   
	    
		 System.out.println("enter the name ");
		 name = sc.nextLine();
		 System.out.println("enter the name of Course ");
		 cou = sc.nextLine();
		 this.inputRoll(n,a,x,sc);
		 System.out.println("enter the Branch ");
		 Br = sc.next();
		 System.out.println("enter the mother name ");
		 Mname =sc.next();
		 System.out.println("enter the fahers name ");
		 Fname =sc.next();
		 System.out.println("enter the year ");
		 Yr=checkYear(sc);
		 System.out.println("enter the sem ");
		 Sm=checkSem(sc,Yr);
		 System.out.println("\n\n\t<-- Enter Marks Of Subjects -->\n");
		 do{
		 System.out.print("\n Physics   :");
		 p=sc.nextInt();
		 if((p<0||p>100))
		 {
			int mark;
            System.out.println("Invalid number..");
            System.out.println("Renter number..");			
			 mark=sc.nextInt();
			 p=mark;
		 }
		 }
		 while((p<0||p>100));
		 do{
		 System.out.print("\n Chemistry :");
		 c=sc.nextInt();
		  if((c<0||c>100))
		 {
			int mark;
            System.out.println("Invalid number..");
            System.out.println("Renter number..");			
			 mark=sc.nextInt();
			 c=mark;
		 }
		 }
		 while((c<0||c>100));
		 do{
		 System.out.print("\n Maths     :");
		 m=sc.nextInt();
		  if((m<0||m>100))
		 {
			int mark;
            System.out.println("Invalid number..");
            System.out.println("Renter number..");			
			 mark=sc.nextInt();
			 m=mark;
		 }
		 }
		 while((m<0||m>100));
		 do{
		 System.out.print("\n Hindi     :");
		 h=sc.nextInt();
		  if((h<0||h>100))
		 {
			int mark;
            System.out.println("Invalid number..");
            System.out.println("Renter number..");			
			 mark=sc.nextInt();
			 h=mark;
		 }
		 }
		 while((h<0||h>100));
		 do{
		 System.out.print("\n English   :");
		 e=sc.nextInt();
		  if((e<0||e>100))
		 {
			int mark;
            System.out.println("Invalid number..");
            System.out.println("Renter number..");			
			 mark=sc.nextInt();
			 e=mark;
		 }
		 }
		 while((e<0||e>100));
    }
         public void searchName(int n,Student a[],Scanner sc)
	    {
		 	// boolean flage= false; 
			 System.out.print("ENTER NAME YOU WANT TO SEARCH---  ");
			 String na=sc.next();
		     for(int i=0;i<n;i++)
			{
				if(a[i].name.equalsIgnoreCase(na))
                {
					a[i].marksheet();
			    }
			}
		}
		  public void searchRoll(int n,Student a[],Scanner sc)
	    {
		 	// boolean flage= false; 
			 System.out.print("ENTER ROLL NO.YOU WANT TO SEARCH---  ");
			 int rn=sc.nextInt();
		     for(int i=0;i<n;i++)
			{
				if(a[i].roll==rn)
                {
					a[i].marksheet();
			    }
			}
		}
            public void searchPer(int n,Student a[],Scanner sc)
	    { 
			 System.out.print("ENTER PERCENTAGE YOU WANT TO SEARCH---  ");
			 double pr=sc.nextDouble();
		     for(int i=0;i<n;i++)
			{
				if(a[i].per==pr)
                {
					a[i].marksheet();
			    }
			}
		}		 
		 
		 public int checkYear(Scanner sc)
		{
			int Yr = sc.nextInt();
			while(Yr!=1 && Yr!=2 && Yr!=3 && Yr!=4)
			{
				System.out.println(" Invalid Year...");
				System.out.print("\n Re-Enter Year             : ");
				Yr = sc.nextInt();
			}
			return Yr;
		}
		
		public int checkSem(Scanner sc,int Yr)
		{
			int Sm = sc.nextInt();
			if(Yr==1)
			{	
				while(Sm!=1 && Sm!=2)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   Sm = sc.nextInt();
			    }
			}
			
			else if(Yr==2)
			{
				while(Sm!=3 && Sm!=4)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   Sm = sc.nextInt();
			    }
			}
			
			else if(Yr==3)
			{
				while(Sm!=5 && Sm!=6)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   Sm = sc.nextInt();
			    }
			}
			
			else if(Yr==4)
			{
				while(Sm!=7 && Sm!=8)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   Sm = sc.nextInt();
			    }
			}
			
			return Sm;
		}
	   public void marksheet()
	   {   
	        Scanner sc=new Scanner(System.in);
		    total=(p+c+m+h+e);
		    per =(total/5);
		    System.out.println("_____________________________________________________________________________________________");
			System.out.print("\t\t\t\t\t DAVV INDORE \t\t\t\t\t");
			System.out.print("\nNAME\t:"+name+"\t\t\t\t\t\t\tCourse\t:"+cou+"\t");
			System.out.print("\nRoll\t:"+roll+"\t\t\t\t\t\t\t Branch\t:"+Br+"\t");
			System.out.print("\nMname\t:"+Mname+"\t\t\t\t\t\t\tSem\t:"+Sm+"\t");
			System.out.print("\nFname\t:"+Fname+"\t\t\t\t\t\t\tYear\t:"+Yr+"\t");
			System.out.print("\n_____________________________________________________________________________________________");
			System.out.println("\n\n\tMarks Gained By Student -->\n");
			System.out.println("\t SubCode     SubName     MaxMarks   MinMarks    ObtMarks\n");
			System.out.println("\t CSE-501     Physics       100         33         "+p);
			System.out.println("\t CSE-502     Chemistry     100         33         "+c);
			System.out.println("\t CSE-503     Maths         100         33         "+m);
			System.out.println("\t CSE-504     Hindi         100         33         "+h);
			System.out.println("\t CSE-505     English       100         33         "+e);
			System.out.print("\n_____________________________________________________________________________________________");
			System.out.print("\n\t\t.....RESULT....\n");
			System.out.println("\t\t Total Marks = 500 ");		
			System.out.println("\t\t Precentage  :"+per);
			System.out.println("\t\t Grand Total :"+total);
			
			if(p<33&&c<33&&m<33&&h<33&&e<33)
			System.out.println("fail in all subject");
		    else if((p<33&&c<33&&m<33&&h<33)||(p<33&&c<33&&m<33&&e<33)||(p<33&&c<33&&h<33&&e<33)||(p<33&&m<33&&h<33&&e<33)||(c<33&&m<33&&h<33&&e<33))
		    {
              System.out.println("fail in four subject");
        
				if(p<33&&c<33&&m<33&&h<33)
						System.out.println("fail in physics chemistry maths and hindi");
				else if (p<33&&c<33&&m<33&&e<33)
						System.out.println("fail in physics chemistry maths and english");
				else if (p<33&&c<33&&h<33&&e<33)
						System.out.println("fail in physics chemistry hindi and english");
				else if (p<33&&m<33&&h<33&&e<33)
						System.out.println("fail in physics maths hindi and english");
				else if (c<33&&m<33&&h<33&&e<33)
					System.out.println("fail in  chemistry maths hindi and english");
            
			}
			    else if((p<33 && c<33 && m<33)||(p<33 && c<33 && h<33)||(p<33 && c<33 && e<33)||(p<33 && m<33 && h<33)||(p<33 && m<33 && e<33)||(p<33 && h<33 && e<33)||(c<33 && m<33 && h<33)||(c<33&&m<33&&e<33)||(m<33&&h<33&&e<33)||(c<33&&h<33&&e<33))
			    {
                    System.out.println("fail in three subject");
                
                    if(p<33&&c<33&&m<33)
                        System.out.println("fail in physics chemistry and maths ");
                    else if(p<33&&c<33&&h<33)
                        System.out.println("fail in physics chemistry and hindi");
                    else if(p<33&&c<33&&e<33)
                        System.out.println("fail in physics chemistry and english");
                    else if(p<33&&m<33&&h<33)
                        System.out.println("fail in physics maths and hindi");
                    else if(p<33&&m<33&&e<33)
                        System.out.println("fail in physics maths and english");
                    else if(p<3&&h<33&&e<33)
                        System.out.println("fail in physics hindi and english");
                    else if(c<33&&m<33&&h<33)
                        System.out.println("fail in chemistry maths and hindi");
                    else if(c<33&&m<33&&e<33)
                        System.out.println("fail in chemistry maths and english");
                    else if(m<33&&h<33&&e<33)
                        System.out.println("fail in maths hindi and english");
                    else if(c<33&&h<33&&e<33)
                        System.out.println("fail in chemistry hindi and english");			
			    }
			        else if ((p<33&&c<33)||(p<33&&m<33)||(p<33&&h<33)||(p<33&&e<33)||(c<33&&m<33)||(c<33&&h<33)||(c<33&&e<33)||(m<33&&h<33)||(m<33&&e<33)||(h<33&&e<33))
				   {
                     System.out.println("fail in two subject");			
                    
						if(p<33&&c<33)
							System.out.println("fail in physics and chemistry");
						else if(p<33&&m<33)
							System.out.println("fail in physics and maths");
						else if(p<33&&h<33)
							System.out.println("fail in physics and hindi");
						else if(p<33&&e<33)
							System.out.println("fail in physics and english");
						else if(c<33&&m<33)
							System.out.println("fail in chemistry and maths");
						else if(c<33&&h<33)
							System.out.println("fail in chemistry and hindi");
						else if(c<33&&e<33)
							System.out.println("fail in chemistry and english");
						else if(m<33&&h<33)
							System.out.println("fail in maths  and hindi");
						else if(m<33&&e<33)
							System.out.println("fail in maths and english");
						else if(h<33&&e<33)
							System.out.println("fail in hindi and english");		    
				    }
				        else if(p<33||c<33||m<33||h<33||e<33)
                       {
							System.out.println("fail in one subject");
						
							if(p<3)
								System.out.println("fail in physics");
							else if(c<33)
								System.out.println("fail in chemistry");
							else if(m<33)
								System.out.println("fail in maths");
							else if(h<33)
								System.out.println("fail in hindi");
							else if(e<33)
								System.out.println("fail in english");
	                    }
			              	else
					       {	
							System.out.println("\n\t\t.....PASS.......\t\t");
				             System.out.print("\t\t\t\tPASS");
                              System.out.println("\n\t Division             -->");
							  if(per>=60)
								System.out.print("\t pass in first division...");
							  else if(per>=45)
								System.out.print("\t pass in second division...");
						      else if(per>=33)
								System.out.print("\t pass in third division...");
						      else 
								System.out.print("\t\t....FAIL......");
                                sc.nextLine(); 
								System.out.print("\n_____________________________________________________________________________________________");
							    System.out.print("\n_____________________________________________________________________________________________");
					}
}
}        
class Test
{ 
   public static void main (String args[])
   { 
      Test.login();
       Scanner sc=new Scanner(System.in);
		 System.out.print(" HOW MANY RESULTS YOU WANT TO PRINT---> ");
         int n = sc.nextInt();
		  Student ob[]=new Student[n];
		  Test.choice(ob,n);
      
   }
    
             
			 
        public static void choice(Student ob[],int n)
	{
		Scanner sc=new Scanner(System.in);
		int i,c,ch,x;
		//Student s[]= new Student[n];
		do
		{
			System.out.println("\t\t\t\t\t\tWelcome To RGPV University");
			System.out.println("\tYour choices are:");
			System.out.println("\t1 for fill Examination Form:");
			System.out.println("\t2 for Time Table:");
			System.out.println("\t3 for Create Record:");
			System.out.println("\t4 for Show Record:");
			System.out.println("\t0 for exit......");
			System.out.println("Enter your choice.....");
			c=sc.nextInt();
			switch(c)
			{
				case 1:
				Test.examForm();
				break;
				
				case 2:
				Test.timeTable();
				break;
				
				case 3:
				
				for( i=0;i<n;i++)
				{
					ob[i]=new Student();
					ob[i].input(n,ob,i);
				}
				break;
				
				case 4:
				for( i=0; i<n; i++)
				{
					ob[i].marksheet();
				}
				//break;
			//}
		//}
		    do
		    {
			 System.out.println("\n\n\t Your Choices Are:");
			 System.out.println("\t 1 press for seacrch by Name");
			 System.out.println("\t 2 press for seacrch by Roll Number ");
			 System.out.println("\t 3 press for seacrch by percentage ");
			 System.out.println("\t 4 press for Exit  ");
			 System.out.println("Enter the Choice");
			 ch=sc.nextInt();
			 sc.nextLine();
			 switch(ch)
			 {
				case 1:
						for(i=0;i<n;i++)
							{
							 ob[i].searchName(n,ob,sc);
                                break;							 
							}
						  
				break;
				case 2:
						for(i=0;i<n;i++)
						    {
							 ob[i].searchRoll(n,ob, sc);
                                break;
							}								
				break;
				case 3:
						for(i=0;i<n;i++)
						    {
							 ob[i].searchPer(n,ob, sc);
                                break;
							}								
				break;
				
			}
		 }
		   while(ch!=4); 
		   break;
	}
}
while(c!=0);
	}

	public static void login()
	{
		String username,password;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("_____________________");
			System.out.println("|                   |");
			System.out.println("|Enter your username|");
			System.out.println("|___________________|");
			username=sc.next();
			System.out.println("____________________");
			System.out.println("|                   |");
			System.out.println("|   Enter Password  |");
			System.out.println("|___________________|");
			password=sc.next();
			if(username.equals("admin" ) && password.equals("a@123"))
			{
				System.out.println("\t\t Welcome To DAVV");
			}
			else
			{
				System.out.println("Incorrect Username & Password");
			}
		}
		while((!username.equals("admin")) ||( !password.equals("a@123")));
	}
	public static void examForm()
	{
		System.out.println("_______________________________________________________________________");
		System.out.println("|                                                                     |");
		System.out.println("|\t\t\t DAVV INDORE                                     |");
		System.out.println("|\t\t( Devi Ahilya Vishwavidyalaya INDORE, MADHYA PRADESH )|");
		System.out.println("|    ______________________________                                   |");
		System.out.println("|    |                             |                                  |");
		System.out.println("|    |Examination Application Form |                                  |");
		System.out.println("|    |_____________________________|                                  |");
		System.out.println("|                                                                     |");
		System.out.println("|    Enter your Name:                                                 |");
		System.out.println("|    Enter your Father's Name:                                        |");
		System.out.println("|    Enter your Mother's Name:                                        |");
		System.out.println("|    Enter your Address :                                             |");
		System.out.println("|    Enter year :                                                     |");
		System.out.println("|    Enter sem :                                                      |");
		System.out.println("|    Enter 1st Subject Name :                                         |");
		System.out.println("|    Enter 2nd Subject Name :                                         |");
		System.out.println("|    Enter 3rd Subject Name :                                         |");
		System.out.println("|    Enter 4th Subject Name :                                         |");
		System.out.println("|    Enter 5th Subject Name :                                         |");
		System.out.println("|_____________________________________________________________________|");
	}
	public static void timeTable()
	{
		   System.out.println("_______________________________________________________________________");
           System.out.println("|\t\tDAVV INDORE                                                      |");
           System.out.println("|\t\t\t\tTIME TABLE                                                   |");
           System.out.println("|\t\t\tEXAMINATION MAY-2023                                           |");
		   System.out.println("|                                                                     |");
           System.out.println("|EXAM:B.Sc,6th Semester Student only\tTime;10.00AM to 01.00PM         |");
           System.out.println("|    _________________________________________________________________");
		   System.out.println("|   |Branch|   27/04/2023     |   02/05/2023     |    08/05/2023  |   |");
		   System.out.println("|   |      |   Thurseday      |     Tuesday      |      Monday    |   |");
		   System.out.println("|   |______|__________________|__________________|________________|   |");
		   System.out.println("|   |      |     BSC 601      |       BSC602     |    BSC603      |   |");
		   System.out.println("|   |  BSC |   FOOD AND MICRO |  ENDOCRINOLOGY   |    CHEMISTRY   |   |");
		   System.out.println("|   |biotec|   BIOLOGY        |                  |                |   |");
		   System.out.println("|   |______|__________________|__________________|________________|   |");
		   System.out.println("|   |      |     BSC 601      |       CE802      |    CE803       |   |");
		   System.out.println("|   |  BSC |  APPLIED MATHS   |     APPLIED GK   |     DATA       |   |");
		   System.out.println("|   | maths|                  |                  |   ANALYSIS     |   |");
		   System.out.println("|   |______|__________________|__________________|________________|   |");
		   System.out.println("|   |      |     BSC601       |      CM802       |    CM803       |   |");
		   System.out.println("|   |  BSC |  APPLIED PHYSICS |  Process Pipling | Petrochemica   |   |");
		   System.out.println("|   |physic|                  |      Design      |  Engineering   |   |");
		   System.out.println("|   |______|__________________|__________________|________________|   |");
		   System.out.println("|                                                                     |");
		   System.out.println("|_____________________________________________________________________|");
	
		   
		
	}
	
	
}
         	  

		
		
		
		
		
		
		