import java.util.Scanner;
class Student
{ 
   private String name,cou,Br,Mname,Sm,Fname,yr;
   private int p,c,m,h,e,total,roll;
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
	     /*public void setData(String Uni,String name,String cou,String roll,String Br,String Mname,String sm,String Fname,String yr,int p,int c,int m,int h,int e) 
		 {
		  this.Uni=Uni;
		  this.name=name;	  
		  this.cou=cou;
		  this.roll=roll;
		  this.Br=Br;
		  this.Mname=Mname;
		  this.sm=sm;
		  this.Fname=Fname;
		  this.yr=yr;
		  this.p=p;
		  this.c=c;
		  this.m=m;
		  this.e=e;
		  this.h=h;
		}
	       */	
        // System.out.println("enter the name of university");
		 //Uni = sc.nextLine();
		 System.out.println("enter the name ");
		 name = sc.nextLine();
		 System.out.println("enter the name of Course ");
		 cou = sc.nextLine();
		 this.inputRoll(n,a,x,sc);
		 System.out.println("enter the Branch ");
		 Br = sc.next();
		 System.out.println("enter the mother name ");
		 Mname =sc.next();
		 System.out.println("enter the sem ");
		 Sm =sc.next();
		 System.out.println("enter the fahers name ");
		 Fname =sc.next();
		 System.out.println("enter the year ");
		 yr = sc.next();
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
		  if((h<0||h>100))
		 {
			int mark;
            System.out.println("Invalid number..");
            System.out.println("Renter number..");			
			 mark=sc.nextInt();
			 e=mark;
		 }
		 }
		 while((h<0||h>100));
		 
		// ||(c<0||c>100)||(m<0||m>100)||(h<0||h>100)||(e<0||e>100))
		 //{
		 //System.out.println("Invalid number");
		 //}
    }
         public void searchName(int n,Student a[],int x,Scanner sc)
	    {
		 	// boolean flage= false; 
			 System.out.print("ENTER NAME YOU WANT TO SEARCH---  ");
			 String na=sc.next();
		     for(int i=0;i<n;i++)
			{
				if(a[i].name.equalsIgnoreCase(na))
                {
					a[i]=input(x);
			    }
			}
		}
		  public void searchRoll(int n,Student a[],int x,Scanner sc)
	    {
		 	// boolean flage= false; 
			 System.out.print("ENTER ROLL NO.YOU WANT TO SEARCH---  ");
			 int rn=sc.nextInt();
		     for(int i=0;i<n;i++)
			{
				if(a[i].roll.equalsIgnoreCase(rn))
                {
					a[i]=input(x);
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
	   public void marksheet(int x)
	   {   
	        Scanner sc=new Scanner(System.in);
		    total=(p+c+m+h+e);
		    per =(total/5);
		    System.out.println("_____________________________________________________________________________________________");
			System.out.print("\t\t\t\t\t DAVV INDORE \t\t\t\t\t");
			System.out.print("\nNAME\t:"+name+"\t\t\t\t\t\t\tCourse\t:"+cou+"\t");
			System.out.print("\nRoll\t:"+roll+"\t\t\t\t\t\t\t Branch\t:"+Br+"\t");
			System.out.print("\nMname\t:"+Mname+"\t\t\t\t\t\t\tSem\t:"+Sm+"\t");
			System.out.print("\nFname\t:"+Fname+"\t\t\t\t\t\t\tYear\t:"+yr+"\t");
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
						//	System.out.println("\t\t\ttotal: "+total);
						//	System.out.println("\t\tpercenatge: "+per);
						    
                            
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
       Scanner sc=new Scanner(System.in);
		 System.out.print(" HOW MANY RESULTS YOU WANT TO PRINT---> ");
         int n = sc.nextInt();
		  Student ob[]=new Student[n];
        for(int i=0;i<n;i++)
        {
		  ob[i]=new Student();	
		  ob[i].input(n,ob,i);
		}	
        
          for(int i=0;i<n;i++)
		  {
			for(int x=i;x<=i;x++)
			{
			 ob[i].marksheet(x);	
				
			}				
			  
		  }	

             int ch;
		   do
		    {
			 System.out.println("\n\n\t Your Choices Are:");
			 System.out.println("\t 1 press for seacrch by Name");
			 System.out.println("\t 2 press for seacrch by Roll Number ");
			 System.out.println("Enter the Choice");
			 ch=sc.nextInt();
			 sc.nextLine();
			 switch(ch)
			 {
				case 1:
						
						  break;
			}
		 }
		 while(ch!=20); 		  
		
	}
	
	
}
         	  

		
		
		
		
		
		
		