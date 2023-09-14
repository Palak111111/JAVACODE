class Test
{
     java.util.Scanner sc=new java.util.Scanner (System.in);
     public int add(int a,int b)
      {
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextInt();
           b=sc.nextInt();
           int res=a+b;
           System.out.println("Addition of two number is="+res);
      }
      public int sub(int a,int b)
      {
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextInt();
           b=sc.nextInt();
           int res=a-b;
           System.out.println("Substraction of two number is="+res);        
      }
      public int multi(int a,int b)
      {
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextInt();
           b=sc.nextInt();
           int res=a*b;
           System.out.println("MUltiplication of two number is="+res);
      } 
      public int div(int a,int b)
      {
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextInt();
           b=sc.nextInt();
           int res=a/b;
           System.out.println("Division of two number is="+res);  
      }
      public double mod(double a, double b)
      {
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           double res=a%b;
           System.out.println("Module of two number is="+res);
      }
                
           public static void main(String args[])
           {
            java.util.Scanner sc=new java.util.Scanner (System.in);
            System.out.println("\t CHOICES ARE ");
            System.out.println("\t	PRESS 1 FOR ADDITION");
            System.out.println("\t	PRESS 2 FOR SUBSTRACTION");
            System.out.println("\t	PRESS 3 FOR MULTIPLICATION");
            System.out.println("\t	PRESS 4 FOR DIVISION");
            System.out.println("\t	PRESS 5 FOR MODULAS");
            System.out.println("\t PRESS 6 FOR EXIT ");
            System.out.print("\t ENTER YOUR CHOICES =");
	        int ch=sc.nextInt();
	        Test ob=new Test(); 
            switch(ch)
           {
            case 1:
                  ob.add();
                  break;
            case 2:
                  ob.sub();
                  break;
            case 3:
                  ob.multi();
                  break;                      
            case 4:
                  ob.div();
                  break;           
            case 5:
                  ob.mod();
                  break;   

            default:System.out.print("press from 1 to 6 only");
          }             
          System.out.println("Sucessfully Done");
        }
}
