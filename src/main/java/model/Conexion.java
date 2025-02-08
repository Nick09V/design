/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Richard
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String url = "jdbc:mysql://localhost:3306/condominios";
    private static String user = "root";
    private static String password = "P@ssw0rd";
    private static Connection myConn = null;

    public static Connection getInstance() {
        if (myConn == null) {
            try {
                myConn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Existio un error al conectar a la base de datos" + e.getMessage());
            }
        }
        return myConn;
    }
}
