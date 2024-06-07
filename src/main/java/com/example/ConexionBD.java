package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static Connection obtenerConexion() {
        String url = "jdbc:mysql://localhost:3306/dbJava";
        String usuario = "root";
        String contraseña = "";

        try {
            System.out.println("conexión exitosa " );
            return DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión: " + e.getMessage());
            return null; // Retornar null en caso de error
        }
    }
}
