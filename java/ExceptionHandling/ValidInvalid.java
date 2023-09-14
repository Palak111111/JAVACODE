class Test
{
	public static void main(String args[])
	{
	int i,j,count =0;
	for(i=0,j=0;i<args.length&&i<a.length;i++)
	{
	try{
			
				int a=Integer.parseInt(args[i]);
				System.out.println(a);
			
		}
		catch(NumberFormatException ref)
		{
			count++;
		}
		System.out.println("Valid "+count);
		System.out.println("InValid "+args.length-count);
	}
	}		
}