class MyException6 extends Exception 
{
	MyException6()
	{
	
	}
	MyException6(String msg)
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
			int age=Integer.parseInt(args[0]);
			
			if(age<0)
				throw new MyException6("Age can't be negative");
			else if(age<18)
			    throw new MyException6("Age is below 18 needs to open joint account");
			else
				System.out.println("You can open account");
			
			
		}
		catch(MyException6 ref)
		{
			System.out.println(ref);
			System.out.println("---------------------------------------");
			System.out.println(ref.getMessage());
		}
	}
}