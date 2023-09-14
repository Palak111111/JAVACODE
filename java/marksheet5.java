import java.util.Scanner;
class Mark
{
	public static void main(String ms[])
	{
		Scanner sc = new Scanner(System.in);
       System.out.print(" How many results you want to print --> ");
       int n = sc.nextInt();
       sc.nextLine();
       int i=1;
      
       while(i<=n)
       {
		System.out.println("enter the name of university");
		String Uni = sc.nextLine();
		System.out.println("enter the name ");
		String name = sc.nextLine();
		System.out.println("enter the name of Course ");
		String cou = sc.nextLine();
		System.out.print("Enter the roll no. ");
		String Roll = sc.nextLine();
		System.out.print("enter the Branch ");
		String Br = sc.nextLine();
		System.out.print("enter the mother name ");
		String Mname =sc.nextLine();
		System.out.print("enter the sem ");
		String Sm =sc.nextLine();
		System.out.print("enter the fahers name ");
		String Fname =sc.nextLine();
		System.out.print("enter the year ");
		String yr = sc.nextLine();
		 System.out.println("\n\n\t<-- Enter Marks Of Subjects -->\n");
		  System.out.print("\n Physics   :");
		  int p=sc.nextInt();
		  System.out.print("\n Chemistry :");
		  int c=sc.nextInt();
		  System.out.print("\n Maths     :");
		  int m=sc.nextInt();
		  System.out.print("\n Hindi     :");
		  int h=sc.nextInt();
		  System.out.print("\n English   :");
		  int e=sc.nextInt();
      
		int x=0;
		int total=(p+c+m+h+e);
		double per =(total/5);
		System.out.println("_____________________________________________________________________________________________");
		System.out.print("\t\t\t\t\t"+Uni+"\t\t\t\t\t");
		System.out.print("\nNAME\t:"+name+"\t\t\t\t\t\t\tCourse\t:"+cou+"\t");
		System.out.print("\nRoll\t:"+Roll+"\t\t\t\t\t\t\t Branch\t:"+Br+"\t");
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
		if((p<0&&p>100)||(c<0&&c>100)||(m<0&&m>100)||(h<0&&h>100)||(e<0&&e>100))
			System.out.println("Invalid number");
		{
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
						System.out.println("\t\t\ttotal: "+total);
						System.out.println("\t\tpercenatge: "+per);
								System.out.print("\n_____________________________________________________________________________________________");
						   if(x==1)
                            {
                              System.out.print("\t\t\t\tPASS");
                                System.out.println("\n\t Division             -->");
							if(per>=60)
								System.out.println("pass in first division...");
							else if(per>=45)
								System.out.println("pass in second division...");
						      else if(per>=33)
								System.out.println("pass in third division...");
						       else 
								System.out.println("\t\t....FAIL......");

                            i++;
                            sc.nextLine(); 
								
							}
					}
		}            }		
			
	
	    }
		
	}	
    



