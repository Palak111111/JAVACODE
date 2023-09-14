/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbghost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

import java.sql.*;
import java.util.Scanner;
public class ScannerPS{
    
    //private static String jdbc;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try
        {
//        String N="Muskan";
//        String R="5";
//        String A="32";
//        String M="73";
//        String C = "Ujjain";
//        
            System.out.println("Enter Name");
            String N=sc.next();
            System.out.println("Enter RollNO");
            int R=sc.nextInt();
            System.out.println("Enter Age");
            int A=sc.nextInt();
             System.out.println("Enter Marks");
            int M=sc.nextInt();
            System.out.println("Enter FEES");
            int F=sc.nextInt();
             System.out.println("Enter City");
            String C=sc.next();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo","root", "root");
        PreparedStatement ps=con.prepareStatement("insert into Desk values(?,?,?,?,?,?)");
        ps.setString(1,N);
        ps.setInt(2,R);
        ps.setInt(3,A);
        ps.setInt(4,M);
         ps.setString(5,C);
           ps.setInt(6,F);
        
        int i=ps.executeUpdate();
        if(i>0)
            System.out.println("Value Inserted");
        else
            System.out.println("Value Not Inserted");
        con.close();
        }
        
        catch(Exception e)
        {
            System.out.println("Exception : "+e.getMessage());
        }
        
        finally
        {
            
        }
    }
    
}
