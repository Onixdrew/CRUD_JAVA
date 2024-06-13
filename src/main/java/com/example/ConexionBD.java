package com.example;

import java.sql.Connection;
import java.sql.DriverManager; // administrar los controladores de JDBC
import java.sql.SQLException; //maneja las excepciones relacionadas con la interacción de bases de datos.

public class ConexionBD {

    public static Connection obtenerConexion() {
        String url = "jdbc:mysql://localhost:3306/dbJava";
        String usuario = "root";
        String contraseña = "";

        try {
            System.out.println("conexión exitosa " );
            return DriverManager.getConnection(url, usuario, contraseña);
            // Intenta establecer una conexión a la base de datos utilizando el método 
            // getConnection() de la clase DriverManager. Este método toma la URL de conexión,
            // el nombre de usuario y la contraseña como argumentos y devuelve un objeto Connection.


        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión: " + e.getMessage());
            return null; 
        }
    }
}
