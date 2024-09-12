package aufgaben.objektorientierung.a38_laptop;

public class Resolution {

    private int pixelX;
    private int pixelY;

    public Resolution(int pixelX, int pixelY) {
        setPixelX(pixelX);
        setPixelY(pixelY);
    }

    @Override
    public String toString(){
        return String.format("Resolution: %dx%d pixel",getPixelX(), getPixelY());
    }


    //Getter & Setter
    public int getPixelX() {
        return pixelX;
    }

    public void setPixelX(int pixelX) {
        this.pixelX = pixelX;
    }

    public int getPixelY() {
        return pixelY;
    }

    public void setPixelY(int pixelY) {
        this.pixelY = pixelY;
    }
}
