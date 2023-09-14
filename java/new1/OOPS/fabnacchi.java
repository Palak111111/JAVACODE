import java.util.Scanner;
class Fabinachi 
{
private int n;
public void setData(Scanner sc)
{
System.out.print("ENTER NUMBER  : ");
int n=sc.nextInt();
this.n=n;
}
public void fab()
{
int i=1;
int a=0;
int b=1;
while(i<=n)
{
System.out.print(a+" ");
int s=a+b;
a=b;
b=s;
i++;
}
}
}
class Test
{
public static void main(String args[])
{
Scanner sc=new java.util.Scanner(System.in);
Fabinachi ob=new Fabinachi();
ob.setData(sc);
ob.fab();
}
}

