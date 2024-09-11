package aufgaben.objektorientierung.a37_gartenmaschinen;

public class CollectionBag {

    private int volume;


    public CollectionBag(int volume) {
        setVolume(volume);
    }

    @Override
    public String toString(){
        return String.format("Fangsack: %dL", getVolume());
    }

    //Getter & Setter
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
