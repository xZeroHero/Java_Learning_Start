package basics.sql_anbindung.einfache_sql_anwendung;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatements {

    public static void main(String[] args) {

        String name;
        String kennwort;

        // Passwort = 'OR''=' um alle Einträge durch das Passwort anzeigen zu lassen.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Benutzername: ");
        name = scanner.nextLine();
        System.out.print("Passwort: ");
        kennwort = scanner.nextLine();




        try(Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db_movie", "root", "")) {
            String sql;


            sql = "SELECT * FROM benutzer WHERE `name` = ? AND kennwort= ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, kennwort);



            ResultSet resultSet = statement.executeQuery();

            System.out.println(resultSet.getStatement().toString());

            if (resultSet.next()){
                System.out.println("Willkommen!");
            }
            else System.out.println("Unbekannter Benutzer!");


            while (resultSet.next()){
                System.out.printf("%s | %s",
                        resultSet.getString("name"),
                        resultSet.getString("kennwort")
                        );
            }

        } catch (SQLException e){
            e.getStackTrace();
        }

    }

}
