class FiveSubM
{
public static void main(String args[])
{
java.util. Scanner sc=new java.util.Scanner (System.in);

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
int total  = p+c+m;
double per= total/3.0;
				                                


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
		   
		               
		               
