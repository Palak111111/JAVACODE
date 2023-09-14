import java.sql.*;

public class Mumscan
{
    public static void main(String[] args) {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo", "root", "root");
        Statement st = c.createStatement();
        st.executeUpdate("insert into Desk values('Mum','2','39','99')");
    
       }
       catch(Exception e)
       {
           System.out.println("Exception : "+e);
       }
    }
}