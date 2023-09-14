class Parent
{
  public void food2()
  {
	System.out.println("I EAT FOOD")  ;
  }
  public void water2()
  {
	System.out.println("I DRINK WATER");  
  }
  public void milk2()
  {
	System.out.println("I SOMETIMES DRINK MILK");  
  }
}
class Child extends Parent
{
	public void food()
  {
	System.out.println("I  DON'T EAT FOOD");  
  }
  public void milk()
  {
	System.out.println("I ONLY DRINK MILK...");  
  }
	
}
class Test
{
	public static void main(String args[])
	{
	Child ch=new Child();
	System.out.println("Child = ");
	ch.food();
	ch.milk();
	System.out.println("Parent = ");
	ch.food2();
	ch.milk2();
	ch.water2();
	//System.out.println("Child= "+ch.food());
    }
	
}	