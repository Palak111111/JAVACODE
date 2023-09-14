import java.sql.*;
import java.util.Scanner;
public class PositionalPara{
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
//             System.out.println("Enter Name");
//            String N=sc.next();
//            System.out.println("Enter RollNO");
//            int R=sc.nextInt();
            System.out.println("Enter Age");
            int A=sc.nextInt();
//             System.out.println("Enter Marks");
//            int M=sc.nextInt();
//             System.out.println("Enter City");
//            String C=sc.next();
        Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Driver Loaded");

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javainfo","root","root");
        PreparedStatement ps=con.prepareStatement("select * from Desk where Age>= ? ");
         ps.setInt(1, A);
        ResultSet rs=ps.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("\t"+rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t"+rsmd.getColumnName(3)+"\t"+rsmd.getColumnName(4)+"\t"+rsmd.getColumnName(5)+"\t"+rsmd.getColumnName(6));
            System.out.println("-----------------------------------------------------------------------------");
            while(rs.next())
         {
             System.out.println("\t"+rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
         }
           
            int i=ps.executeUpdate();
            if(i>0)
            {
                System.out.println("Successfully");
            }
            else
            System.out.println("Some Error ");
                        
        con.close();
        }
        catch(Exception ex)
        {
            System.out.println(""+ex);
        }
  }
}
