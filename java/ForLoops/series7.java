class  SeriesSeven 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
int s=0;
int sum=1;
int a=0;
for(int i=1;i<=n;i++)
{
System.out.print(i+"/!"+i);
if(i<n)
{
System.out.print("+");
}
sum=sum*i;
a=sum/i;
s=s+a;
}
System.out.print("=" +s);

}
}

// OUTPUT=ENTER NUMBER :5
//1/!1+2/!2+3/!3+4/!4+5/!5=34
