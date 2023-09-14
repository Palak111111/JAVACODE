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
	}
	
	
}