/*class PrimeNumber 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER : ");
int n = sc.nextInt();
int a=0;
int i=2;
while(i<n)
{
if(n%i==0)

{
a++;
}
i++;
}

if(a==0)
{
System.out.println("NUMBER IS PRIME ");
}
else
System.out.println("NUMBER IS NOT A PRIME ");


}
}*/

/*class PrimeNumber 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER : ");
int n = sc.nextInt();
int a=0;
int i=1;
while(i<=n)
{
if(n%i==0)

{
a++;
}
i++;
}

if(a==2)
{
System.out.println("NUMBER IS A PRIME ");
}
else
System.out.println("NUMBER IS NOT  PRIME ");


}
}*/
class PrimeNumber 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER : ");
int n = sc.nextInt();
int i=2;
while(i<n)
{
if(n%i==0)
break;
i++;
}

if(i==n)
{
System.out.println("NUMBER IS PRIME ");
}
else
System.out.println("NUMBER IS NOT A PRIME ");


}
}
