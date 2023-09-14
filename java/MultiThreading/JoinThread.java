class MyThread extends Thread
{
	public MyThread()
	{
		this.start();
	}
	public MyThread(String name)
	{
		super(name);
		this.start();
	}

	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(this.getName()+"="+i);
		}
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e1)
		{
		}
	}

}
class Test
{
	public static void main(String args[])
	{
		MyThread ob1=new MyThread("First");
		MyThread ob2=new MyThread("Second");
		MyThread ob3=new MyThread("Third");
		MyThread ob4=new MyThread("Fourth");
		try{
			ob1.join();
			ob2.join();
			ob3.join(); 
			ob4.join();
			
		}
		catch(InterruptedException e1)
		{
			
			
		}
		System.out.println("MAIN THREAD START ");
		for(int i=0;i<=10;i++)
		{
			System.out.println("main method "+i);
			try{
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e1)
			{
				
			}
		}
		System.out.println("MAIN THREAD ENDS...");
	}
	
}