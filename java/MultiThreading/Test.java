class MyThread extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println(this.getName()+"="+i);
		}
	}

}
class Test
{
	public static void main(String args[])
	{
		MyThread ob1=new MyThread();
		MyThread ob2=new MyThread();
		MyThread ob3=new MyThread();
		MyThread ob4=new MyThread();
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
	}
	
	
}