interface MyLambda 
{
  String display();
}
  class Test
 {
 public static void main(String args[])
 {
  MyLambda ob=()->"Hello Display...";
  MyLambda ob2=()->"Hello Palak...";
  System.out.println(ob.display());
  System.out.println(ob2.display());
 }

}
