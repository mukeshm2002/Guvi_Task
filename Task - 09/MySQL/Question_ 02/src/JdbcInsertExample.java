import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsertExample {
    public static void main(String[] args) {
        // Step 1: Database connection details
        String url = "jdbc:mysql://localhost:3306/employee_data";
        String user = "root";
        String password = "Tamilini@24";

        // Step 2: SQL query to insert data
        String insertQuery = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";


        // Step 3: Employee data to insert
        Object[][] employees = {
                {101, "Jenny", 25, 10000.00},
                {102, "Jacky", 30, 20000.00},
                {103, "Joe", 20, 40000.00},
                {104, "John", 40, 80000.00},
                {105, "Shameer", 25, 90000.00}
        };

        // Step 4: JDBC Connection and Data Insertion
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

            // Loop through employee data and insert each record
            for (Object[] emp : employees) {
                pstmt.setInt(1, (int) emp[0]);
                pstmt.setString(2, (String) emp[1]);
                pstmt.setInt(3, (int) emp[2]);
                pstmt.setDouble(4, (double) emp[3]);
                pstmt.executeUpdate();
            }

            System.out.println("Data inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
