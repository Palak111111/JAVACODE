import java.util.Scanner;
class CalculatorPOJO
{
 private double a,b,c;
 public void setA(double a)
 {
  this.a=a;
 }
 public void setB(double b)
 {
  this.b=b;
 }
 public void setC(double c)
 {
  this.c=c;
 }
 public double getA()
 {
  return this.a;
 }
 public double getB()
 {
  return this.b;
 }
 public double getC()
 {
  return this.c;
 }
 public void setData (double a,double b,double c)
 {
  this.a=a;
  this.b=b;
  this.c=c;
 }
 public void setData (double a,double b)
 {
  this.a=a;
  this.b=b;
 }
 
}
// BUSSINESS LOGICS: 
class CalculatorOperation 
{
 public double addTwo(CalculatorPOJO ref)
 {
	return ref.getA()+ref.getB(); 
	 
 }
 public double subTwo(CalculatorPOJO ref)
 {
	return ref.getA()-ref.getB(); 
	 
 }
 public double multiTwo(CalculatorPOJO ref)
 {
	return ref.getA()*ref.getB(); 
	 
 }
 public double divTwo(CalculatorPOJO ref)
 {
	return ref.getA()/ref.getB(); 
	 
 }
 public double modTwo(CalculatorPOJO ref)
 {
	return ref.getA()%ref.getB(); 
 }
}
// CLIENT CLASS :
class Test
{
  public static void main(String args[])
  {
	CalculatorPOJO ob=new CalculatorPOJO();
    ob.setA(10);
    ob.setB(2);	
  CalculatorOperation clo = new CalculatorOperation();
  double res=clo.addTwo(ob);
  double res1=clo.subTwo(ob);
  double res2=clo.multiTwo(ob);
	System.out.println("A="+res);
		System.out.println("A="+res1);
			System.out.println("A="+res2);
  }
}