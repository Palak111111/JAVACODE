//Comparison through logical opertaors.

import java.util.Scanner;
class NMarksheetLO
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.print(" How many results you want to print --> ");
       int n =sc.nextInt();
       sc.nextLine();
       int i=1;

      
        while(i<=n)
        {
	
	System.out.print("\n Enter Student "+i+" Details --> \n");
    	System.out.println("\n\n\t<-- Enter Student's Info -->\n");
    	System.out.print("\n Enter Student's Name      :");
    	String Name =sc.nextLine();
    	System.out.print("\n Enter Roll Number(8 Digit):");
    	String Roll =sc.nextLine();
    	System.out.print("\n Enter Father's Name       :Mr.");
    	String FName =sc.nextLine();
    	System.out.print("\n Enter Mother's Name       :Mrs.");
    	String MName = sc.nextLine();
    	System.out.print("\n Enter Course              :");
    	String Course=sc.nextLine();
    	System.out.print("\n Enter Branch              :");
    	String Branch=sc.nextLine();
    	System.out.print("\n Enter Year                :");
    	String Year=sc.nextLine();
    	System.out.print("\n Enter Semester            :");
    	String Sem=sc.nextLine();
      
       System.out.println("\n\n\t<-- Enter Marks Of Subjects -->\n");
       System.out.print("\n Physics   :");
       int p=sc.nextInt();
       System.out.print("\n Chemistry :");
       int c=sc.nextInt();
       System.out.print("\n Maths     :");
       int m=sc.nextInt();
       System.out.print("\n Hindi     :");
       int h=sc.nextInt();
       System.out.print("\n English   :");
       int e=sc.nextInt();
      
       int x=0;
       int total=p+c+m+h+e;
       float per=(total)/5f;
		
   System.out.println("\n\n\t ___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t|                                           RGPV-BHOPAL                                             |");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t|___________________________________________________________________________________________________|");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t|                                     Student's Personal Info                                       |");
       System.out.println("\t|___________________________________________________________________________________________________|");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t| Student Name  : "    +Name +"                                                                     ");
       System.out.println("\t| Roll Number   : "    +Roll +"\t                                                                   ");
       System.out.println("\t| Father Name   : Mr." +FName+"                                                                     ");
       System.out.println("\t| Mother Name   : Mrs."+MName+"                                                                     ");
       System.out.println("\t| Course        : "+Course+"                                                                        ");
       System.out.println("\t| Branch        : "+Branch+"\t                                                                      ");
       System.out.println("\t| Sem           : "+Sem+"\t                                                                         ");
       System.out.println("\t| Year          : "+Year+"\t                                                                        ");
       System.out.println("\t|___________________________________________________________________________________________________|");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t|                                     Marks Gained By Student                                       |");
       System.out.println("\t|___________________________________________________________________________________________________|");
       System.out.println("\t|                 |                 |                    |                     |                    |");
       System.out.println("\t|     SubCode     |     SubName     |      MaxMarks      |      MinMarks       |      ObtMarks      |");
       System.out.println("\t|_________________|_________________|____________________|_____________________|____________________|");
       System.out.println("\t|     CSE-501     |     Physics     |        100         |        33           |        "+p+"          |");
       System.out.println("\t|     CSE-502     |     Chemistry   |        100         |        33           |        "+c+"          |");
       System.out.println("\t|     CSE-503     |     Maths       |        100         |        33           |        "+m+"          |");
       System.out.println("\t|     CSE-504     |     Hindi       |        100         |        33           |        "+h+"          |");
       System.out.println("\t|     CSE-505     |     English     |        100         |        33           |        "+e+"          |");
       System.out.println("\t|_________________|_________________|____________________|_____________________|____________________|");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t|                                    Student's Promotion Status                                     |");
       System.out.println("\t|___________________________________________________________________________________________________|");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t| Precentage  :"+per+  "%                                                                                |");
       System.out.println("\t| Grand Total :"+total+"                                                                                  |");
       System.out.println("\t|___________________________________________________________________________________________________|");
       System.out.println("\t|                                                                                                   |");
       System.out.println("\t| Status With Subjects :                                                                            |");
       
       
       if(p<33 && c<33 && m<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in all Subjects.                                                       |");
       else if((p<33 && c<33 && m<33 && h<33 )||(p<33 && c<33 && h<33 && e<33)||(p<33 && m<33 && h<33 && e<33)||(c<33 && m<33 && h<33 && e<33))
       {
       if(p<33 && c<33 && m<33 && h<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,Hindi.                                             |");
       else if(p<33 && c<33 && m<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,English.                                           |");       
       else if(p<33 && c<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Hindi,English.                                           |");    
       else if(p<33 && m<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Maths,Hindi,English.                                           |");
       else if(c<33 && m<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,English.                                           |");    
       }
       
       else if((p<33 && c<33 && m<33 )||(p<33 && c<33 && h<33)||(p<33 && m<33 && e<33)||(p<33 && m<33 && e<33)||(p<33 && m<33 && h<33)||(c<33 && m<33 && e<33)||(c<33 && m<33 && h<33)||(c<33 && h<33 && e<33)||(m<33 && h<33 && e<33))
       {
       if(p<33 && c<33 && m<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths.                                                   |");
       else if(p<33 && c<33 && h<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Hindi.                                                   |");
       else if(p<33 && c<33 && e<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,English.                                                 |");   
       else if(p<33 && m<33 && e<33) 
           System.out.print("\t|\t\t\tFail in Phy.,Maths,English.                                                 |");
       else if(p<33 && m<33 && h<33)
           System.out.print("\t|\t\t\tFail in Phy.,Maths,Hindi.                                                   |");  
       else if(c<33 && m<33 && e<33)
           System.out.print("\t|\t\t\tFail in Chem.,Maths,English.                                                |");      
       else if(c<33 && m<33 && h<33)
           System.out.print("\t|\t\t\tFail in Chem.,Maths,Hindi.                                                  |");      
       else if(c<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Chem.,Hindi,English.                                                |");      
       else if(m<33 && h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Maths,Maths,English.                                                |");      
       }
       
       else if((p<33 && c<33 )||(p<33 && m<33 )||(p<33 && h<33 )||(p<33 && e<33 )||(c<33 && m<33 )||(c<33 && h<33 )||(c<33 && e<33 )||(m<33 && h<33)||(m<33 && e<33)||(h<33 && e<33))
       {
       if(p<33 && c<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem..                                                         |");    
       else if(p<33 && m<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Maths.                                                         |");      
       else if(p<33 && h<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Hindi.                                                         |");    
       else if(p<33 && e<33 )
           System.out.print("\t|\t\t\tFail in Phy.,English.                                                       |"); 
       else if(c<33 && m<33 )
           System.out.print("\t|\t\t\tFail in Chem.,Maths.                                                        |");  
       else if(c<33 && h<33 )
           System.out.print("\t|\t\t\tFail in Chem.,Hindi.                                                        |"); 
       else if(c<33 && e<33 )
           System.out.print("\t|\t\t\tFail in Chem.,English.                                                      |"); 
       else if(m<33 && h<33)
           System.out.print("\t|\t\t\tFail in Maths,Hindi.                                                        |");     
       else if(m<33 && e<33)
           System.out.print("\t|\t\t\tFail in Maths,English.                                                      |");
       else if(h<33 && e<33)
           System.out.print("\t|\t\t\tFail in Hindi.English                                                       |");
        }   
       
       else if(p<33 || c<33 || m<33 || h<33 || e<33)
       {
       if(p<33)
       	  System.out.print("\t|\t\t\tFail in Phy..                                                               |");
       else if(c<33)
       	  System.out.print("\t|\t\t\tFail in Chem..                                                              |");
       else if(m<33)
       	  System.out.print("\t|\t\t\tFail in Maths.                                                              |");
       else if(h<33)
       	  System.out.print("\t|\t\t\tFail in Hindi.                                                              |");
       else if(e<33)
       	  System.out.print("\t|\t\t\tFail in English.                                                            |");
       }
       
       else
       {
	  System.out.print("\t|\t\t\tPass in All Subjects.                                                       |");	
           x=1;
       }
      
  	System.out.println("\n\t| Status               :                                                                            |");
      if(x==1)
      {
           System.out.print("\t|\t\t\tPASS                                                                        |");
         System.out.println("\n\t| Division             :                                                                            |");
       if(per>=60)
      {
           System.out.print("\t|\t\t\tFirst Division                                                              |");
      }
      else if(per>=45)
      {
           System.out.print("\t|\t\t\tSecond Division                                                             |");
      }
      else if(per>=33)
      {
           System.out.print("\t|\t\t\tThird Division                                                              |");
      }
      }
      else
           System.out.print("\t|\t\t\tFAIL                                                                        |"); 
           System.out.println("\n\t|___________________________________________________________________________________________________|");
       i++;
       sc.nextLine();
       } 
    }
}      
           
           
           
           
           
           
           
           
           
