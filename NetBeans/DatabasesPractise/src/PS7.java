import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PS7 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo", "root", "root");
            Statement st=con.createStatement();
            //String sql ="select min(Marks) from desk";
            //String sql ="select min(Age) from desk";
           // String sql ="select max(Age) from desk";
          //  String sql ="select max(Marks) from desk";
           //String sql ="select avg(Marks) from desk";
          // String sql ="select sum(Marks) from desk";
           String sql ="select * from desk where Age=(select min(Age) from desk)";
            ResultSet rs=st.executeQuery(sql);
            ResultSetMetaData rsmd=rs.getMetaData();
            //System.out.println(""+rsmd.getColumnCount());
            System.out.println("-------------------------------------------------------------");
            System.out.println(""+rsmd.getColumnName(1));
            
            while(rs.next())
        {
            System.out.println(rs.getString(1));
        }
        }
        
            
        catch (Exception ex) {
            Logger.getLogger(ResultSetMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
