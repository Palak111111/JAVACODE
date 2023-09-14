class Salary
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println(" Enter Total Salary=");
float a= sc.nextInt();
float pf=(int)(a*12)/100;
System.out.println("pf value=" +pf);
a=a-pf;
float da= (int)(a*7.8)/100;
System.out.println("da value="+da);
a=a-da;
float ta=(int)(a*3.6)/100;
System.out.println("ta value="+ta);
a=a-ta;
System.out.println("Gross salary="+a);
}
}


