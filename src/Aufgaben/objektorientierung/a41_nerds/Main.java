package aufgaben.objektorientierung.a41_nerds;

public class Main {

    public static void main(String[] args) {

        Article[] articles = new Article[6];

        articles[0] = new Mug("Informatiker Tasse", 14.90, 330.0);
        articles[1] = new Shirt("Debugging T-Shirt", 19.95, "XL");
        articles[2] = new Watch("Binäre Armbanduhr", 21.95, "CR2032 Knopfzelle");
        articles[3] = new Mug("Purpur Tentakel Becher", 9.95, 300.0 );
        articles[4] = new Shirt("BaZnGa T-Shirt", 20.95, "M");
        articles[5] = new Doormat("Fußmatte \"It's bigger on the Inside\"", 24.95, "Kokosfasern" );

//        System.out.println(articles[4].toStringPriceOnly());

        KonsolenAusgabe.ausgabe(articles);

        System.out.println("\n================\n");

        KonsolenAusgabe.ausgabeFull(articles);

        //Max Numbers: Hours: 1100 | Minutes: 111011
        System.out.println(Watch.binaryTime("1100", "111011", "am"));





    }

}
