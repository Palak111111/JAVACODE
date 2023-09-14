interface MyInf
{
	public abstract void show();
	                void display();
}
	class MyFact implements MyInf
	{
		//@override
		public void display()
		{
			System.out.println("HELLO DISPLAY...");
		}
	//	@override
		public void show()
		{
			System.out.println("HELLO show...");
		}
	}
	public class Test
	{
		public static void main(String args[])
		{
			MyInf ref;
			MyFact ob= new MyFact();
			ref=ob;
			ob.display();
			ob.show();
		}
	}
