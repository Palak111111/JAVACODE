class Addition
{
    int a,b;
    public void setData(int a,int b)
	{
	 this.a=a;
	 this.b=b;
	}
	 public int add()
	 {
	  return this.a+this.b;
	 }
}
class Substraction extends Addition
{
	private int c;
	public void setData(int a,int b,int c)
	{
		this.setData(a,b);
		this.c=c;
	}
	public int sub()
	{
		return this.add() - this.c;
	}
	public int multi()
	{
		return this.add()*this.c;
	}
	public int div()
	{
		return this.add()/this.c;
	}
	
	
	
}
class Test
{
	public static void main(String args[])
	{
		Substraction ob=new Substraction();
		ob.setData(10,40,5);
		//ob.setData(5);
		System.out.println("Addition = "+ob.add());
		System.out.println("Substraction= "+ob.sub());
		System.out.println("Multiplication= "+ob.multi());
		System.out.println("Division= "+ob.div());
	}
	
}