/*class Login
{
public static void main( String[] args)
{
System.out.println("\t\t\t LOGIN PAGE\t\t");
System.out.println("\t\t\t    Email \t\t");
System.out.println("\t\t _____________________\t\t");
System.out.println("\t\t|____________________|\t\t");
System.out.println("\t\t\t PASSWORD \t\t");
System.out.println("\t\t______________________\t\t");
System.out.println("\t\t|_____________________|\t\t");
System.out.println("\t\t______________________\t\t");
System.out.println("\t\t|                     |\t\t");
System.out.println("\t\t|_______Sign up_______|\t\t");
}
}*/

// login
import java.util.Scanner;
class Login
{
 
	  String n;
	  int p;
	  public void  login(Scanner sc)
  {
	  Scanner sc = new Scanner(System.in);
	  this.sc=sc;
	  input();
  }
    public void input()
	{
		Scanner sc = new Scanner(System.in);
	System.out.print("ENTER NAME AS EMAIL ADDRESS---> ");
	n=sc.nextLine();
	System.out.println("ENTER PASSWORD !!! ");
    p=sc.nextInt();
	username();
  }
   public void username()
   {
	if(n=="palak")
	{ 
		if(p==1234)
		{
			System.out.print("LOGIN SUCESSFULLY....");
		}
		else
		{	
		System.out.print("WRONG PASSWORD....");
		}
    }
	 else
		{	
		System.out.print("*** WRONG USERNAME ***");
		}
    }
  
}
class Test
{
	 public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
       	Login ob=new Login();	
		ob.login(sc); 
		 
	 }
	
	
	
}



/*int m=n;
	m=Integer.parseInt(n);
	for(int i=0;i<m;i++)
	{
	
	{
     	System.out.print("***VERIFIED ADDRESS***");
	}
	else
	     System.out.print("***TRY AGAIN***");
    }
  }
}
*/
