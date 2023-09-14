class PrimeNumberT
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER : ");
int n = sc.nextInt();
int i=2;
do
{
if(n%i==0)
break;
i++;


if(i==n)
{
System.out.println("NUMBER IS PRIME ");
}
else
System.out.println("NUMBER IS NOT A PRIME ");
}
while(i<n);

}
}
