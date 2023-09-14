class Armstrong
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER ");
int n=sc.nextInt();
int r=1;
int sum=0;
int d=1;
int m=n;
do
{
r=n%10;
d=r*r*r;
n=n/10;
sum=sum+d;
}
while(n>0);
if(sum==m)
{
System.out.print("...ARMSTRONG NUMBER...");
}
else
System.out.print("... NOT A ARMSTRONG NUMBER...");

}
}

