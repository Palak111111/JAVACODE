class Test
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		
		
			try{
			for(int i=0;i<args.length;i++){
			a[i] =Integer.parseInt(args[i]);
			System.out.println(a[i]);
			
			}
		}			
		
		catch(ArrayIndexOutOfBoundsException ref)
		{
			System.out.println("value Should be <=5");
		}
		catch(NumberFormatException ref)
		{
			System.out.println("Number should be integer");
		}
	}
}