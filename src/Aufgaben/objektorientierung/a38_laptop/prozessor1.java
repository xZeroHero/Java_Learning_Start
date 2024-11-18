package aufgaben.objektorientierung.a38_laptop;

public class prozessor1 {

    private String serie;
    private int cores;
    private int clockSpeed;


    public prozessor1(String serie, int cores, int clockSpeed) {
        this.serie = serie;
        setCores(cores);
        setClockSpeed(clockSpeed);


    }


    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
}
