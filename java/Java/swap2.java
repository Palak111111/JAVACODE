class Test
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("enter first numb:");
int a=sc.nextInt();
System.out.println("enter second numb:");
int b=sc.nextInt();
System.out.println("before swaping A="+a+"B="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swaping A="+a+"B="+b);
}
}
