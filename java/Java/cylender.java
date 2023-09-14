class Test
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("enter redius:");
float r=sc.nextFloat();
System.out.println("enter height:");
float h=sc.nextFloat();
float p=3.14f;
float a=(float)(2*p*r*h+2*p*r*r);
System.out.println("Area of cylendar is"+a);
}
}
