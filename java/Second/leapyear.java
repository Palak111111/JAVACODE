class LeapYear
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter year");
int y= sc.nextInt();
if(y%4==0)
System.out.println("leap year");
if(y%4!=0)
System.out.println("not a leap year");
}
}
