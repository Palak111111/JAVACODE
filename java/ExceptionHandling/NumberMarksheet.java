//Number in a Marksheet.

class MyExceptionClass extends Exception
{
	MyExceptionClass(){}
	MyExceptionClass(String msg)
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
			int a=Integer.parseInt(args[0]);
			if(a>100)
				throw new MyExceptionClass("Exception : Value is Greater than Hundred.");
			else if(a<0)
				throw new MyExceptionClass("Exception : Value is Smaller than Zero.");
			else
				System.out.println("Obtained Marks is "+a+".");
		}
		
		catch(NumberFormatException | ArrayIndexOutOfBoundsException | MyExceptionClass ref)
		{
			System.out.println(ref);
			System.out.println(ref.getMessage());
		}
	}
}