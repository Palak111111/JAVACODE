class SumOfDigits
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();
int fd=a/10000;
int r=a%10000;
System.out.println(" first digit="+fd);
int sd=r/1000;
   r=r%1000;
System.out.println(" second digit="+sd);
int td=r/100;
   r=r%100;
System.out.println("third digit="+td);
int sl=r/10;
   r=r%10;
System.out.println("fourth digit is="+sl);
System.out.println(" last digit is="+r);
int add= fd+r;
int sq= add*add;
int add1=sd+sl;
int sq1= add1*add1;
int sq3=td*td;
System.out.println(" addition of first and last digit is ="+add);
System.out.println(" Square of didits is ="+sq);
System.out.println("addition of first and last digit is ="+add1);
System.out.println("sqare="+sq1);
System.out.println("square of td="+sq3);
}
}





