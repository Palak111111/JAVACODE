class MyThreadRun implements Runnable
{
	Thread thob;
	public MyThreadRun(String name)
	{
		thob=new Thread(this,name);
		thob.start();
	
	}
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(thob.getName()+"="+i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e1)
			{
				
			}
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		MyThreadRun ob1=new MyThreadRun("First");
		MyThreadRun ob2=new MyThreadRun("Second");
		ob1.thob.join();
		ob2.thob.join();
	}
	
}