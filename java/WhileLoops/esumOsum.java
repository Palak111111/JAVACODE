class EvenOdd
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("ENTER NUMBER:");
int n=sc.nextInt();
int i=1;
int esum=0;
int osum=0;
while(i<=n)
{
if(i%2==0)
esum=esum+i;
else
osum=osum+i;
i++;
System.out.println("ESUM IS =  "+esum);
System.out.println("\tOSUM IS = "+osum);
}


}
}




