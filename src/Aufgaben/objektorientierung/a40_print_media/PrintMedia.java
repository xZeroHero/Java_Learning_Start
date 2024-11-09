package aufgaben.objektorientierung.a40_print_media;

public abstract class PrintMedia {

    private String name;
    private Publisher publisher;
    private IdentificationNumber identificationNumber;
    private double price;
    private boolean isCalender = false;


    public PrintMedia(String name, Publisher publisher, IdentificationNumber identificationNumber, double price) {
        setName(name);
        setPublisher(publisher);
        setIdentificationNumber(identificationNumber);
        setPrice(price);
    }

    public PrintMedia(String name, Publisher publisher, double price) {
        setName(name);
        setPublisher(publisher);
        setPrice(price);
        setCalender(true);
    }

    @Override
    public String toString() {
        String output = "";
        output += String.format("%s\n",getName());
        output += String.format("%s",getPublisher());
        if (isNotCalender()) output += String.format("%s", getIdentificationNumber());
        output += String.format("Preis: %.2f €\n", getPrice());
        return output;
    }

    //Getter & Setter
    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public IdentificationNumber getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(IdentificationNumber identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNotCalender() {
        return !isCalender;
    }

    public void setCalender(boolean calender) {
        isCalender = calender;
    }
}
