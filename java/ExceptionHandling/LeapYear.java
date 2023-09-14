class MyExceptionYear extends Exception 
{
	MyExceptionYear(){}
	MyExceptionYear(String msg)
	{
		super(msg);
		
	}

}
class Test
{
	public static void main(String args[])
	{
		try{
			int Year=Integer.parseInt(args[0]);
			if(Year<=0)
			throw new MyExceptionYear("Year can't be  negative");
			else if(Year % 4 == 0)
			throw new MyExceptionYear(+Year+ " = This is Leap Year");
			else
				System.out.println("THIS IS NOT LEAP  YEAR...");
		
		}
		catch (MyExceptionYear ref)
		{
			System.out.println(ref);
			//System.out.println(ref.getMessage());
		}
	
	}

}
