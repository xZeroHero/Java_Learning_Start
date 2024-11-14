package basics.sql_anbindung.or_mapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {

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


            List<Movie> movieList = new ArrayList<>();


            while (resultSet.next()) {

                String title = resultSet.getString("title");
                double score = resultSet.getDouble("score");
                movieList.add(new Movie(title, score));

            }

            for (Movie movie : movieList) System.out.println(movie);


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
