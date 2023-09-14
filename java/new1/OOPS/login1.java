public static void choice(Student s[],int n)
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
					s[i]=new Student();
					s[i].input(n,s,i);
				}
				break;
				
				case 4:
				for( i=0; i<n; i++)
				{
					s[i].display();
				}
				//break;
			//}
		//}
		
		do
		{
		System.out.println("\tyour choices are:");
		System.out.println("\t1 for search by roll\n\t2 for search by name\n\t3 for search by per");
		System.out.println("Enter 10 for Exit.....");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		
			switch(ch)
			{
				case 1:
				for(i=0; i<n; i++)
					{
						s[i].searchRoll(n,sc,s);
						break;
					}
				break;
				
				case 2:
				for(i=0; i<n; i++)
				{
					s[i].searchName(n,sc,s);
					break;
				}
				break;
				
				case 3:
				for(i=0; i<n; i++)
				{
					s[i].searchPercentage(n,sc,s);
					break;
				}
				break;
		    }
		}
		while(ch!=10);
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
		System.out.println("|\t\t\t DAVV INDORE                                                   |");
		System.out.println("|\t\t( Devi Ahilya Vishwavidyalaya INDORE, MADHYA PRADESH             |");
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
           System.out.println("|EXAM:B.Sc,6th Semester Student only\tTime;10.00AM to 01.00PM       |");
      
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