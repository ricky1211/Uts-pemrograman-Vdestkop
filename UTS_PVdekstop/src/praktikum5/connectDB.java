/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricky
 */
public class connectDB {
    
    public static Connection conn;
    
    public static Connection getConnection() {               
        try {                                    
            String url = "jdbc:mysql://localhost:3306/pv_biodata";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url, username, password);
            
            JOptionPane.showMessageDialog(null, "Database connection successfully...");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn;
    }
    
}
