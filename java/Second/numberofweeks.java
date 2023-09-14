class Weeks
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print(" enter number of days===");
int n =sc.nextInt();

int fy=n/365;
int firstsyear =n%365;
System.out.println(" number of years="+fy);
int mon= n/12;
int months= n%12;
System.out.println("number of months= "+mon);
int da = n/7;
int days = n%7;
System.out.println("number of days= "+da);

}
} 
