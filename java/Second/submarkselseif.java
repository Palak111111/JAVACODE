class Elseifsm
{
public static void main(String args[])
{
java.util. Scanner sc=new java.util.Scanner (System.in);

System.out.print("Enter Marks for PHYSICS ");
int p= sc.nextInt();
System.out.print("Enter Marks for CHEMISTRY ");
int c= sc.nextInt();
System.out.print("Enter Marks for MATHS ");
int m= sc.nextInt();
System.out.print("Enter Marks for HINDI ");
int h= sc.nextInt();
System.out.print("Enter Marks for ENGLISH ");
int e= sc.nextInt();

	if (p>100||c>100||m>100||h>100||e>100||p<0||c<0||m<0||h<0||e<0)
              System.out.println("invalid marks...");
	else if(p<33&&c<33&&m<33&&h<33&&e<33)
                     System.out.println("Fail in all subjects...");
        else if((p<33&&c<33&&m<33&&h<33)||(e<33&&c<33&&m<33&&h<33)||(p<33&&e<33&&m<33&&h<33)||(p<33&&c<33&&m<33&&e<33)||(p<33&&c<33&&h<33&&e<33))      
        {                  System.out.println("Fail in four subjects...");
               if (p<33&&c<33&&m<33&&h<33)
                      System.out.println("FAIL IN PHY,CHEM.MATHS,HINDI");
               else if(e<33&&c<33&&m<33&&h<33)                 
                       System.out.println("FAIL IN ENG,CHEM.MATHS,HINDI");
                else if (p<33&&e<33&&m<33&&h<33)
                            System.out.println("FAIL IN ENG,PHYSICS,MATHS,HINDI");
               else if (p<33&&c<33&&m<33&&e<33)
                           System.out.println("FAIL IN ENG,PHYSICS,MATHS,CHEM");
     		else    
    			 System.out.println("FAIL IN PHYSICS,CHEM,Hindi,english");}
    	             
  }
  }
  
  
  
  
  
  
  
  
  
  
