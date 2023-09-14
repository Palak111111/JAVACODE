class Factorial
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.println(" Enter any number");
int n=sc.nextInt();
int i=1;
int fact=1;
while(i<=n)
{
fact=fact*i;
i++;
}
System.out.println("FACTORIAL="+fact);
}
}

