class Amount
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println(" Enter Amount");
int a=sc.nextInt();
int z=a/2000;
a=a%2000;
System.out.println("2000 Rs.="+z);
int n=a/500;
a=a%500;
System.out.println("500 Rs.="+n);
int b=a/200;
a=a%200;
System.out.println("200 Rs.="+b);
int c=a/100;
a=a%100;
System.out.println("100 Rs.="+c);
int d=a/50;
a=a%50;
System.out.println("50 Rs.="+d);
int e=a/20;
a=a%20;
System.out.println("20 Rs.="+e);
int f=a/10;
a=a%10;
System.out.println("10 Rs.="+f);
int g=a/5;
a=a%5;
System.out.println("5 Rs.="+g);
int h=a/2;
a=a%2;
System.out.println("2 Rs.="+h);
int i=a/1;

System.out.println("1 Rs.="+i);
}
}
