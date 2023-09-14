class Square
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER :");
int n=sc.nextInt();
int i=1;
int j=0;
do
{
 j=i*i;

i++;
}
while(i<=n);
System.out.println("SQUARE IS="+j);
}
}
