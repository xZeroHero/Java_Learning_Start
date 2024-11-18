package games.connect_four;

public class Stage {

    private Player[][] stage;

    public Stage(Player[][] stage) {
        this.stage = stage;
    }


    @Override
    public String toString() {
        for (Player[] s : stage) {
            for (Player s2 : s) {

                System.out.printf("| %-4s ", s2);

            }
            System.out.print("|");
            System.out.println();
        }
        return "";
    }


    public int lengthX() {
        return stage[0].length;
    }

    public int lengthY() {
        return stage.length;
    }

    /**
     * Checks if the player at the position (y,x) is of the same color as the player at the position directly above it.
     *
     * @param y      the y-coordinate of the position to check
     * @param x      the x-coordinate of the position to check
     * @param player the player to check
     * @return true if the players are the same, false otherwise
     */
    public boolean isAdjacentSameColor(int y, int x, Player player, String direction) {
        boolean output = false;

        switch (direction.toLowerCase()) {
            case "n":
                if (isInBounds(y - 1, x)) output = stage[y - 1][x] == player;
                break;
            case "ne":
                if (isInBounds(y - 1, x + 1)) output = stage[y - 1][x + 1] == player;
                break;
            case "e":
                if (isInBounds(y, x + 1)) output = stage[y][x + 1] == player;
                break;
            case "se":
                if (isInBounds(y + 1, x + 1)) output = stage[y + 1][x + 1] == player;
                break;
            case "s":
                if (isInBounds(y + 1, x)) output = stage[y + 1][x] == player;
                break;
            case "sw":
                if (isInBounds(y + 1, x - 1)) output = stage[y + 1][x - 1] == player;
                break;
            case "w":
                if (isInBounds(y, x - 1)) output = stage[y][x - 1] == player;
                break;
            case "nw":
                if (isInBounds(y - 1, x - 1)) output = stage[y - 1][x - 1] == player;
                break;

        }

        return output;
    }

    public boolean isInBounds(int y, int x) {
        return isYInBounds(y) && isXInBounds(x);
    }

    public boolean isXInBounds(int x) {
        return x >= 0 && x < lengthX();
    }

    public boolean isYInBounds(int y) {
        return y >= 0 && y < lengthY();
    }


    public boolean isInValidMove(int y, int x) {
        if (isBelowEmpty(y, x) && y < stage.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isFirstSlotFree(int x) {
        if (stage[0][x] == null) {
            return true;
        }
        return false;
    }

    public boolean isBelowEmpty(int y, int x) {
        if (y == stage.length - 1) {
            return false;
        } else {
            if (stage[y + 1][x] == null) {
                return true;
            }
        }
        return false;
    }

    public void setPlayer(int y, int x, Player player) {
        stage[y][x] = player;
    }

    public Player[][] getStage() {
        return stage;
    }

    public void setStage(Player[][] stage) {
        this.stage = stage;
    }
}
