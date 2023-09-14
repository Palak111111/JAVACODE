//Calculator for n number of operands.

import java.util.Scanner;

class Calculator
{
   public int add(int a[])
   {
	  for(int i=0;i<a.length-1;i++)
	  {
		  a[0]=a[0]+a[i+1];
	  }		  
      return a[0];
   }
   
    public int sub(int a[])
   {
	  for(int i=0;i<a.length-1;i++)
	  {
		  a[0]=a[0]-a[i+1];
	  }		  
      return a[0]; 
   }
   
   public int mul(int a[])
   {
	   for(int i=0;i<a.length-1;i++)
	  {
		  a[0]=a[0]*a[i+1];
	  }		  
      return a[0];
   }

   public int div(int a[])
   {
	   for(int i=0;i<a.length-1;i++)
	  {
		  a[0]=a[0]/a[i+1];
	  }		  
      return a[0];
   }

   public int mod(int a[])
   {
	   for(int i=0;i<a.length-1;i++)
	  {
		  a[0]=a[0]%a[i+1];
	  }		  
      return a[0];
   }
}

class Test
{
	
	public void takeInp()
	{
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		System.out.println("   --------- CALCULATOR ---------");
	
		System.out.print("How many Operands you want to enter : ");
		int n = sc.nextInt();
		int a[] = new int [n];
		System.out.println();
    
		for(int i=0,j=1;i<n;i++,j++)
		{
			System.out.print("Enter Operand "+j+" : ");
			a[i] = sc.nextInt();
		}
    
		System.out.println("Which Operation you want to perform -->");
		System.out.println("\n Press 1 for Addition.");
		System.out.println(" Press 2 for Subtraction.");
		System.out.println(" Press 3 for Multiplication.");
		System.out.println(" Press 4 for Division.");
		System.out.println(" Press 5 for Modulous.\n\n");
	
		System.out.print(" Enter Ur Choice --> ");
		int ch = sc.nextInt();
	
		switch(ch)
		{
			case 1 : System.out.println(" Addition is "+c.add(a)+".");
			   	  break;
		
			case 2 : System.out.println(" Subtraction is "+c.sub(a)+".");
				  break;
					 
			case 3 : System.out.println(" Multiplication is "+c.mul(a)+".");
				  break;
			
			case 4 : System.out.println(" Division is "+c.div(a)+".");
		          	  break;
		
			case 5 : System.out.println(" Modulous is "+c.mod(a)+".");
				  break;
		
			default : System.out.println(" Wrong Choice ...");
		}
    }	
	
	public static void main(String args[])
    {   
		Test ob = new Test();
		
		ob.takeInp();
	
		
    }
}
