class ThreadSyn
{
	  synchronized public void test(String msg)
	{
		System.out.print("INDIA IS A  "  +msg );
		try{
			Thread.sleep(5000);
			
		}
		catch(Exception e){
			
		}
			System.out.println("COUNTRY");
		
	}
}
class ChildThread extends Thread
{
	String message;
	ThreadSyn tob;
	public ChildThread()
	{
		
	}
	public ChildThread(ThreadSyn tob,String msg)
	{
		this.tob=tob;
		this.message=msg;
		this.start();
	}
	public void run()
	{
		tob.test(message);
	}
}
class Main
{
	public static void main(String args[])
	{
		ThreadSyn ts=new ThreadSyn();
		ChildThread ob1=new ChildThread(ts,"GREAT");
		ChildThread ob2=new ChildThread(ts,"COOL");
	}
}