interface MyLambda 
{
  int display(int x);
}
  class Test
 {
 public static void main(String args[])
 {
  MyLambda ob=(a)->(a*a);
  MyLambda ob2=(a)->(a+a);
  System.out.println(ob.display(5));
  System.out.println(ob2.display(7));
 }

}
