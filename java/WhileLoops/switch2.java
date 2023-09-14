class SwitchTwo
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("Your Choice Are:");
System.out.println("Chose 1 case");
System.out.println("Chose 2 case");
System.out.println("Chose 3 case");
System.out.println("Enter Your Choise");
int ch=sc.nextInt();
switch(ch)
{
 case 1:
     System.out.print("Enter any number:");
   int n=sc.nextInt();
   int i=1;
   double sum=1;
   double s=0;
   double div=0;
    while(i<=n)
    {   
    fact=fact*i;
    a=i/fact;
   sum=sum+a;
    System.out.print(i+"/"+i+"-");
    i++;
    }
  System.out.print("="+sum);
  break;
  	case 2:
     System.out.print("Enter Any Number");
     n=sc.nextInt();
     i=1;
     fact=1;
     sum =0;
     a=1;
    while(i<=n)
    {   
    fact=fact*i;
    a=fact/(i*2);
    sum=sum+a;
    System.out.print(i+"/"+i+"+");
    i++;
    }
    System.out.print("="+sum);
     break;
   case 3:
    System.out.print("Enter Any Number");
    n=sc.nextInt();
     i=1;
     fact=1;
    sum =0;
     a=1;
    while(i<=n)
    {   
    fact =fact*i;
    a =fact/(i+2);
   sum=sum+a;
    System.out.print(i+"/"+i+"+");
    i++;
    }
  System.out.print("="+sum);
  break;
  }
  }
  }


