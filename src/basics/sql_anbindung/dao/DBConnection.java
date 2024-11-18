package basics.sql_anbindung.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DBConnection
 *
 * @author Thomas Freese
 * @version 15.11.2024
 */
public class DBConnection {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost:3306/db_movie";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    private DBConnection() {

    }

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD);
        }
        return connection;
    }

    public static void close() throws SQLException {
        if(connection != null) {
            connection.close();
        }
    }

}
