package aufgaben.objektorientierung.a41_nerds;

public class KonsolenAusgabe {

    public static void ausgabe(Article[] articles){
        double total = 0.0;
        for (Article article : articles){
            System.out.println(article.toStringPriceOnly());
            total += article.getPrice();
        }
        System.out.println(String.format("%49s %4.2f Euro", "Gesamtpreis:", total ));
    }


    public static void ausgabeFull(Article[] articles){
        for (Article article : articles){
            System.out.println(article);
            System.out.println("\n============================\n");
        }

    }





}
