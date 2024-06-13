package com.example;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {
        try (Connection conexion = ConexionBD.obtenerConexion()) {
            // Insertar un nuevo registro
            // CRUD.insertarRegistro(conexion, "Daniel", 25);

            // Obtener todos los registros
            // CRUD.obtenerRegistros(conexion);

            // Actualizar un registro
            // CRUD.actualizarRegistro(conexion, "Sair", 30);

            // Eliminar un registro
            // CRUD.eliminarRegistro(conexion, "Sair");

            // Obtener todos los registros después de eliminar uno
            // CRUD.obtenerRegistros(conexion);

        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }
}











// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

// public class Main {
//     public static void main(String[] args) {
//         // Datos de conexión
//         String url = "jdbc:mysql://localhost:3306/dbJava";
//         String usuario = "root";
//         String contraseña = "";

//         // Intentar establecer la conexión
//         try {
//             // Cargar el controlador MySQL JDBC
//             Class.forName("com.mysql.cj.jdbc.Driver");

//             // Establecer la conexión
//             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

//             // Si la conexión se establece con éxito, imprimir un mensaje
//             if (conexion != null) {
//                 System.out.println("¡Conexión exitosa!");
//             } else {
//                 System.out.println("Fallo al conectar.");
//             }

//             // Cerrar la conexión
//             conexion.close();

//         } catch (SQLException e) {
//             System.out.println("Error de SQL: " + e.getMessage());
//         } catch (ClassNotFoundException e) {
//             System.out.println("Clase no encontrada: " + e.getMessage());
//         }
//     }
// }
