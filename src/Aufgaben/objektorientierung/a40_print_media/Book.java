package aufgaben.objektorientierung.a40_print_media;

public class Book extends PrintMedia {

    private String author;


    public Book(String name,Publisher publisher, IdentificationNumber identificationNumber, double price, String author) {
        super(name, publisher, identificationNumber, price);
        setAuthor(author);
    }


    public String toString() {
        String output = String.format("%s", super.toString());
        output += String.format("Author: %s", getAuthor());
        return output;
    }


    //Getter & Setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
