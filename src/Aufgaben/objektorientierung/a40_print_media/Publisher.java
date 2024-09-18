package aufgaben.objektorientierung.a40_print_media;



public class Publisher {

    private String name;
    private Address adress;




    public Publisher(String name, Address adress) {
        setName(name);
        setAdress(adress);
    }

    @Override
    public String toString() {
        return String.format("Publisher: \n\t%s\n%s", getName(), getAdress());
    }

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
