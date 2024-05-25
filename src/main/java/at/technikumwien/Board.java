package at.technikumwien;

public class Board {

    private char[][] cells = new char[3][3];

    Board(){
        cells = new char[][]{{' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '}};
    }

    public boolean isCellEmpty(int x, int y) {
        //return whether cell is empty or not
        if (cells[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void place(int x, int y, char marker){
        //set cell value to content and return confirmation
        cells[x][y]=marker;
    }

    public boolean isFull(){
        return false;
    }

    public void clear(){

    }

    public void print(){
        System.out.println("▁ ▁ ▁ ▁");
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                System.out.print("|"+cells[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("▔ ▔ ▔ ▔");
    }

}
