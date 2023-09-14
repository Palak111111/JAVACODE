package MyPack2;
import MyPack1.Person;

public class Student extends Person
{
  int roll;
  double per;
  public Student()
  {
  
  }
  
   public Student(String name,double height,double weight,double per,int roll)
   {
     super(name,height,weight);
	 this.per=per;
	 this.roll=roll;
   }
   public double per()
   {
    return per;
   }
    public int roll()
	{
	 return roll;
	}
} 