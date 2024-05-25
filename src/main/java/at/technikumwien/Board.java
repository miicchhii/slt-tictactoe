package at.technikumwien;

public class Board {

    private int[][] cells = new int[3][3];

    Board(){
        cells = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    }

    public void drawGrid(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }

    public int setCell(int x, int y, int content){
        //Check if content is valid, set cell value to content and return confirmation
        if(content==1 || content ==2){
            cells[x][y]=content;
            return 0;
        }else{
            return 1;
        }
    }

    public boolean isCellEmpty(int x, int y) {
        //return whether cell is empty or not
        if (cells[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void place(int x, int y, int content){

    }

}
