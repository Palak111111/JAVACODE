class MyException7 extends Exception 
{
	MyException7()
	{
	
	}
	MyException7(String msg)
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
			int height=Integer.parseInt(args[0]);
			
			if(height<0)
				throw new MyException7("height can't be negative");
			
			else
				System.out.println("Your height is "+height);
			
			
		}
		catch(MyException7 ref)
		{
			System.out.println(ref);
			System.out.println("---------------------------------------");
			System.out.println(ref.getMessage());
		}
	}
}