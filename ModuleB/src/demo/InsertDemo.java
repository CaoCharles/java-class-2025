package demo;

import static demo.ConnectionInfo.PASSWORD;
import static demo.ConnectionInfo.URL;
import static demo.ConnectionInfo.USERNAME;

import java.sql.*;
import java.util.Date;

public class InsertDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = con.createStatement();
            // String query = "INSERT INTO Emp VALUES (567, 'Cao', 'Charles','2025-12-02', 999999, 'AI')";
            String query = "INSERT INTO Emp VALUES (?, ?, ?, ?, ?, ?)";

            try(PreparedStatement pstmt = con.prepareStatement(query)){
                pstmt.setInt(1, 23);
                pstmt.setString(2, "Cao");
                pstmt.setString(3, "Cao");
                pstmt.setDate(4, java.sql.Date.valueOf("2025-12-03"));
                pstmt.setDouble(5, 888888);
                pstmt.setString(6, "IT");

                pstmt.executeUpdate();
                System.out.println("Insert success!");
            } catch (SQLException e) {e.printStackTrace();};


            if (stmt.executeUpdate(query) > 0) {
                System.out.println("A new Employee record is added");
            }

            String query1 = "select * from Emp";
            ResultSet rs = stmt.executeQuery(query1);

            while (rs.next()) {
                int empID = rs.getInt("ID");
                String first = rs.getString("FirstName");
                String last = rs.getString("LastName");
                Date birthDate = rs.getDate("BirthDate");
                float salary = rs.getFloat("Salary");
                String dept = rs.getString("Dept");

                System.out.println("Employee ID:   " + empID + "\n" +
                        "Employee Name: " + first + " " + last + "\n" +
                        "Birth Date:    " + birthDate + "\n" +
                        "Salary:        " + salary + "\n" +
                        "Dept:          " + dept + "\n");
            }
        }
        catch (SQLException ex) {
            System.out.println("SQLState:  " + ex.getSQLState());
            System.out.println("Error Code:" + ex.getErrorCode());
            System.out.println("Message:   " + ex.getMessage());
        }
    }
    
}
