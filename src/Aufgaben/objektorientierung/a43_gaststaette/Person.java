package aufgaben.objektorientierung.gaststaette;

public class Person {

    private String name;

    public Person(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return String.format("Name: %s", getName());
    }

    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
