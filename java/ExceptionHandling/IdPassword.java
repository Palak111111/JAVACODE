class MyException5 extends Exception 
{
	MyException5()
	{
	
	}
	MyException5(String msg)
	{
		super(msg);
	}
}
class Test
{
	public static void main(String args[])
	{
		try
		{
			int id=Integer.parseInt(args[0]);
			int password=Integer.parseInt(args[1]);
			if(id!=123 && password!=789)
				throw new MyException5("Invalid user id and password");
			else
				System.out.println("Login");
			
			
		}
		catch(MyException5 ref)
		{
			System.out.println(ref);
			System.out.println("---------------------------------------");
			System.out.println(ref.getMessage());
		}
	}
}