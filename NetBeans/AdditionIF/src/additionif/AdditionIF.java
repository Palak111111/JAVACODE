
import java.util.Scanner;


public class AdditionIF {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a,b;
         System.out.println("ENTER ANY AGE...");
           a = sc.nextInt();
            b = sc.nextInt();
            if(a==b)
                System.out.println("BOTH ARE EQUALL");
            if (a>b)
                System.out.println("A IS GREATER");
            if(a!=b)
                System.out.println("BOTH ARE UNEQUAL..");
    }
    
}
