import java.util.Scanner;
class Marksheet
{
public static void main(String args[])
{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Your roll number=");
      String roll =sc.nextLine();
      System.out.println(roll);
      System.out.println("Enter your name=");
      String Yn =sc.nextLine();
      System.out.println(Yn);
      System.out.println("Enter Father name=");
      String Fm =sc.nextLine();
      System.out.println(Fm);
      System.out.println("Enter Mother Name=");
      String Mn =sc.nextLine();
      System.out.println(Mn);
     System.out.println("Enter Course name=");
      String Cn =sc.nextLine();
      System.out.println(Cn); 
     System.out.println("Enter branch=");
      String bran =sc.nextLine();
      System.out.println(bran);
      System.out.println("Enter Sem=");
      String sem =sc.nextLine();
      System.out.println(sem);
      System.out.println("Enter Year=");
      String Year =sc.nextLine();
      System.out.println(Year);
      System.out.print("Enter Marks for PHYSICS ");
	int p= sc.nextInt();
	System.out.print("Enter Marks for CHEMISTRY ");
	int c= sc.nextInt();
	System.out.print("Enter Marks for MATHS ");
	int m= sc.nextInt();
	System.out.print("Enter Marks for HINDI ");
	int h= sc.nextInt();
	System.out.print("Enter Marks for ENGLISH ");
	int e= sc.nextInt();
	 int total  = p+c+m+h+e;
                                                double per= total/5.0;
                                            
                                                

      
      
      





System.out.println("__________________________________________________________________________________________________");
     System.out.println("|\t\t\t\t\t\tDAVV INDORE\t\t                         |");
     System.out.println("|ROLL  :"+roll+" \t\t\t\t\t\t\t      COURSE :"+Cn+"                  |");
     System.out.println("|NAME  :"+Yn+"\t\t\t\t\t\t\t    BRANCH :"+bran+"                     |");
     System.out.println("|FNAME :"+Fm+" \t\t\t\t\t\t\t   SEM   :"+sem+"                       |");     
     System.out.println("|MName :"+Mn+"\t\t\t\t\t\t\t    Year   :"+Year+"                     |");
     System.out.println("|\t\t SubCode\t  SubName \t  MaxMarks  \t  MinMarks   ObtMarks\t\t   |");
     System.out.println("|\t\t CSE-501\t   PHYSICS  \t   100     \t   33         "+p+" \t\t   |");   
     System.out.println("|\t\t SDR-502\t   CHEMISTRY \t  100     \t   33         "+c+"\t\t\t\t|");  
     System.out.println("|\t\t CVT-500\t    MATHS   \t   100     \t   33         "+m+"  \t\t  |");
     System.out.println("|\t\t SDR-502\t    HINDI   \t   100     \t   33         "+h+"\t\t\t |");  
     System.out.println("|\t\t CVT-500\t    ENGLISH \t   100     \t   33         "+e+" \t\t  |");
     System.out.println("|                                                        Total="+total+                "|");
     System.out.println("|                                                       Percentage="+per+              "|");
     System.out.print("  |                                                            Result=                    |");   
     System.out.println("|________________________________________________________________________________________________|");
    
      if(p<33)
     	{
      		if(c<33)
       	{
         		if(m<33)
          		{
            			if(h<33)
             			{
               			if(e<33)
               			{
                    				System.out.println("FAIL IN ALL SUBJECTS");
                    				}
               			else
               			{
                    				System.out.println("Fail in four subjects");
                    				System.out.println("Fail in  phy,chem,maths,hindi");
        			       }
        			 }      
                              
        			 else
            			   {
            			    if(e<33)
            			    {
                   			System.out.println("Fail in four subjects");
                   			System.out.println("Fail in  phy,chem,maths,english");
                   			}
                   	           else
                   	           {    
                   	           System.out.println("Fail in three subjects");
              			 System.out.println("Fail in  phy,chem,maths");
		      	}          
		    		}
		    		}            			
		    	 else
		    	 {
		            if(h<33)  
		            {  	 
		                 if(e<33) 
		                 {	
		  						System.out.println("Fail in four subjects");
		           				System.out.println("Fail in  phy,chem,hinfi,english,");
		           				}
		           	    	else
		           	    	{
		           	    	  System.out.println("Fail in phy,chem,hindi");          
			    	                }
				     }
		       		 else
		       		 		{
		       				if(e<33)
		       				{
		  				       System.out.println("Fail in phy,chem,english");
		  				       }
		  				     else{
		  				       System.out.println("Fail in phy,chem");
		  				       
		  				       }
		  				       }
		  			}
		  			}	       
			     else       
				{
			    if(m<33)
			    {
				 if(h<33){
				     if(e<33)
				     { 
				        System.out.println("Fail in phy,chem,english,maths");
				        }
				     else  {  
				        System.out.println("Fail in phy maths,hindi");
				        }
				        }
				          else{ 
				   		if(e<33)
				   		{
				             System.out.println("Fail in phy,maths,english");     
				             } 
		 						else{
		 					      	System.out.println("Fail in phy,maths");
	 					                    }       
		                             }
		                             }
		     else
		     { 
		       if(h<33)
		            if(e<33)
		               System.out.println("Fail in phy,hindi english");
		             else
		                System.out.println("Fail in phy,hindi");
		                
		         else
		         {
		                                   if(e<33)
							System.out.println("Fail in phy,english");
						        else
						         System.out.println("Fail in phy");                 
		         }
		         }
		                                 
		     }
		     }
		     else
		     {
		     if(c<33)
		     {
		         if(m<33)
		         {
		         		if(h<33)
		         		{
		         				if(e<33)
		         				{
		         				   System.out.println("Fail in chem,maths,hindi,english");
		         				   }
		         				 else
		         				 {
		         				  System.out.println("Fail in chem,maths,hindi");
		         				  }
		         				  }
		         		else
		         		{
		         		if(e<33)
		         		  System.out.println("Fail in chem,maths,english");
		         		else
		         		  System.out.println("Fail in chem and maths");
		         		  }
		         		  }
		         		  else
		         		  {
		         		  if(h<33){
		         		     if(e<33)
		         		     {
		         		        System.out.println("Fail in chem,hindi,english");
		         		        }
		         		      else{
		         		      System.out.println("Fail in chem,hindi");
		         		      }
		         		      }
		         		  else
		         		    {
		         		    if(e<33)
		         		         System.out.println("Fail in chem,english");
		         		     else
		         		      System.out.println("Fail in chem");    
		         		    }    
		         		  }
		         		  }
		         		  else
		         		  {
		         		    if(m<33)
		         		    {
		         		        if(h<33)
		         		        {
		         		           if(e<33)
		         		           {
		         		             System.out.println("Fail in maths,hindi,english");
		         		             }
		         		            else{
		         		            System.out.println("Fail in maths,hindi");
		         		            }
		         		            }
		         		          else
		         		          {
		         		          if(e<33)
		         		            System.out.println("Fail in maths,english");
		         		            
		         		           else
		         		               System.out.println("Fail in maths only");
		         		               }
		         		               }
		         		       else
		         		       {
		         		         if(h<33){
		         		            if(e<33)
		         		               System.out.println("Fail in hindi,english");
		         		             else
		         		              System.out.println("Fail in hindi only");
		         		              }
		         		          else
		         		          {
		         		             if(e<33)
		         		               System.out.println("Fail in english");
		         		          
		         		          else
		         		         
		         		        
                                                {
                                             
                                                
                                                
                                               
                                                   if(per>=60)
                                                        System.out.println("PASS WITH FIRST DIVISION");
                                                      else
                                                      {
                                                        if(per>=45)
                                                             System.out.println("PASS WITH SECOND DIVISION");
                                                               else
                                                                  System.out.println("PASS WITH THIRD DIVISION");
                                                                  }
                                                                  }
		         		          }
		         		          }    
		         		               
		         		       }        
		         		               
		         		               
		         		          
		         		          }
		            
     }
     }
     
     
     
     
     
     
     
     
