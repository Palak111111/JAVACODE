interface MyInf
{
 public abstract double calculator(double a,double b);
}
class MyFact
{
 MyInf ref1=new MyInf ()
  {
    public double calculator(double a,double b)
	{
	 return a+b;
	}
    
	
  };
  
  MyInf ref2=new MyInf ()
  {
    public double calculator(double a,double b)
	{
	 return a-b;
	}
    
	
  };
  MyInf ref3=new MyInf ()
  {
    public double calculator(double a,double b)
	{
	 return a*b;
	}
    
	
  };
  MyInf ref4=new MyInf ()
  {
    public double calculator(double a,double b)
	{
	 return a/b;
	}
    
	
  };
  MyInf ref5=new MyInf ()
  {
    public double calculator(double a,double b)
	{
	 return a%b;
	}
    
	
  };
}
class Calculator
{
  public static void main(String args[])
  {
	  MyFact ob=new MyFact();
    System.out.println("ADDITION OF TWO NUMBER = "+ob.ref1.calculator(5,5));
	System.out.println("SUBSTRACTION OF TWO NUMBER = "+ob.ref2.calculator(7,8));
	System.out.println("MULTIPLICATION OF TWO NUMBER = "+ob.ref3.calculator(6.2,7));
	System.out.println("DIVISION OF TWO NUMBER = "+ob.ref4.calculator(5,5));
	System.out.println("MODLUS OF TWO NUMBER = "+ob.ref5.calculator(34,5));
  }
}