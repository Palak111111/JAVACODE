
import java.sql.*;
public class UpdateDemo {
    public static void main(String[] args){ 
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/javainfo","root","root");
        PreparedStatement ps=con.prepareStatement("update Desk set Name where RollNo=1");
        ps.executeUpdate("Palak");
        
    }
     catch(Exception e){
         System.out.println(e);
     }
 }
    
}
