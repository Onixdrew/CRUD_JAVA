package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement; //se utiliza para ejecutar consultas parametrizadas.
import java.sql.ResultSet; // proporciona métodos para manejar los resultados de las consultas SQL.
import java.sql.SQLException;

public class CRUD {

    // Método para insertar un nuevo registro en la base de datos
    public static void insertarRegistro(Connection conexion, String nombre, int edad) throws SQLException {
        String query = "INSERT INTO personas (nombre, edad) VALUES (?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, nombre);
            statement.setInt(2, edad);
            statement.executeUpdate();
            System.out.println("Registro insertado con éxito.");
        }
    }

    // Método para obtener todos los registros de la base de datos
    public static void obtenerRegistros(Connection conexion) throws SQLException {
        String query = "SELECT * FROM personas";
        try (PreparedStatement statement = conexion.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
        }
    }

    // Método para actualizar un registro en la base de datos
    public static void actualizarRegistro(Connection conexion, String nombre, int nuevaEdad) throws SQLException {
        String query = "UPDATE personas SET edad = ? WHERE nombre = ?";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setInt(1, nuevaEdad);
            statement.setString(2, nombre);
            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Registro actualizado con éxito.");
            } else {
                System.out.println("No se encontró ningún registro con el nombre especificado.");
            }
        }
    }

    // Método para eliminar un registro de la base de datos
    public static void eliminarRegistro(Connection conexion, String nombre) throws SQLException {
        String query = "DELETE FROM personas WHERE nombre = ?";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, nombre);
            int filasEliminadas = statement.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Registro eliminado con éxito.");
            } else {
                System.out.println("No se encontró ningún registro con el nombre especificado.");
            }
        }
    }
}
