 import java.util.Scanner;
class NMarksheet
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.print(" How many results you want to print --> ");
       int n = sc.nextInt();
       sc.nextLine();
       int i=1;
      
       while(i<=n)
      {

	System.out.print("\n Enter Student "+i+" Details --> \n");
	
    	System.out.println("\n\n\t<-- Enter Student's Info -->\n");
    	System.out.print("\n Enter Student's Name :");
    	String Name =sc.nextLine();
    	System.out.print("\n Enter Roll Number    :");
    	String Roll =sc.nextLine();
    	System.out.print("\n Enter Father's Name  :Mr.");
    	String FName =sc.nextLine();
    	System.out.print("\n Enter Mother's Name  :Mrs.");
    	String MName = sc.nextLine();
    	System.out.print("\n Enter Course         :");
    	String Course=sc.nextLine();
    	System.out.print("\n Enter Branch         :");
    	String Branch=sc.nextLine();
    	System.out.print("\n Enter Year           :");
    	String Year=sc.nextLine();
    	System.out.print("\n Enter Semester       :");
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
		
      
       System.out.println("\n\n\t\t\t\t\t  DAVV-INDORE \n\n\n");
       System.out.println("\tStudent's Personal Info -->\n");
       System.out.println("\t Student Name  :"    +Name +    "\t\t\t\t\t\t Course :"+Course);
       System.out.println("\t Roll Number   :"    +Roll +    "\t\t\t\t\t\t Branch :"+Branch);
       System.out.println("\t Father Name   :Mr." +FName+    "\t\t\t\t\t\t Sem    :"+Sem);
       System.out.println("\t Mother Name   :Mrs."+MName+    "\t\t\t\t\t\t Year   :"+Year);
       
       System.out.println("\n\n\tMarks Gained By Student -->\n");
       System.out.println("\t SubCode     SubName     MaxMarks   MinMarks    ObtMarks\n");
       System.out.println("\t CSE-501     Physics       100         33         "+p);
       System.out.println("\t CSE-502     Chemistry     100         33         "+c);
       System.out.println("\t CSE-503     Maths         100         33         "+m);
       System.out.println("\t CSE-504     Hindi         100         33         "+h);
       System.out.println("\t CSE-505     English       100         33         "+e);
       
       System.out.println("\n\n\tStudent's Promotion Status -->\n");
       System.out.println("\t Precentage  :"+per);
       System.out.println("\t Grand Total :"+total);
       System.out.println("\t Status With Subjects -->");
       
		
	if(p<33)
	  if(c<33)
	    if(m<33)
	      if(h<33)
	        if(e<33)
	          System.out.println("\t\t\t\tFAIL In All Subjects.");
	        else
	          System.out.println("\t\t\t\tFail in Phy.,Chem.,Maths,Hindi.");
	      else
	      {
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Phy.,Chem.,Maths,English.");
	        else
	          System.out.println("\t\t\t\tFail in Phy.,Chem.,Maths.");
	      }
	    else
	    {
	      if(h<33)
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Phy.,Chem.,Hindi,English.");
	        else
	          System.out.println("\t\t\t\tFail in Phy.,Chem.,Hindi.");
	      else
	      {
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Phy.,Chem.,English.");
	        else
	          System.out.println("\t\t\t\tFail in Phy.,Chem.,.");
	          
	      }
	    }
	  else
	  {
	    if(m<33)
	      if(h<33)
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Phy.,Maths,Hindi,English.");
	        else
	          System.out.println("\t\t\t\tFail in Phy.,Maths,Hindi.");
	      else
	      {
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Phy.,Maths,English.");
	        else
	          System.out.println("\t\t\t\tFail in Phy.,Maths.");
	      }
	    else
	    {
	      if(h<33)
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Phy.,Hindi,English.");
	        else
	          System.out.println("\t\t\t\tFail in Phy.,Hindi.");
	      else
	      {
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Phy.,English.");
	        else
	          System.out.println("\t\t\t\tFail in Phy..");
	      }
	    }
	  }
	else
	{
	  if(c<33)
	    if(m<33)
	      if(h<33)
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Chem.,Hindi,English.");
	        else
	          System.out.println("\t\t\t\tFail in Chem.,Maths,Hindi.");
	      else
	      {
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Chem.,Maths,English.");
	        else
	          System.out.println("\t\t\t\tFail in Chem.,Maths.");
	      }
	    else
	    {
	      if(h<33)
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Chem.,Hindi,English.");
	        else
	          System.out.println("\t\t\t\tFail in Chem.,Hindi.");
	      else
	      {
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Chem.,English.");
	        else
	          System.out.println("\t\t\t\tFail in Chem..");
	      }
	    }
	  else
	  {
	    if(m<33)
	      if(h<33)
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Maths,Hindi,English.");
	        else
	          System.out.println("\t\t\t\tFail in ,Maths,Hindi.");
	      else
	      {
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Maths,English.");
	        else
	          System.out.println("\t\t\t\tFail in Maths.");
	      }
	    else
	    {
	      if(h<33)
	        if(e<33)
	          System.out.println("\t\t\t\tFail in Hindi,English.");
	        else
	          System.out.println("\t\t\t\tFail in Hindi.");
	      else
	      {
	        if(e<33)
	          System.out.println("\t\t\t\tFail in English.");
	        else
	        {
	          System.out.println("\t\t\t\tPASS In All Subjects.");
	          x=1;
	        }      
	      }
	    }
	  }	
       } 
      System.out.println("\t Status               -->");
      if(x==1)
      {
        System.out.print("\t\t\t\tPASS");
        System.out.println("\n\t Division             -->");
       if(per>=60)
      {
        System.out.println("\t\t\t\tFirst Division");
      }
      else if(per>=45)
      {
        System.out.println("\t\t\t\tSecond Division");
      }
      else if(per>=33)
      {
        System.out.println("\t\t\t\tThird Division");
      }
      }
      else
        System.out.print("\t\t\t\tFAIL"); 
    
     i++;
     sc.nextLine(); 
    }
  }
}
