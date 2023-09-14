class MyExceptionAge extends Exception 
{
	MyExceptionAge(){}
	MyExceptionAge(String msg)
	{
		super(msg);
		
	}

}
class Test
{
	public static void main(String args[])
	{
		try{
			int age=Integer.parseInt(args[0]);
			if(age<0)
			throw new MyExceptionAge("age is Smaller than 0");
			else if(age<18)
			throw new MyExceptionAge("age is less than 18");
			else 
			System.out.println(+age+"= you can vote!!");
		
		}
		catch (MyExceptionAge ref)
		{
			System.out.println(ref);
			System.out.println(ref.getMessage());
		}
	
	}

}
