package basics.sql_anbindung.einfache_sql_anwendung;

import java.sql.*;
import java.util.Scanner;

public class SQL_Injection {

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
            Statement statement = con.createStatement();

            sql = "SELECT * FROM benutzer WHERE `name` = '" + name +"' AND kennwort= '" + kennwort + "';" ;
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println(sql);

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
