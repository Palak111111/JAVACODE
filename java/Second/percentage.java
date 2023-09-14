class PassFail
{
public static void main(String args[])
{
java.util. Scanner sc=new java.util.Scanner (System.in);

System.out.println("Enter Percentage ");
int per=sc.nextInt(); 
        if(per<0)
           System.out.println("Invaild Percentage");
          else 
          {
             if(per>=100)
             System.out.println("Invaild percentage");
             else
                {
                if(per>=60)
                System.out.println("Pass with first division");
                  else
                   {
                     if (per>=45)
                      System.out.println("Pass with second division");
                         else 
                          {
                          if(per>=33)
                          System.out.println("pass with Third dividon ");
                          else
                          System.out.println(".....FAIL.... ");
                       }    
                  }
                
                }
          }
          
}
}


