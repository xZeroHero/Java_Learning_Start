package aufgaben.objektorientierung.a41_nerds;

public class Article {

    private String articleName;
    private double price;


    public Article(String articleName, double price) {
        setArticleName(articleName);
        setPrice(price);
    }


    public String toStringPriceOnly() {
        return String.format("%-50s%4.2f Euro", getArticleName(), getPrice());
    }

    @Override
    public String toString() {
        return String.format("%s\n%.2f", getArticleName(), getPrice());
    }

    //Getter & Setter
    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
