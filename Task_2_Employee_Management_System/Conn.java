package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // ✅ Replace DB_NAME with your actual database name
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem", "root", "Shrishti@401209");

            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}