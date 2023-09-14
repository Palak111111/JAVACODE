class Palandrom
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
System.out.print("ENTER NUMBER= ");
int n=sc.nextInt();
int r=0;
int s=0;
int m=n;
do
{
   s=n%10;
   n=n/10;
   r=(r*10)+s;
   }
   while(n>0);
   if(r==m){
   System.out.print("Palendrom number");}
 else 
 System.out.println("..Not A Palendrom Number");                                                                                                 
   }
   }
   
