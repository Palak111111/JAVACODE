class Test
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("enter redius of cone:");
float r= sc.nextFloat();
System.out.println("enter length of cone:");
float l= sc.nextFloat();
float p=3.14f;
float a=(float)(p*r*l+p*r*r);
System.out.println("Area of cone is"+a);
}
}

