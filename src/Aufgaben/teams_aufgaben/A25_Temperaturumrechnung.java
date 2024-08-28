package aufgaben.teams_aufgaben;

public class A25_Temperaturumrechnung {

    public static void main(String[] args) {

        System.out.println(fahrenheitCelsius(50));

    }

    static double fahrenheitCelsius(double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
    }

}
