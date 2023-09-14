class Employee
{
  private int id;
  private String name;
  private int sal;
    public Employee(int id,String name,int sal)
    {
       this.id=id;
	    this.name=name;
		 this.sal=sal;
    }
	public String toString()
	{
	  System.out.println(super.toString());
	  return "ID = "+this.id+"NAME = "+this.name+"SALARY = "+this.sal;
	}
}
class Test
{
	public static void main(String args[])
	{
		Employee e= new Employee(101,"Kamal",23452);
		System.out.println(e);
		//System.out.println(e.toString());
    }
}