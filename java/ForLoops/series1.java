class  Series    
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
if(i<n)
{
System.out.print("+");
}
sum=sum*i;
s=sum+s;
}
System.out.print("=" +s);

}
}

// OUTPUT=ENTER NUMBER :5
// !1+!2+!3+!4+!5=153
