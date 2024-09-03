package aufgaben.objektorientierung.a32_farben;

public class Main {

    public static void main(String[] args) {

        Farbe farbe = new Farbe();

//        farbe.setBlue(255);
//        farbe.setRed(255);
//        farbe.setGreen(255);

        farbe.setFarbeProzent(10, 100, 100);

        System.out.println(farbe.getRed());
        System.out.println(farbe.getGreen());
        System.out.println(farbe.getBlue());
        System.out.println();
        System.out.println(farbe.isGray());
        System.out.println(farbe.getHexString());
        System.out.println();
        System.out.println(farbe.getRedBit());
        System.out.println(farbe.getGreenBit());
        System.out.println(farbe.getBlueBit());

        System.out.println();
        farbe.setGrayProzent(50);
        System.out.println(farbe.getRed());
        System.out.println(farbe.getGreen());
        System.out.println(farbe.getBlue());


    }

}
