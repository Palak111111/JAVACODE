import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class P2 {

    public static void main(String[] args) {
        try {
            String N = "janvi";
            String R = "4";
            String A = "34";
            String M = "24";
            String C = "Raipur";

            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Replace with your actual database connection details
            String url = "jdbc:mysql://your_database_url:3306/javainfo";
            String username = "root";
            String password = "root";

            // Establish a database connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare an SQL insert statement with placeholders for values
            String sql = "INSERT INTO Desk (Name, RollNo, Age, Marks,city) VALUES (?, ?, ?, ?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, N);
            ps.setString(2, R);
            ps.setString(3, A);
            ps.setString(4, M);
            ps.setString(5, C);

            // Execute the SQL insert statement
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Value Inserted");
            } else {
                System.out.println("Value Not Inserted");
            }

            // Close the database connection
            con.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
