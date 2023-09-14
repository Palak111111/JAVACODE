import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Five
{	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n Enter your name: ");
    	String Name =sc.nextLine();
    	System.out.print("\n Enter your Roll no.: ");
    	String Roll =sc.nextLine();
    	System.out.print("\n Enter your Father Name: ");
    	String FName =sc.nextLine();
    	System.out.print("\n Enter your Mother Name: ");
    	String MName = sc.nextLine();
    	System.out.print("\n Enter your Course: ");
    	String Course=sc.nextLine();
    	System.out.print("\n Enter your Branch: ");
    	String Branch=sc.nextLine();
    	System.out.print("\n Enter your Year: ");
    	String Year=sc.nextLine();
    	System.out.print("\n Enter your Semester: ");
    	String Sem=sc.nextLine();


		System.out.print("Enter Marks of English: ");
		int eng=sc.nextInt();
		System.out.print("Enter Marks of Hindi: ");
		int hin=sc.nextInt();
		System.out.print("Enter Marks of Maths: ");
		int mat=sc.nextInt();
		System.out.print("Enter Marks of SoScience: ");
		int sos=sc.nextInt();
		System.out.print("Enter Marks of Science: ");
		int sic=sc.nextInt();
		
		
		System.out.println("\t Roll Number   :" +Roll +  "\t\t\t\t\t\t Course :"+Course);
		System.out.println("\t Student Name  :" +Name +  "\t\t\t\t\t\t Branch :"+Branch);
		System.out.println("\t Father Name   :" +FName+  "\t\t\t\t\t\t Sem    :"+Sem);
		System.out.println("\t Mother Name   :" +MName+  "\t\t\t\t\t\t Year   :"+Year);
	   
		
		System.out.println("\t SubCode           SubName     MaxMarks   MinMarks    ObtMarks\n");
		System.out.println("\t"+Branch+"-501     English       70         21          "+eng);
		System.out.println("\t"+Branch+"-502     Hindi         70         21          "+hin);
		System.out.println("\t"+Branch+"-503     Maths         70         21          "+mat);
		System.out.println("\t"+Branch+"-502     SoScience     70         21          "+sos);
		System.out.println("\t"+Branch+"-503     Science       70         21          "+sic);

			int x=0;
			int total=eng+hin+mat+sos+sic;
			float per=(total)/5;
			System.out.println("\t Precentage : "+per);
			System.out.println("\t Total Marks: "+total);
		
		if(eng>100||hin>100||mat>100||sos>100||sic>100||eng<0||hin<0||mat<0||sos<0||sic<0)
		{	
			System.out.println("invalid data");
		}
		else if(eng<33&&hin<33&&mat<33&&sos<33&&sic<33)
		{
			System.out.println("Fail in All Subject");	
		}
		else if((eng<33&&hin<33&&mat<33&&sos<33)||(eng<33&&hin<33&&mat<33&&sic<33)||(eng<33&&hin<33&&sic<33&&sos<33)||(eng<33&&sic<33&&mat<33&&sos<33)||(hin<33&&sic<33&&mat<33&&sos<33))	
		{
			System.out.println("Fail in 4 Subject");
			if(eng<33&&hin<33&&mat<33&&sos<33)
				System.out.println("Fail in English,Hindi,Maths,SoScience,Science");
			else if(eng<33&&hin<33&&mat<33&&sic<33)
				System.out.println("Fail in English,Hindi,Maths,Science");
			else if(eng<33&&hin<33&&sic<33&&sos<33)
				System.out.println("Fail in English,Hindi,Science,SoScience");
			else if(eng<33&&sic<33&&mat<33&&sos<33)
				System.out.println("Fail in English,Science,Maths,SoScience");
			else
				System.out.println("Fail in Science,Hindi,Maths,SoScience");
		}
		else if((hin<33&&sos<33&&mat<33)||(eng<33&&hin<33&&sos<33)||(eng<33&&hin<33&&sic<33)||(mat<33&&eng<33&&sos<33)||(eng<33&&hin<33&&mat<33)||(sic<33&&mat<33&&eng<33)||(sic<33&&mat<33&&hin<33)||(sos<33&&sic<33&&mat<33)||(sos<33&&sic<33&&eng<33)||(sos<33&&sic<33&&hin<33))	
		{
			System.out.println("Fail in 3 Subject");
			if(hin<33&&sos<33&&mat<33)
				System.out.println("Fail in Hindi,Maths,SoScience");
			else if(eng<33&&hin<33&&sos<33)
				System.out.println("Fail in English,Hindi,SoScience");
			else if(eng<33&&hin<33&&sic<33)
				System.out.println("Fail in English,Hindi,Maths,Science");
			else if(mat<33&&eng<33&&sos<33)
				System.out.println("Fail in English,Maths,SoScience");
			else if(eng<33&&hin<33&&mat<33)
				System.out.println("Fail in English,Hindi,Maths");
			else if(sic<33&&mat<33&&eng<33)
				System.out.println("Fail in English,Maths,Science");
			else if(sic<33&&mat<33&&hin<33)
				System.out.println("Fail in Hindi,Maths,Science");
			else if(sos<33&&sic<33&&mat<33)
				System.out.println("Fail in Maths,SoScience,Science");
			else if(sos<33&&sic<33&&eng<33)
				System.out.println("Fail in English,SoScience,Science");
			else
				System.out.println("Fail in Hindi,SoScience,Science");
		}
		else if((eng<33&&hin<33)||(hin<33&&mat<33)||(mat<33&&sos<33)||(sic<33&&sos<33)||(eng<33&&sic<33)||(eng<33&&sos<33)||(eng<33&&mat<33)||(hin<33&&sic<33)||(mat<33&&sic<33)||(hin<33&&sos<33))	
		{
			System.out.println("Fail in 2 Subject");
			if(eng<33&&hin<33)
				System.out.println("Fail in English,Hindi");
			else if(hin<33&&mat<33)
				System.out.println("Fail in Hindi,Maths");
			else if(mat<33&&sos<33)
				System.out.println("Fail in Maths,SoScience");
			else if(sic<33&&sos<33)
				System.out.println("Fail in SoScience,Science");
			else if(eng<33&&sic<33)
				System.out.println("Fail in English,Science");
			else if(eng<33&&sos<33)
				System.out.println("Fail in English,SoScience");
			else if(eng<33&&mat<33)
				System.out.println("Fail in English,Maths");
			else if(hin<33&&sic<33)
				System.out.println("Fail in Hindi,Science");
			else if(mat<33&&sic<33)
				System.out.println("Fail in Maths,Science");
			else 
				System.out.println("Fail in Hindi,SoScience");
		}
		else if(eng<33||hin<33||mat<33||sos<33||sic<33)
		{
			System.out.println("Fail in 1 subject");
			if(eng<33)
				System.out.println("Fail in English");
			else if(hin<33)
				System.out.println("Fail in Hindi");
			else if(mat<33)
				System.out.println("Fail in Maths");
			else if(sos<33)
				System.out.println("Fail in SoScience");
			else
				System.out.println("Fail in Science");
		}	
		else
			x=1;













		if(x==1)
		{
			if(per>=60)
				System.out.println("Passed By First division ");
			else if(per>=45)
				{System.out.println("Passed By Second division ");}
			else if(per>=33)
				{	System.out.println("Passed By Third division ");	}
		}
		else
		{System.out.println("FAILED ");}
	}	
}
