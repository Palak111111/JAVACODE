class Test
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		
		int i,j,count=0;
	
		for(i=0,j=0;i<args.length &&i<a.length;i++){
		
		try{
			a[j] =Integer.parseInt(args[i]);
			//System.out.println(a[i]);
			j++;
			
		}			
		
		catch(ArrayIndexOutOfBoundsException ref)
		{
			System.out.println("value Should be <=5");
		}
		catch(NumberFormatException ref)
		{
			count++;
		}
		
		    }
		System.out.println("Invalid = "+count);
		System.out.println("Valid = "+(j));
		//for(int j=0;j<i;System.out.println(a[j]),j++)
	}
}