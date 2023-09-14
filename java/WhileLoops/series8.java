class  SeriesEight 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
int s=0;
int sum=1;
int div=0;
int i=1;
while (i<=n)
{
System.out.print(i+"/!"+i);
if(i<n)
{
System.out.print("+");
}
else if(i<n)
System.out.print("-");

sum=sum*i;
div=sum/i;
if(i%2==0&&i<n)
s=s+div;
else
s=s-div;
i++;
}
System.out.print("=" +s);

}
}
