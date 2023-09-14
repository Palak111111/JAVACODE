package MyPack1;
public class Person
{
  String name;
  Double height,weight;
  public Person()
  {
  
  }
    public Person(String name,double height,double weight)
  {
     this.name=name;
	 this.height=height;
	 this.weight=weight;
  }
   public String name()
   {
    return name;
   }
   public double height()
   {
    return height;
   }
   public double weight()
   {
    return weight;
   }

}