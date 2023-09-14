class MyException extends Exception 
{
	MyException(){}
	MyException(String msg)
	{
		super(msg);
		
	}

}
class Test
{
	public static void main(String args[])
	{
		try{
			int a=Integer.parseInt(args[0]);
			if(a>100)
			throw new MyException("value is greater than 100");
			else if(a<0)
			throw new MyException("value is Smaller than 0");
			else
			System.out.println("marks"+a);
		
		}
		catch (MyException ref)
		{
			System.out.println(ref);
			System.out.println(ref.getMessage());
		}
	
	}

}
