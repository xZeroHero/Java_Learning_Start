package games.connect_four;

public class Game {

    private Stage stage;


    public Game(Stage stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return stage.toString();
    }

    public boolean hasWon(int y, int x, Player player) {
        return     checkHorizontalWin(y, x, player)
                || checkDiagonal1Win(y, x, player)
                || checkDiagonal2Win(y, x, player)
                || checkVerticalWin(y, x, player);

    }

    public boolean checkVerticalWin(int y, int x, Player player) {              //    Win: |
        int xReset = x;
        int yReset = y;
        int counter = 1;
        while (stage.isAdjacentSameColor(y, x, player, "n")) {
            counter++;

            y--;
        }
        x = xReset;
        y = yReset;
        while (stage.isAdjacentSameColor(y, x, player, "s")) {
            counter++;
            y++;
        }
        if (counter >= 4) return true;
        else return false;
    }


    public boolean checkHorizontalWin(int y, int x, Player player) {        //    Win: -
        int xReset = x;
        int counter = 1;
        while (stage.isAdjacentSameColor(y, x, player, "e")) {
            counter++;
            x++;
        }
        x = xReset;
        while (stage.isAdjacentSameColor(y, x, player, "w")) {
            counter++;
            x--;
        }
        if (counter >= 4) return true;
        else return false;
    }

    public boolean checkDiagonal1Win(int y, int x, Player player) {              //    Win: /
        int xReset = x;
        int yReset = y;
        int counter = 1;
        while (stage.isAdjacentSameColor(y, x, player, "ne")) {
            counter++;
            x++;
            y--;
        }
        x = xReset;
        y = yReset;
        while (stage.isAdjacentSameColor(y, x, player, "sw")) {
            counter++;
            x--;
            y++;
        }
        if (counter >= 4) return true;
        else return false;
    }

    public boolean checkDiagonal2Win(int y, int x, Player player) {              //    Win: \
        int xReset = x;
        int yReset = y;
        int counter = 1;
        while (stage.isAdjacentSameColor(y, x, player, "nw")) {
            counter++;
            x--;
            y--;
        }
        x = xReset;
        y = yReset;
        while (stage.isAdjacentSameColor(y, x, player, "se")) {
            counter++;
            x++;
            y++;
        }
        if (counter >= 4) return true;
        else return false;
    }

    public boolean playerMove(int y, int x, Player player) {

        if (stage.isFirstSlotFree(x)) {
            if (stage.isInValidMove(y, x)) {
                return playerMove(y + 1, x, player);
            }

/*        while (stage.isBelowEmpty(y, x) && y < stage.getStage().length - 1){
            y++;
        }*/
            stage.setPlayer(y, x, player);

            return true;
        }
        System.out.println("Invalid Move");
        return false;
    }


    //GETTER & SETTER
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
