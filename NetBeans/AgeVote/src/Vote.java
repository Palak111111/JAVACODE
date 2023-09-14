
import java.util.Scanner;


public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a;
        System.out.println("Enter age..");
          a=sc.nextInt();
          if(a>=18)
          {
              System.out.println("YOU ARE ELIGIBLE FOR VOTING..");
          }   
          else
              System.out.println("YOU CAN'T VOTE...");
    }
    
}
