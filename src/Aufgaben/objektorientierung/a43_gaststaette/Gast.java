package aufgaben.objektorientierung.a43_gaststaette;

public class Gast extends Person{

    private Speise lieblingsspeise;

    public Gast(String name, Speise lieblingsspeise) {
        super(name);
        setLieblingsspeise(lieblingsspeise);
    }
    public Gast(String name) {
        super(name);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(String.format("%-30s", super.toString()));
        if (getLieblingsspeise() != null){
            output.append(String.format("Lieblingsessen: %s",getLieblingsspeise().getBezeichnung()));
        }
        return output.toString();
    }

    //Getter & Setter

    public Speise getLieblingsspeise() {
        return lieblingsspeise;
    }

    public void setLieblingsspeise(Speise lieblingsspeise) {
        this.lieblingsspeise = lieblingsspeise;
    }
}
