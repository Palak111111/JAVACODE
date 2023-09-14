package pojo;
import java.awt.*;
import java.io.Serializable;
public class MarksheetPOJO implements Serializable
{
//	  marsheet[i]=new MarksheetPOJO(Name,Roll,Fname,Mname,Course,Branch,Year,Sem,phy,chem,math,hindi,english);
		private int Roll;
		private String Branch,MName, FName, Name, Course, Gmail, Password;
		private int Sem;
		private int Year, p , c , m , h , e ,n, total;
		private double per;
                public MarksheetPOJO(String Name, int Roll, String Fname, String Mname, String Course, String Branch, int Yaer, int Sem, int p, int c, int m, int h, int e)
                {
                    this.Name=Name;
                    this.Roll=Roll;
                    this.FName=Fname;
                    this.MName=Mname;
                    this.Course=Course;
                    this.Branch= Branch;
                    this.Year=Yaer;
                    this.Sem=Sem;
                    this.p=p;
                    this.c=c;
                    this.m=m;
                    this.h=h;
                    this.e=e;
                    System.out.println("Data will be set");
                    
                }
		public void setGmail(String Gmail){
			this.Gmail=Gmail;
		}
		public void setPassword(String Password){
			this.Password=Password;
		}
		public void setName(String Name){
			this.Name=Name;
		}
		public void setCourse(String Course){
			this.Course=Course;
		}
		public void setBranch(String Branch){
			this.Branch=Branch;
		}
		public void setMName(String MName){
			this.MName=MName;
		}
		public void setFName(String FName){
			this.FName=FName;	
		}
		public void setYear(int Year){
			this.Year=Year;	
		}
		public void setSem(int Sem){
			this.Sem=Sem;
		}public void setPhysics(int p){
			this.p=p;
		}public void setChemistry(int c){
			this.c=c;
		}
		public void setMaths(int m)	{
			this.m=m;
		}
		public void setHindi(int h){
			this.h=h;
		}
		public void setEnglish(int e){
			this.e=e;
		}
		public void setTotal(int total)	{
			this.total=total;
		}
		public void setPer(double per)	{
			this.per=per;
		}
		public void setRoll(int Roll){
			this.Roll=Roll;
		}
		public String getGmail()	{
			return Gmail;
		}
		public String getPassword(){
			return Password;
		}
		public String getName(){
			return Name;
		}
		public String getCourse(){
			 return Course;
		}
		public String getBranch(){
			return Branch;
		}
		public String getMName(){
			return MName;
		}
		public String getFName(){
			return FName;
		}
		public int getYear(){
			return Year;
		}
		public int getSem(){
			return Sem;
		}
		public int  getPhysics(){
			return p;
			
		}
		public int getChemistry(){
			return c;
			
		}
		public int getMaths(){
			return m;
			
		}
		public int getHindi(){
			return h;
			
		}
		public int getEnglish()	{
			return e;
		}
		public int getRoll(){
			return Roll;
		}
		public int getTotal(){
			return total;
		}
		public double getPer(){
			return  per;
		}
        
}
