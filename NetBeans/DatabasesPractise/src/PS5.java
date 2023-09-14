/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.sql.*;
public class PS5 {
    public static void main(String[] args) {
        try{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo","root","root");
        String sql="update desk set RollNo=6 where Name='palak'";
        PreparedStatement ps=con.prepareStatement(sql);
        int i =  ps.executeUpdate(sql);
        if(i>0)
        {
            //System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
            System.out.println("TABLE UPDATED ....via Query1");
        }
        
            else
            {
                System.out.println(" TABLE NOT UPDATED...");
            }
        String sql1="update desk set Name='Palak' where RollNo=6";
        PreparedStatement ps1=con.prepareStatement(sql1);
        int j =  ps.executeUpdate(sql1);
        if(j>0)
        {
            //System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
            System.out.println("TABLE UPDATED ....via Query2");
        }
        else 
        {
            System.out.println("Table not updated...via Query 2");
        }
        
        String sql2="update desk set City='Indore' where RollNo=2";
        PreparedStatement ps2=con.prepareStatement(sql2);
        int k =  ps.executeUpdate(sql2);
        if(k>0)
        {
            //System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
            System.out.println("TABLE UPDATED ....via Query3");
        }
        else 
        {
            System.out.println("Table not updated...via Query 3");
        }
        }
        catch(Exception ex)
        {
        }
    }
    
}
