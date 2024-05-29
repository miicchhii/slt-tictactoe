package at.technikumwien;

public class Board {

    private char[][] cells = new char[3][3];

    Board() {
        cells = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    public boolean isCellEmpty(int x, int y) {
        //return whether cell is empty or not
        return cells[x][y] == ' ';
    }

    public void place(int x, int y, char marker) {
        //set cell value to content and return confirmation
        cells[x][y] = marker;
    }

    public boolean isFull() {
        for (int x = 0; x < cells.length; x++) {
            for (int y = 0; y < cells.length; y++) {
                if (cells[x][y] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


    public void clear() {
        cells = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }


public void print() {
    System.out.println("▁ ▁ ▁ ▁");
    for (int i = 0; i < cells.length; i++) {
        for (int j = 0; j < cells[0].length; j++) {
            System.out.print("|" + cells[i][j]);
        }
        System.out.print("|");
        System.out.println();
    }
    System.out.println("▔ ▔ ▔ ▔");
}

}
