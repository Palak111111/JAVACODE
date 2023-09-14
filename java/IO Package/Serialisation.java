import java.io.*;

class Employee implements Serializable
{
	private int id;
	private int sal;
	private String name;
		public Employee(){
		
		}
		public Employee(int id,int sal,String name)
		{
			this.id=id;
			this.sal=sal;
			this.name=name;
		}
		public void setId()
		{
			this.id=id;
		}
		public void setSal()
		{
			this.sal=sal;
		}
		public void setName()
		{
			this.name=name;
		}
		
		public int getId()
		{
			return id;
		}
		public int getSal()
		{
			return sal;
		}
		public String getName()
		{
			return name;
		}
		public String toString()
		{
			return this.id+ " "+this.sal+ " "+this.name;
			
		}
}
class Test
{
	public static void main(String args[]) throws FileNotFoundException,IOException,ClassNotFoundException
	{
		Employee e1=new Employee(123,89878,"Kamal");
		System.out.println("Before Serialization...");
		System.out.println(e1);
		File fobj=new File("emp.text");
		FileOutputStream fos=new FileOutputStream(fobj);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		fos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fobj));
		Employee eob=(Employee)ois.readObject();
		System.out.println("After Serialization....");
		System.out.println(eob);
		
		
	}
}