import MyPack1.MyCalculator;
class Test
{
 public static void main(String args[])
 {
  System.out.println("YOUR CALCULATIONS ARE----->");
  MyCalculator ob=(a,b)->(a+b);
  MyCalculator ob2=(a,b)->(a-b);
  MyCalculator ob3=(a,b)->(a*b);
  MyCalculator ob4=(a,b)->(a/b);
  MyCalculator ob5=(a,b)->(a%b);
  System.out.println("ADDITION = "+ob.calculate(7,9));
  System.out.println("SUBSTRACTION = "+ob2.calculate(12,9));
  System.out.println("MULTIPLICATION = "+ob3.calculate(7,9));
  System.out.println("DIVISION = "+ob4.calculate(7,9));
  System.out.println("MODULUS = "+ob5.calculate(7,9));
  
 
 }
}