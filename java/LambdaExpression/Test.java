interface MyLambda 
{
  void display();
}
  class Test
{
 public static void main(String args[])
 {
  MyLambda ob=()->{System.out.println("Hello Display...");};
  MyLambda ob2=()->{System.out.println("Hello Palak...");};
  ob.display();
  ob2.display();
 }

}