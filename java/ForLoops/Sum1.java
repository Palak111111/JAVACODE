class Sum
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("ENTER FIRST NUMBER=");
int n=sc.nextInt();
System.out.println("ENTER SECOND NUMBER=");
int m=sc.nextInt();
int a=0;
int b=0;
int c=0;
double d=0;
for(  ;n>=a;a=n+m,b=m-n,c=m*n,d=m/n );
System.out.println("SUM IS = "+a  );
System.out.println("SUBSTRACTION IS = "+b  );
System.out.println("MULTIPLICATION IS = "+c  );
System.out.println("DIVISION IS = "+d  );

}
}
