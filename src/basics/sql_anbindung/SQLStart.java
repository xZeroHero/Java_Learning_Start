package basics.sql_anbindung;

import java.sql.*;

public class SQLStart {

    public static void main(String[] args) {

        String server = "localhost";
        String port = "3306";
        String user = "root";
        String password = "";
        String database = "db_movie";
        //String url = "jdbc:mariadb://" + server + ":" + port + "/" + database;
        //System.out.println(DriverManager.getConnection(url, user, password));

/*        try(Connection con = DriverManager.getConnection(url, user, password)) {

        } catch (SQLException e){
            e.printStackTrace();
        }*/

        try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db_movie", user, password)) {
            String sql;
            Statement statement = con.createStatement();

            sql = "SELECT * FROM movie WHERE year=1999";
            ResultSet resultSet = statement.executeQuery(sql);




/*            while (resultSet.next()) {
                System.out.printf("%-45s | %.2f | %d | %d\n",
                        resultSet.getString("title"),
                        resultSet.getDouble("score"),
                        resultSet.getInt("year"),
                        resultSet.getInt("votes")
                );

                // Resultset Metadaten

                ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                for (int i = 1; i < resultSetMetaData.getColumnCount(); i++){
                    System.out.print(resultSetMetaData.getColumnName(i) + " | ");
                    System.out.print(resultSetMetaData.getColumnTypeName(i) + " | ");
                    System.out.print(resultSetMetaData.getPrecision(i) + " /|\\ ");
                }
                System.out.println();


            }*/


        } catch (SQLException e) {
            e.printStackTrace();
        }

/*        try {
            Connection con = DriverManager.getConnection(url, user, password);

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

    }

}
