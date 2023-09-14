//Book Pages.

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
			if(a>0 && a<10)
				throw new MyExceptionClass("Exception : Number of pages is very less.");
			else if(a<1)
				throw new MyExceptionClass("Exception : Number of pages not possible.");
			else
				System.out.println("Number of pages in book is "+a+".");
		}
		
		catch(NumberFormatException | ArrayIndexOutOfBoundsException | MyExceptionClass ref)
		{
			System.out.println(ref);
			System.out.println(ref.getMessage());
		}
	}
}