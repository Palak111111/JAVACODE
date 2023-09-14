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
					System.out.print(i+ ":" +j+ ":" +k+"\r");
					Thread.sleep();
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