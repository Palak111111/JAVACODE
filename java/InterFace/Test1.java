interface MyInf
{
	public abstract void show();
	                void display();
}
	class MyFact 
	{
	 MyInf ref=new MyInf()
	 {
		//@override
		public void display()
		{
			System.out.println("HELLO DISPLAY...");
		}
		//@override
		public void show()
		{
			System.out.println("HELLO show...");
		}
	 };
	}
     class Test1
	{
		public static void main(String args[])
		{
			MyFact ob=new MyFact();
			ob.ref.display();
			ob.ref.show();
		}
	}