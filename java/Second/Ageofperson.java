class Age
{
         public static void main(String args[])
	{
	       java.util.Scanner sc=new java.util.Scanner (System.in);
	       System.out.println("Enter any age");
	       int age=sc.nextInt();
		 if (age<=0)
		 	System.out.println("INVALID AGE");
		 else  
		    {
		    	if(age<=12)
		    		System.out.println("welcome to Childhood");
		   	else 
		    	{
				if(age<=19) 
		       		System.out.println("welcome to sweet teen age "); 
				else
				{
					if (age<=59)
						System.out.println("welcome to young age ") ;       
		    		     	else
		    		     	{
						   System.out.println(" oldage");
			   		}   
		       
		    		}
    			}
    		
    		}
    	}
}
   
        
  
            

