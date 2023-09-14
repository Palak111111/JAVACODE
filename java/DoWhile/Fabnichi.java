class Fabinachi 
{
public static void main(String args[])
{
java.util. Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER  : ");
int n=sc.nextInt();
int i=1;
int a=0;
int b=1;
do
{
System.out.print(a+" ");
int s=a+b;
a=b;
b=s;
i++;
}
while(i<=n);
}
}

	
