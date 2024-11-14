package games.connect_four;

public class Main {

    public static void main(String[] args) {


        Player[][] stage = new Player[6][6];


        Stage stage1 = new Stage(stage);

        // stage[y][x]


        Game game = new Game(stage1);


        game.playerMove(0, 3, Player.ROT);
        game.playerMove(0, 5, Player.GELB);
        game.playerMove(0, 4, Player.ROT);
        game.playerMove(0, 5, Player.GELB);
        game.playerMove(0, 3, Player.ROT);
        game.playerMove(0, 2, Player.GELB);
        game.playerMove(0, 2, Player.ROT);
        game.playerMove(0, 3, Player.GELB);
        game.playerMove(0, 4, Player.ROT);
        game.playerMove(0, 3, Player.GELB);
        game.playerMove(0, 1, Player.ROT);
        game.playerMove(0, 0, Player.GELB);
        game.playerMove(0, 0, Player.ROT);
        game.playerMove(0, 2, Player.GELB);
        game.playerMove(0, 0, Player.ROT);
        game.playerMove(0, 1, Player.GELB);


//        game.playerMove(0, 5,Player.GELB);
//        game.playerMove(0, 5,Player.ROT);
//        game.playerMove(0, 5,Player.GELB);

/*        System.out.println("AdjancentSameColor:");
        System.out.println(stage1.isAdjacentSameColor(3, 4, Player.ROT, "ne"));
        System.out.println(stage1.getStage()[3][4]);
        System.out.println("ne");
        System.out.println(stage1.getStage()[2][5]);
        System.out.println("sw");
        System.out.println(stage1.getStage()[4][3]);*/


        System.out.println("GEWONNEN/VERLOREN:");
        System.out.println(game.hasWon(4, 1, Player.GELB));


        System.out.println(game.toString());

        for (int i = 0; i < stage.length; i++) {
            System.out.print("y" + i + " ");
            for (int j = 0; j < stage[i].length; j++) {
                System.out.print("|y" + i + "x" + j + "");
            }
            System.out.print("|");
            System.out.println();
        }



 /*        for (Player[] s : stage) {
            for (Player s2 : s) {
                if (s2 == null) {
                    System.out.printf("| %s ");
                }
            }
            System.out.print("|");
            System.out.println();
        }*/

    }

}
