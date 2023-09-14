/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbghost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

import java.sql.*;
public class P1 {
    
    //private static String jdbc;
    public static void main(String[] args){
        try
        {
        String N="Muskan";
        String R="5";
        String A="32";
        String M="73";
        String C = "Ujjain";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo","root", "root");
        PreparedStatement ps=con.prepareStatement("insert into Desk values(?,?,?,?,?)");
        ps.setString(1,N);
        ps.setString(2,R);
        ps.setString(3,A);
        ps.setString(4,M);
         ps.setString(5,C);
        
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
