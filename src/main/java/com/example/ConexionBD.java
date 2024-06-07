package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection obtenerConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/dbJava";
        String usuario = "root";
        String contraseña = "";

        return DriverManager.getConnection(url, usuario, contraseña);
    }
}
