/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmg.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 

/**
 *
 * @author b
 */
public class DBConnector {

    static Connection conn = null;

    public static Connection getConnection()   {

        if (conn == null) {
            try {

                String url = "jdbc:mysql://localhost:3306/dms";
                String username = "root";
                String pass = "123456";

                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, username, pass);
                System.out.println("connection successful");
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }

        return conn;

    }

}
