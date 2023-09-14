class TableTwo
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER:");
int n=sc.nextInt();
System.out.print(" ENTER Second NUMBER:");
int x=sc.nextInt();
System.out.print(" ENTER THIRD NUMBER:");
int y=sc.nextInt();
int a=0;
int i=1;
do
{

a=n*i;
System.out.println(n+"*"+i+"="+a);
i++;
}
while(i<=10);
i=1;
do
{
a=x*i;
System.out.println(x+"*"+i+"="+a);
i++;
}
while(i<=10);
i=1;
do
{
a=y*i;
System.out.println(y+"*"+i+"="+a);
i++;
}
while(i<=10);
}
}


