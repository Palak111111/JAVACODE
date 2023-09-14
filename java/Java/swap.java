class Test 
{
public static void main(String args[])
{
 java.util.Scanner sc=new java.util.Scanner(System.in);
 System.out.println("enter first numb:");
 int a= sc.nextInt();
 System.out.println("enter Second numb:");
 int b= sc.nextInt();
 System.out.println("Before swaping A="+a+"b="+b);
 int temp=a;
        a=b;
        b=temp;
 System.out.println("After swaping A="+a+"="+b);
 }
 }       
