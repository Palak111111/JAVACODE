class CompoundIntrest
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("Enter Principle ");
int P= sc.nextInt();
System.out.print("enter rate")
int R=sc.nextInt();
System.out.println(" enter time")
int T= sc.nextInt();
System.out.println(" number of times intrest applied")
int N= sc.nextInt();
int CI = P*(1+R/N)^(N*T);
System.out.println("Coumpound intrest="+CI);
}
}
