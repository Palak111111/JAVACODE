class Array
{
public static void main(String args[])
 {
  java.util.Scanner sc=new java.util.Scanner(System.in);
  Array ob=new Array();
  ob.array();
 } 
public void array()
{
 java.util.Scanner sc=new java.util.Scanner(System.in);
int i;
System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter Element in array");
 for (i=0;i<n;i++)
   a[i]=sc.nextInt();
        int j=a[0];
          for(j=a[0],i=1;i<n;i++)
        {
        if(j>a[i])
             j=a[i];
        }
                 System.out.println("MIN. ELEMENT OF ARRAY IS:"+j);
}
}
