class MyPercentage extends Exception
{
	MyPercentage(){}
	MyPercentage(String msg){
		super(msg);
	}
}
class Test
{
	public static void main(String args[])
	{
		try{
			double per=Double.parseDouble(args[0]);
			if(per>100)
			throw new MyPercentage("Percentage can't be greater than 100");
			else if(per<0)
			throw new MyPercentage("Percentage can't be smaller than 0");
				else if(per>=60)
					System.out.println("pass with first division..");
				else if(per>=45)
					System.out.println("pass with Second division..");
				else if(per>=33)
					System.out.println("pass with third division..");
			else
			System.out.println("fail");
			
		
		
		}
			catch(MyPercentage ref)
			{
				System.out.println(ref);
				System.out.println(ref.getMessage());
			
			}
	
	
	}

}