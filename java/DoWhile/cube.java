class Cube
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("ENTER ANY NUMBER :");
int n=sc.nextInt();
int i=1;
int j=0;
do
{
j=i*i*i;
System.out.println("Cube is="+j);
i++;
}
while(i<=n);
}
}

