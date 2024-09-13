package aufgaben.objektorientierung.a36_horse;

public class Main {

    public static void main(String[] args) {

        Color schwarz = new Color("schwarz", 0,0,0);
        Color dunkelfuchs = new Color("dunkelfuchs");
        Sattel sattelA = new Sattel("Nubukleder", 3.7, schwarz);
        Halfter halfterA = new Halfter("F", schwarz);
        Pferd pferdA = new Pferd("Fred", "Irish Sport Horse", 8, 167.0, "Wallach", dunkelfuchs, sattelA, halfterA);

        System.out.println(pferdA);

    }

}
