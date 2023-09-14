import java.lang.String;
import java.lang.System;
class Vaccine
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER YOUR NAME : ");
String n=sc.nextLine();
System.out.print("ENTER YOUR DOB : ");
 String d= sc.nextLine();
System.out.print("ENTER YOUR GENDER : ");
String g=sc.nextLine();
System.out.print("ENTER Passport num : ");
int p= Integer.parseInt(sc.nextLine());
System.out.print("ENTER Status : ");
String s=sc.nextLine();
System.out.print("ENTER YOUR beneficiary refrence Id : ");
int b= Integer.parseInt(sc.nextLine());
System.out.print(" VACCINE NAME : ");
String vn=sc.nextLine();
System.out.print("ENTER  DATE OF DOSES : ");
String ds=sc.nextLine();
System.out.print(" DOSE BATCH :");                 
int db=sc.nextInt();
System.out.print("ENTER  2nd DATE OF DOSES : ");
String dt=sc.nextLine();
System.out.print(" DOSE BATCH :");                 
int db=sc.nextInt();


System.out.println("____________________________________________________________________________");
System.out.println("|                                  ______                                  |");
System.out.println("|                                  |    |                                  |");
System.out.println("|                                  |____|                                  |");
System.out.println("|	             MINSTRY OF HEALTH AND FAMILY WELFARE                       |");
System.out.println("|                           GOVT. OF INDIA                                 |");
System.out.println("|                  COVID 19 VACCINATION CERTIFICATE                        |");
System.out.println("|  ISSUED IN INDIA BY MINSTRY OF & FAMILY WELFARE,GOVT OF INDIA            |");
System.out.println("|                    CERTIFICATE ID-896789045                              |");
System.out.println("|                                                                          |");
System.out.println("|  Beneficiary Details --------------------------------------------------  |");
System.out.println("|  NAME              : "+n+"                                                 |");
System.out.println("|  DOB (YYYY-MM-DD)  : "+d+"                                           |");
System.out.println("|  GENDER            : "+g+"                                                          |");
System.out.println("|  PASSPORT ID       : "+p+"                                                     |");
System.out.println("|  VACCINATION STATUS(NO.OF DOSES) : "+s+"                                 |");
System.out.println("|  BENEFICIARY REFRENCE ID :  "+b+"                                        |");
System.out.println("|                                                                          |");
System.out.println("|    VACCINATION DETAILS---------------------------------------------------|");
System.out.println("|                                                                          |");
System.out.println("|  VACCINE NAME :   "+vn+"                                                 |");
System.out.println("|  VACCINE TYPE :    COVID-19 Vaccine,inactivated virus                    |");
System.out.println("|  MANUFACTURE  :    BHARAT BIOTECH,INDIA                                  |");
System.out.println("|  DOSES#       :   1st                    2nd                             |");
System.out.println("|  DATE OF DOSE :  "+ds+"              "+ds+"                          |");
System.out.println("|  DOSE BATCH#  :  "+db+"               "+db+"                                  |");
System.out.println("|__________________________________________________________________________|");
System.out.println("|                                                                          |");
System.out.println("|                                                                          |");
System.out.println("| TOGETHER,INDIA WILL DEFEAT          _____________________                |");
System.out.println("|     COVID-19                        |                   |                |");
System.out.println("|  PM- NARENDRA MODI                  |                   |                |");
System.out.println("|                                     |    BARCODE        |                |");
System.out.println("|                                     |                   |                |");
System.out.println("|                                     |                   |                |");
System.out.println("|                                     |                   |                |");
System.out.println("|                                     |                   |                |");
System.out.println("|                                     |___________________|                |");
System.out.println("|                                                                          |");
System.out.println("|                                                                          |");
System.out.println("|                                                                          |");
System.out.println("|__________________________________________________________________________|");


}
}



