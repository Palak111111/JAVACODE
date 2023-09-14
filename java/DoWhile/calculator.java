class Calc

{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner (System.in);
double a,b,h,res,res1,r;
double pi=3.14;
System.out.println("\t CHOICES ARE ");
System.out.println("\t	PRESS 1 FOR ARTHMATIC OPERATIONS..");
System.out.println("\t	PRESS 2 FOR SQUARS.. ");
System.out.println("\t	PRESS 3 FOR CUBES..");
System.out.println("\t	PRESS 4 FOR VOLUME.. ");
System.out.println("\t	PRESS 5 FOR AREA..");
System.out.println("\t	PRESS 0 FOR EXIT..");
System.out.print("\t ENTER YOUR CHOICES =");
int ch=sc.nextInt();

switch(ch)
{
case 1:
	System.out.println(" FOR ARTHMATIC OPERATIONS..");
	System.out.println("\t	PRESS 1 FOR ADDITION:");
	System.out.println("\t	PRESS 2 FOR SUBSTRACTION:");
	System.out.println("\t	PRESS 3 FOR MULTIPLICATION:");
	System.out.println("\t	PRESS 4 FOR DIVISION:");
	System.out.println("\t	PRESS 5 FOR MODULAS:");
	System.out.print("\t ENTER YOUR CHOICES =");
	int cho=sc.nextInt();
	switch(cho)
          {
           case 1:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a+b;
           System.out.println("Addition of two number is="+res);
           break;
           case 2:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a-b;
           System.out.println("Substraction of two number is="+res);
           break;
           case 3:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a*b;
           System.out.println("MUltiplication of two number is="+res);
           break;                      
           case 4:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a/b;
           System.out.println("Division of two number is="+res);
           break;           
           case 5:
           System.out.print("ENTER ANY TWO NUMBERS=");
           a=sc.nextDouble();
           b=sc.nextDouble();
           res=a%b;
           System.out.println("Module of two number is="+res);
           break;
           }
case 2:  
        	 System.out.println(" FOR SQUARES..");
		 System.out.println("\t PRESS 1 FOR SQUARES OF ANY NUMBER");
	    	 System.out.print("\t ENTER YOUR CHOICE =");
		 int c=sc.nextInt();
		  switch(c)
		  {
		   case 1:
		   System.out.print("ENTER ANY TWO NUMBERS=");
		   a=sc.nextDouble();
		   res=a*a;
		   System.out.println("SQUARE OF NUMBER  is="+res);
		   break;
                  }
case 3:  
	         System.out.println(" FOR CUBE.....");
		 System.out.println("\t PRESS 1 FOR CUBES OF ANY NUMBER");
	    	 System.out.print("\t ENTER YOUR CHOICE =");
	         int cu=sc.nextInt();
                 switch(cu)
		  {
		  case 1:
		   System.out.print("ENTER ANY TWO NUMBERS=");
		   a=sc.nextDouble();
		   res=a*a*a;
		   System.out.println("cube OF NUMBER  is="+res);
		   break;
		   }
           
case 4:     
	      	 System.out.println(" FOR VOLUME......");
		 System.out.println("\t PRESS 1 FOR VOL.OF CUBE NUMBER");
		 System.out.println("\t PRESS 2 FOR VOL.OF CUBOID NUMBER");
		 System.out.println("\t PRESS 3 FOR VOL.OF CONE NUMBER");
		 System.out.println("\t PRESS 4 FOR VOL.OF CYLINDER NUMBER");
	    	 System.out.print("\t ENTER YOUR CHOICE =");
		 int vo=sc.nextInt();
           switch(vo)
           {
           case 1:
           System.out.print("ENTER ANY  NUMBERS=");
           a=sc.nextDouble();
           res=a*a*a;
           System.out.println("VOLUME OF CUBE IS ="+res);
           break;
           case 2:
           System.out.print("ENTER LENGTH=");
           a=sc.nextDouble();
           System.out.print("ENTER BREADTH =");
           b=sc.nextDouble();
           System.out.print("ENTER HEIGHT =");
           h=sc.nextDouble();
           res=a*b*h;
           System.out.println("VOLUME OF CUBOID IS ="+res);
           break;
           case 3:
           System.out.print("ENTER RADIUS  =");
           r=sc.nextDouble();
           System.out.print("ENTER HEIGHT  =");
           h=sc.nextDouble();
           res= pi*r*r*(h/3);
           System.out.println("VOLUME OF CONE IS ="+res);
           break;
           case 4:
           System.out.print("ENTER RADIUS =");
           r=sc.nextDouble();
           System.out.print("ENTER HEIGHT  =");
           h=sc.nextDouble(); 
           res= pi*r*r*h;
           System.out.println("VOLUME OF CYLINDER IS ="+res);
           break;
            }          
case 5:
                System.out.println(" FOR AREA PRESS ......");
		 System.out.println("\t PRESS 1 FOR AREA.OF CIRCLE ");
		 System.out.println("\t PRESS 2 FOR AREA OF SQUARE AND CUBE ");
		 System.out.println("\t PRESS 3 FOR AREA OF TRIANGLE AND CONE ");
		 System.out.println("\t PRESS 4 FOR AREA OF RECTANGLE AND PRISM  ");
		 System.out.println("\t PRESS 4 FOR AREA OF SPHERE  ");
	    	 System.out.print("\t ENTER YOUR CHOICE =");
		 int ar=sc.nextInt();
           switch(ar)
           {           
           case 1:
           System.out.print("ENTER RADIUS =");
           a=sc.nextDouble();
           res= pi*a*a;
           System.out.println("RADIUS OF CIRCLE  IS ="+res);
           break;
           case 2:
           System.out.print("ENTER LENGTH =");
           a=sc.nextDouble(); 
           res= a*a;
           res1=6*a*a;
           System.out.println("AREA OF SQUARE IS  ="+res);
           System.out.println("AREA OF CUBE IS  ="+res1);
           break;
           case 3:
           System.out.print("ENTER BASE =");
           b=sc.nextDouble();
           System.out.print("ENTER HEIGHT =");
           h=sc.nextDouble();
           res= 1/2*b*h;
           System.out.println("AREA OF TRIANGLE  IS ="+res);
            
           System.out.print("ENTER RADIUS =");
           r=sc.nextDouble();
           System.out.print("ENTER LENGTH =");
           h=sc.nextDouble();
           res1= pi*r*(r+h);
           System.out.println("AREA OF CONE  IS ="+res1);
           break;
           case 4:
           System.out.print("ENTER RADIUS =");
           r=sc.nextDouble();
           res=4*pi*r*r ;
           System.out.println("AREA OF SPHEARE IS ="+res);
           break;
           }
case 6:
         System.out.print("FOR EXIT PRESS 0..");
         System.exit(0);           
}          
           
           System.out.println("Sucessfully Done");
 }
  }

