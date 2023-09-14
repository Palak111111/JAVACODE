class  SeriesTh    
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
int s=0;
int sum=1;
for(int i=1;i<=n;i++)
{
System.out.print("!"+i);
if(i<n&& i%2==0)
{
System.out.print("-");
}
else if(i<n)
System.out.print("+");
sum=sum*i;
if(i%2==0)
s=s+sum;
else
s=s-sum;
}
System.out.print("=" +s);

}
}
// ENTER NUMBER :5
// !1+!2-!3+!4-!5=-101
