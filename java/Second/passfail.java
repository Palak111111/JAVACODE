class PassFail
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
   if(p<33)
     {
      if(c<33)
       {
         if(m<33)
             System.out.println("FAIL IN ALL SUBJECTS");
             else
             {
                System.out.println("FAIL IN TWO SUBJECTS");
                System.out.println("FAIL IN PHY AND CHEM");
           }
           }
            else
               {
             if(m<33)
             {
                          System.out.println("FAIL IN TWO SUBJECTS");
                          System.out.println("FAIL IN phy and maths");
             }else
             {
             System.out.println("FAIL IN ONE SUBJECTS");
             System.out.println("FAIL IN PHYSICS");
             }
               }  
                }
                 else 
                   {
                     if(c<33)
                     {
                          if(m<33)
                              {
                                System.out.println("FAIL IN TWO SUBJECTS");                     
                                System.out.println("FAIL IN MATHS AND CHEMISTRY");
                                }
                             else
                               {
                                System.out.println("FAIL IN ONE SUBJECT");
                                System.out.println("FAIL IN CHEMISTRY");
                               }
                         }
                                     else
                                        {
                                          if(m<33)
                                          {
                                          System.out.println("FAIL IN one SUBJECTS");
                                          System.out.println("FAIL IN MATHS");                                      
                                           }
                                              else
                                                 {
                                                int total  = p+c+m;
                                                double per= total/3.0;
                                                System.out.println("Total Marks="+total);
                                                System.out.println("PERCENTAGE="+per);
                                                   if(per>=60)
                                                        System.out.println("PASS WITH FIRST DIVISION");
                                                      else
                                                      {
                                                        if(per>=45)
                                                             System.out.println("PASS WITH SECOND DIVISION");
                                                               else
                                                                  System.out.println("PASS WITH THIRD DIVISION");
                                                                  }
                                                                }
                                                              }  
                                                            }
                                                         }
                                                       } 
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                                        
                                           
                                           
                                           
                                           
                                           
                                           
                                                                                  
                                        
                                        
                     
                     
                     
                     
                     
                     
                     
                     
                     
                
                
             
             
             
             


                                                                                                                                                                                                                                                                                                                                                                                      
         
     
          



