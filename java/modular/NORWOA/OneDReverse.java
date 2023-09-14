class Test 
{
    public void rev()
    {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int i,n,temp;
    int a[]=new int[10];
    System.out.println("how many elements ");
    n=sc.nextInt();
    System.out.println("enter elements in array ");
    for (i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println("\t ACTUAL ARRAY ARE ");
    for (i=0;i<n;i++)
    System.out.println("\t a["+i+"]="+a[i]);
     for (i=0;i<n/2;i++)
     {
      temp=a[i];
      a[i]=a[n-(i+1)];
      a[n-(i+1)]=a[i];
     }
     System.out.println("\t REVERSE OF ARRAY IS");
     for(i=0;i<n;i++)
     System.out.println("\t a["+i+"]="+a[i]);
     }
     public static void main(String args[])
     {
      java.util.Scanner sc=new java.util.Scanner(System.in);
      Test ob=new Test();
      ob.rev();
     }
}
