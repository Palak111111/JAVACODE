class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
/*int i,j;
System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER IN ROW:");
int n=sc.nextInt();
System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER IN COLOUM:");
int m=sc.nextInt();*/
int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
for(int []x:a)
{
for(int m:x)
System.out.print("\t"+m);
System.out.println("\n\n");
}
}
}
/*      1	2	3	4


	5	6	7	8


	9	10	11	12
*/
