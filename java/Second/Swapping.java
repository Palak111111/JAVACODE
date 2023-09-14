class Swapping
{
public static void main(String args[]) 
{
java.util.Scanner sc=new java.util.Scanner(System.in); 
        System.out.print("First number is a = " );

    int a = sc.nextInt(); 
         System.out.print("Second number is b = " );
    int b = sc.nextInt();

    System.out.println("Before Swaping: a = " + a + " and b= " + b);  

    a = a ^ b; 

    b = a ^ b;  

    a = a ^ b;  

    System.out.println("After  Swaping: a = " + a + " and b= " + b); 
    
    }
    }
