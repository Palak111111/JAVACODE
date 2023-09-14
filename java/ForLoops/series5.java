class  Seriesfive   
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
int s=0;
int sum=1;
for(int i=1,a=0;i<=n;i++)
{
System.out.print("!"+i+"/"+i);
if(i<n&& i%2==0)
{
System.out.print("+");
}
else if(i<n)
System.out.print("-");
sum=sum*i;
a=sum/i;
if(i%2==0)
s=s-a;
else
s=s+a;
}
System.out.print("=" +s);

}
}
// OUTPUT= !1/1-!2/2+!3/3-!4/4+!5/5=20
