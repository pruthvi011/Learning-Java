package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrintAllRecords {

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
                "SELECT * FROM person"
            );

            // Step 4: Execute query
            ResultSet rs = pst.executeQuery();

            // Step 5: Print table data
            System.out.println("ID   NAME    AGE");
            System.out.println("------------------");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "   " +
                    rs.getString("name") + "   " +
                    rs.getInt("age")
                );
            }

            // Step 6: Close resources
            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
