class MyException8 extends Exception 
{
	MyException8()
	{
	
	}
	MyException8(String msg)
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
			int n=Integer.parseInt(args[0]);
			
			if(n<0)
				throw new MyException8("Number is negative");
			
			else if(n>0)
				throw new MyException8("Number is Positive");
			else
				System.out.println("Number is zero");
			
			
		}
		catch(MyException8 ref)
		{
			System.out.println(ref);
			System.out.println("---------------------------------------");
			System.out.println(ref.getMessage());
		}
	}
}