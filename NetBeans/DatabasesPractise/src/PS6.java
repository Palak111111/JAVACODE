/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PS6 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo", "root", "root");
            Statement st=con.createStatement();
           // String sql ="select * from desk where Name LIKE '%i'";
           //String sql ="select * from desk where Name LIKE '%a%'";
          // String sql ="select * from desk where Name LIKE 'm%'";
           // String sql ="select * from desk where Name LIKE '_a%'";
            // String sql ="select * from desk where Name LIKE '__n%'";
            String sql ="select * from desk where Name LIKE 'p%k'";
            ResultSet rs=st.executeQuery(sql);
            ResultSetMetaData rsmd=rs.getMetaData();
            //System.out.println(""+rsmd.getColumnCount());
            System.out.println("-------------------------------------------------------------");
            System.out.println(""+rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t"+rsmd.getColumnName(3)+"\t"+rsmd.getColumnName(4)+"\t"+rsmd.getColumnName(5));
            
            while(rs.next())
        {
            System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
        }
        }
        
            
        catch (Exception ex) {
            Logger.getLogger(ResultSetMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
