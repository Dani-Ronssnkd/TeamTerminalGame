package database;

import java.sql.*;

public class ConnectDB {

    private Connection connection;

    public ConnectDB(){
        String url = "jdbc:sqlite:game.db";
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Error al conectarse con la base de datos\n");
            e.printStackTrace();
        }
    }

     public void closeConnection(){
        try {
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión\n");
            e.printStackTrace();
        }
     }
    public Connection getConnection() {
        return connection;
    }
}
