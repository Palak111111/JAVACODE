/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
class ThreadSyn
{
		public void test(String msg)
	{
		System.out.print("INDIA IS A  "  +msg );
		try{
			Thread.sleep(5000);
			
		}
		catch(InterruptedException e){
			
		}
			System.out.println("COUNTRY");
		
	}
}
class ChildThread implements Runnable
{
	String message;
	Thread thob;
	public ChildThread()
	{
		
	}
	public ChildThread(String msg)
	{
		message=msg;
		thob=new Thread(this,msg);
		thob.start();
	}
	public void run()
	{
		synchronized (thob){
		//thob.test(message);
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		ChildThread ob1=new ChildThread("GREAT");
		ChildThread ob2=new ChildThread("COOL");
	}
}
