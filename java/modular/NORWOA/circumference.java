class Test
{
      public static void main(String args[])
      {
      Test ob=new Test();
      ob.cir();
      } 
public void cir()
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("enter redius of circle:");
float r= sc.nextFloat();
float p= 3.14f;
float c=(float)(2*p*r);
System.out.println("Circumference of a circle:"+c);
}
}
