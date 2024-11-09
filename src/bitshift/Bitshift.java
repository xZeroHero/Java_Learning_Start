package bitshift;

public class Bitshift {

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(0b10100);

//        Bits werden eine Stelle nach rechts verschoben, Overflow wird abgeschnitten 10 = 0b1010;
//        Bits werden eine Stelle nach rechts verschoben (Die 0 am Ende fällt weg) => 0b101 = 5
        System.out.println(10 >> 1);

//        Bits werden eine Stelle nach links verschoben, rechts wird eine 0 eingefügt: 0b1010 => 0b10100
        System.out.println(0b1010 << 1);

        System.out.println("\n========================\n");


        // 16 Stellen nach rechts, damit nur der erste der 3 Bytes übrig bleibt: 00001001
        int red = (0b00001001_00000001_00000001 >> 16) & 0xff;
        System.out.println(red);
        // 8 Stellen nach rechts, damit nur der die ersten beiden Bytes übrig bleiben: 00001001_00000011
        // & 0xff gibt an, wie viele bits genutzt werden (Maskierung) 0xff = 11111111 (8 Bits) d.h. die 8 rechten bits werden maskiert aka genutzt.
        int green = (0b00001001_01000011_00000001 >> 8) & 0xff;
        System.out.println(green);

        int blue = (0b00001001_00000011_00000001 >> 0) & 0xff;
        System.out.println(blue);

        // https://medium.com/android-news/java-when-to-use-n-8-0xff-and-when-to-use-byte-n-8-2efd82ae7dd7

    }

}
