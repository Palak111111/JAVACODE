interface MyInf
{
 public abstract double calculator(CalculatorPOJO ref); 
}
class CalculatorPOJO
{
	private double a,b;
	public CalculatorPOJO()
	{
		this.a=0;
		this.b=0;
	}
	public void setA(double a)
	{
		this.a=a;
	}
	public void setB(double b)
	{
		this.b=b;
	}
	public double getA()
	{
		return this.a;
	}
	public double getB()
	{
		return this.b;
	}


	
}
class Calculator
{
	 MyInf ref1=new MyInf ()
  {
    public double calculator(CalculatorPOJO ref)
	{
	 return ref.getA()+ref.getB();
	}
    
	
  };
  
  MyInf ref2=new MyInf ()
  {
    public double calculator(CalculatorPOJO ref)
	{
	 return  ref.getA()-ref.getB();
	}
    
	
  };
  MyInf ref3=new MyInf ()
  {
    public double calculator(CalculatorPOJO ref)
	{
	 return  ref.getA()*ref.getB();
	}
    
	
  };
  MyInf ref4=new MyInf ()
  {
    public double calculator(CalculatorPOJO ref)
	{
	 return  ref.getA()/ref.getB();
	}
    
	
  };
  MyInf ref5=new MyInf ()
  {
    public double calculator(CalculatorPOJO ref)
	{
	 return  ref.getA()%ref.getB();
	}
    
	
  };
}

class Test
{
	public static void main(String args[])
	{
		CalculatorPOJO ref= new CalculatorPOJO();
		 ref.setA(6);
		 ref.setB(4);
        Calculator ob=new Calculator();
        System.out.println("Addition="+ob.ref1.calculator(ref));
        System.out.println("substraction="+ob.ref2.calculator(ref));
        System.out.println("multiplication="+ob.ref3.calculator(ref));
		System.out.println("division="+ob.ref4.calculator(ref));
		System.out.println("modulus="+ob.ref5.calculator(ref));		
	}
	
}

