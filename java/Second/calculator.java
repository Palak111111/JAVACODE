class Calculator
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("\t ENTER YOUR CHOICES=");
System.out.println("\t	PRESS 1 FOR ADDITION");
System.out.println("\t	PRESS 2 FOR SUBSTRACTION");
System.out.println("\t	PRESS 3 FOR MULTIPLICATION");
System.out.println("\t	PRESS 4 FOR DIVISION");
System.out.println("\t	PRESS 5 FOR MODULAS");
int ch=sc.nextInt();
	if (ch==1)
	{
           System.out.print("ENTER ANY TWO NUMBERS=");
           double a=sc.nextDouble();
           double b=sc.nextDouble();
           double res=a+b;
           System.out.println("Addition of two number is="+res);
	}
		else if (ch==2)
		{
		   System.out.print("ENTER ANY TWO NUMBERS=");
		   double a=sc.nextDouble();
		   double b=sc.nextDouble();
		   double res=a-b;
		   System.out.println("Substraction of two number is="+res);
		}
			else if (ch==3)
		{
		   System.out.print("ENTER ANY TWO NUMBERS=");
		   double a=sc.nextDouble();
		   double b=sc.nextDouble();
		   double res=a*b;
		   System.out.println("Multiplication of two number is="+res);
		}
			else if (ch==4)
				{
				   System.out.print("ENTER ANY TWO NUMBERS=");
				   double a=sc.nextDouble();
				   double b=sc.nextDouble();
				   double res=a/b;
				   System.out.println("Division of two number is="+res);
				}
				   else if (ch==5)
					{
					   System.out.print("ENTER ANY TWO NUMBERS=");
					   double a=sc.nextDouble();
					   double b=sc.nextDouble();
					   double res=a%b;
					   System.out.println("Modulas of two number is="+res);
					}
		else 
		System.out.println("you are wrong person.... ");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
