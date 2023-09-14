import java.sql.*;

/**
 *
 * @author admin
 */
public class Practice1 {
    public static void main(String[] args) {
        try{
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo","root","root");
               Statement st=con.createStatement();
               String sql="select*from desk";
               ResultSet rs=st.executeQuery(sql);
               System.out.println("--*--*----*--*----*--*----*--*----*--*--");
         
               System.out.println("Name\tRollNo \tAge\tMarks\tCity");
               System.out.println("--*--*----*--*----*--*----*--*----*--*--");
               while(rs.next())
                       {
                           System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
                       }
        }
        catch(Exception e){
               System.out.println("Exception="+e);
        }
               System.out.println("--*--*----*--*----*--*----*--*----*--*--");
        
    }
    
}
