package demo;

import java.sql.*;
import java.util.logging.Logger;

import com.mysql.cj.xdevapi.Table;

import static demo.ConnectionInfo.PASSWORD;
import static demo.ConnectionInfo.URL;
import static demo.ConnectionInfo.USERNAME;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class SelectDemo {
    private static final Logger logger =
            Logger.getLogger(SelectDemo.class.getName());

    public static void main(String[] args) {
        String query = "SELECT ID, FirstName, LastName FROM Emp";
        
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                int empID = rs.getInt(1);
                String first = rs.getString(2);
                String last = rs.getString(3);
                Date birthDate = java.sql.Date.valueOf("2025-12-02");;
                float salary = 10000;
                String dept = "AI";
//                Date birthDate = rs.getDate("BirthDate");
//                float salary = rs.getFloat("Salary");
//                String dept = rs.getString("Dept");
                
                System.out.println("Employee ID:   " + empID + "\n" +
                                   "Employee Name: " + first + " " + last + "\n" +
                                   "Birth Date:    " + birthDate + "\n" +
                                   "Salary:        " + salary + "\n" +
                                   "Dept:          " + dept + "\n");
            }
        }
        catch (SQLException e) {
            logger.severe("SQL Exception occurred: " + e.getMessage());
            logger.severe("Error Code: " + e.getErrorCode());
            logger.severe("SQL State: " + e.getSQLState());
            System.out.println(e.getMessage());
            System.out.println(e.getErrorCode());
            System.out.println(e.getSQLState());
            System.out.println("SQL Exception: " + e);
        }
    }
    
}
