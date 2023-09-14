// import java.util.*;
class Employe
{
  int Salary;
 public void setData(int Salary)
 {
	this.Salary=Salary;
	 
 } 
 
}
class Company extends Employe
{
  int  bonous;
  public void setData(int Salary,int bonous)
  {
	this.setData(Salary);
    this.bonous=bonous;	
	  
  }
 public int s()
 {
  return this. Salary+this.bonous;
 }

}
class Test
{
 public static void main(String args[])
 {
  Company ob=new Company();
  ob.setData(1000,500);
 // ob.();
 System.out.println("TOTAL SALARY="+ob.s());
 //  ob.boss();
 }

}