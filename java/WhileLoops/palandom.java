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
while(n>0)
{
   s=n%10;
   n=n/10;
   r=(r*10)+s;
   }
   if(r==m){
   System.out.print("Palaendrom number=");}
 else 
 System.out.println("not  a palandrom");                                                                                                 
   }
   }
   
