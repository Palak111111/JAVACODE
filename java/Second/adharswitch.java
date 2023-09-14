class Adhar 
{ 
public static void main (String args[])
{
  java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println(" ENTER NAME IN ADHAR");
String name=sc.nextLine();
System.out.println("ENTER DATE OF BIRTH");
String dob=sc.nextLine();
System.out.println("ENTER GENDER");
String gen=sc.nextLine();
System.out.println("ENTER MOBILE NUM:");
String mob=sc.nextLine();
System.out.println("ENTER ADRESS");
String add=sc.nextLine();
System.out.println("ENTER ADHAR NUM");
String an=sc.nextLine();
System.out.println("\t\t\t\tYOUR ADHAR NUMBER\t\t\t\t");
System.out.println("\t\t\t\t123456789\t\t\t\t");
System.out.println("-------------------------------------------------------");
System.out.println("\t\t\t\t\tGovernment of India\t\t\t\t\t");
System.out.println("_________   "+name);
System.out.println("|       |   "+dob);
System.out.println("|       |    "+gen);
System.out.println("|       |   MOBILE NUM:"+mob);
System.out.println("|       |   ADRESS    : " +add);
System.out.println("|_______|   "+an);
}
}
