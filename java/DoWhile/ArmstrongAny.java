class ArmstrongAnyD 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER ");
int n=sc.nextInt();
int count=0;
int m=n;
while(n>0)
{
count++;
n=n/10;
}
n=m;
int sum=0;
while(n>0)
{
int r=n%10;
int i=1;
int power=1;
while(i<=count)
{
power=power*r;
i++;
}
sum=sum+power;
n=n/10;

}

if(sum==m)
{
System.out.print(" Armstrong number");
}
else
System.out.print("NOT...");

}
}
