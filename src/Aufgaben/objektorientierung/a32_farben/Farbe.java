package aufgaben.objektorientierung.a32_farben;

public class Farbe {

    private int red;
    private int green;
    private int blue;




    public boolean isGray() {
        return red == green && red == blue;
    }

    //Aufgabe-Getter

    public String getHexString(){
//        String hex = "#";
//        hex += Integer.toHexString(getRed());
//        hex += Integer.toHexString(getGreen());
//        hex += Integer.toHexString(getBlue());
        return String.format("#%02x%02x%02x", red, blue, green);
    }


    //Aufgabe-Setter

    public void setGrayProzent(int percent){
        int value = (int) (((double) percent / 100) * 255);
        setFarbe(value, value, value);
    }

    public void setFarbeProzent(int redPercent, int greenPercent, int bluePercent) {
        int red = (int) (((double) redPercent / 100) * 255);
        int green = (int) (((double) greenPercent / 100) * 255);
        int blue = (int) (((double) bluePercent / 100) * 255);
        setFarbe(red, green, blue);

    }

    public boolean setFarbe(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);

        return setRed(red) && setGreen(green) && setBlue(blue);
    }


    //Standard-Setter
    public boolean setRed(int red) {
        if (red <= 255 && red >= 0) {
            this.red = red;
            return true;
        }
        else return false;

    }

    public boolean setGreen(int green) {
        if (green <= 255 && green >= 0) {
            this.green = green;
            return true;
        }
        else return false;
    }

    public boolean setBlue(int blue) {

        if (blue <= 255 && blue >= 0) {
            this.blue = blue;
            return true;
        }
        else return false;
    }


    //Getter


    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    // Getter 8-bit

    public String getRedBit(){

        return Integer.toBinaryString(red);
    }

    public String getGreenBit(){

        return Integer.toBinaryString(green);
    }

    public String getBlueBit(){

        return Integer.toBinaryString(blue);
    }


}
