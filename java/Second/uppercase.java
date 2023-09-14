class Uppercase
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner (System.in);
char ch,cap;
System.out.print("Enter Small case alphabet");
ch=sc.next().charAt(0);
cap=(char)(ch-32);
System.out.println("Upeer case alphabet is="+cap);
}
}

