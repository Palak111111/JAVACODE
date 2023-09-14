class Test
{
public void area()
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("enter redius of a circle:");
int r= sc.nextInt();
float p=3.14f;
float a=(float)(p*r*r);
System.out.println("Area of circle:"+a);
}
public static void main(String args[])
      {
      Test ob=new Test();
      ob.area();
      } 
}
