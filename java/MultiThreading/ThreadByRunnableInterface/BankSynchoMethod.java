class Bank
{
	int total=1000;
	
		synchronized  public void withdrawal(int withdrawal)
		{
			if(total>=withdrawal)
			{
					System.out.println(" withdrawn + "+ withdrawal);
					total = total - withdrawal;
					System.out.println("Balance after withdrawal: "+ total);
			}
			else
			{
				System.out.println("you can't withdrawn"+withdrawal);
				System.out.println("your balance is = "+total);
			}

		
			try{
				Thread.sleep(5000);
				
				
			}
			catch(InterruptedException e)
			{}
		}
			synchronized public void credit(int credit)
			{
			System.out.println("Creadited "+credit);
			total=total+credit;
			System.out.println("Balance after Credited: "+total);
			
			try{
				Thread.sleep(5000);
				
				
			}
			catch(InterruptedException e)
			{}
			
			}
		
}
class ChildThread extends Thread
{
	int ruppee;
	Bank bob;
	public ChildThread(Bank bob,int ruppee)
	{
		this.bob=bob;
		this.ruppee=ruppee;
		this.start();
	}
	public void run()
	{
		bob.withdrawal(ruppee);
		bob.credit(ruppee);
	}
}
class Test
{
	public static void main(String args[])
	{
		Bank ob=new Bank();
		ChildThread ct1=new ChildThread(ob,200);
		ChildThread ct2=new ChildThread(ob,500);
	}

}
