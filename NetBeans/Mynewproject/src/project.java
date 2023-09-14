
import java.util.Scanner;


public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("ENTER ANY TWO NUMBER...");
            double a=12;
             double b = 12;
                    double res = 0;
        System.out.println("\t YOUR CHOICES ARE...");
            System.out.println("\t 1. ADDITION.");
              System.out.println("\t 2. SUBSTRACTION.");
              System.out.println("\t 3. MULTIPLICATION .");
              System.out.println("\t 4. DIVISION .");
               System.out.println("\t 5. MODULUS.");
                    System.out.println("\t ENTER YOUR CHOICES....");
                    int ch=sc.nextInt();
                        if(ch==1)
                        {
                           res= a+b;
                            System.out.println("ADDITION = "+res);
                        
                        }
                        else if(ch==2)
                        {
                           res=a-b;
                            System.out.println("SUBSTRACTION = "+res);
                        
                        }
                        else  if(ch==3)
                        {
                           res=a*b;
                            System.out.println("MULTIPLICATION = "+res);
                        
                        }
                        else if(ch==4)
                        {
                           res=a/b;
                            System.out.println("DIVISION = "+res);
                        
                        }
                        else if(ch==5)
                        {
                           res=a%b;
                            System.out.println("MODLUS = "+res);
                        
                        }
                        else
                            System.out.println("YOU ARE WORNG PERSON...");
                
    }
    
}
