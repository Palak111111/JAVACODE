class Table
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER:");
int n=sc.nextInt();
int a=0;
int i=1;
do
{
a=n*i;
System.out.println(n+"*"+i+"="+a);
i++;
}
while(i<=10);

}
}










