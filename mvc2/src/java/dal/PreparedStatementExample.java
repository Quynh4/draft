/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class PreparedStatementExample {
//    private static String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=testdb";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123";
     
    public static void main(String[] args) {
        String sqlInsert = "INSERT INTO student VALUES(?, ?, ?)";
        String selectAll = "SELECT * FROM student";
        try {
            // connect to database
            Connection conn = DriverManager.getConnection(DB_URL, 
                    USER_NAME, PASSWORD);
             
            // crate statement to insert student
            PreparedStatement stmt = conn.prepareStatement(sqlInsert);
            stmt.setInt(1,5);
            stmt.setString(2, "Tuan Anh");
            stmt.setString(3, "Hanoi");
//            System.out.println("Execute: " + stmt.execute());
//            System.out.println("Execute update: " + stmt.executeUpdate());
             
            // select all student
            stmt = conn.prepareStatement(selectAll);
//            // get data from table 'student'
            ResultSet rs = stmt.executeQuery();
//            System.out.println("Execute query: " + rs);
            // show data
            while (rs.next()) {
                if(rs.getString("name").equals("Tuan Anh"))
                System.out.println(rs.getString(2));
            }
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    
}