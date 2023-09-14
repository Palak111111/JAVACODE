class MyThread extends Thread
{
	public void run()
	{
		int i,j,k;
		for(i=0;i<24;i++)
		{
			for(j=0;j<60;j++)
			{
				for(k=0;k<60;k++)
				{
					System.out.println(i+ ":" +j+ ":" +k);
		try{
			Thread.sleep();
		}
		catch(InterruptedException e1)
		{
		}
				}
			}
		}
	}

}
class Test
{
	public static void main(String args[])
	{
		MyThread ob1=new MyThread();
		ob1.start();
	}
	
	
}