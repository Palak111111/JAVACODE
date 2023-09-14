
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class PS4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo", "root", "root");
            String sql ="update desk set Marks=89 where Name= 'Tanvi'";
            PreparedStatement ps=con.prepareStatement(sql);
           
           int i =  ps.executeUpdate(sql);
            if(i>0)
        {
            //System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
            System.out.println("DATA UPDATED ....via Query1");
        }
            else
            {
                System.out.println("NOT UPDATED...");
            }
            
            
             String sql2 ="update desk set Name='Tanu' where RollNo= 1";
             PreparedStatement ps1=con.prepareStatement(sql2);
           int j =  ps.executeUpdate(sql2);
            if(j>0)
        {
            //System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
            System.out.println("DATA UPDATED ....via Query2");
        }
            else
            {
                System.out.println("NOT UPDATED...");
            }//ResultSetMetaData rsmd2=rs.getMetaData();
           // System.out.println(""+rsmd.getColumnCount());
            //System.out.println(""+rsmd1.getColumnName(1)+"\t"+rsmd1.getColumnName(2)+"\t"+rsmd1.getColumnName(3)+"\t"+rsmd1.getColumnName(4)+"\t"+rsmd1.getColumnName(5));
             System.out.println("Marks Updated");
               
        }
        
            
        catch (Exception ex) {
         //   Logger.getLogger(ResultSetMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
