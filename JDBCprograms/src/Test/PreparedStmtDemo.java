
package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStmtDemo {

    public static void main(String[] args) {

        try {
            // Step 1: Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javadb",
                "root",
                "0011"
            );

            // Step 3: Create PreparedStatement
            PreparedStatement pst = con.prepareStatement(
                "INSERT INTO person VALUES (?, ?, ?)"
            );

            pst.setInt(1, 4);          // id
            pst.setString(2, "Omkar"); // name
            pst.setInt(3, 25);         // age

            // Step 4: Execute query
            int i = pst.executeUpdate();

            // Step 5: Output
            System.out.println(i + " Record Inserted");

            // Step 6: Close resources
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
