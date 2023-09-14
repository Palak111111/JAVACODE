class SwitchCalcu
{
public static void main(String args[])
 {
 java.util.Scanner sc=new java.util.Scanner (System.in);
 double a,b,res;
 System.out.println("\t CHOICES ARE ");
System.out.println("\t	PRESS 1 FOR ADDITION");
System.out.println("\t	PRESS 2 FOR SUBSTRACTION");
System.out.println("\t	PRESS 3 FOR MULTIPLICATION");
System.out.println("\t	PRESS 4 FOR DIVISION");
System.out.println("\t	PRESS 5 FOR MODULAS");
System.out.print("\t ENTER YOUR CHOICES =");
int ch=sc.nextInt();
switch(ch)
{
case 1:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a+b;
           System.out.println("Addition of two number is="+res);
           break;
case 2:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a-b;
           System.out.println("Substraction of two number is="+res);
           break;
case 3:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a*b;
           System.out.println("MUltiplication of two number is="+res);
           break;                      
case 4:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a/b;
           System.out.println("Division of two number is="+res);
           break;           
case 5:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a%b;
           System.out.println("Module of two number is="+res);
           break;
           }
           
           System.out.println("Sucessfully Done");
           }
           }
