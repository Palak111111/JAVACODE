interface MyLambda 
{
  public abstract double display(double a,double b);
}
  class Test
 {
 public static void main(String args[])
 {
  MyLambda ob=(a,b)->(a+b);
    MyLambda ob2=(a,b)->(a-b);
	  MyLambda ob3=(a,b)->(a*b);
	    MyLambda ob4=(a,b)->(a/b);
		 MyLambda ob5=(a,b)->(a%b);
  System.out.println("ADDITION = "+ob.display(3,5));
  System.out.println("SUBSTRACTION = "+ob2.display(5,8));
  System.out.println("MULTIPLICATION = "+ob3.display(9,8));
  System.out.println("DIVISION = "+ob4.display(5,9));
   System.out.println("MODULUS = "+ob5.display(2,10));
 }

}
