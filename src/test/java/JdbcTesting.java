import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTesting {

    public static void main(String[] args) {
        // Replace with your actual credentials
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";             // your MySQL username
        String password = "admin";    // your MySQL password

        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println(" Connected to MySQL database!");

            // Step 3: Create Statement
            Statement statement = connection.createStatement();

            // Step 4: Execute Query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student\r\n"
            		+ "ORDER BY SNO ASC;");

            // Step 5: Process Result
            System.out.println("SNO\tSNAME\tMARKS");
            System.out.println("-------------------------");

            while (resultSet.next()) {
                int sno = resultSet.getInt("SNO");
                String sname = resultSet.getString("SNAME");
                int marks = resultSet.getInt("MARKS");

                System.out.println(sno + "\t" + sname + "\t" + marks);
            }

            // Step 6: Close Connections
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
