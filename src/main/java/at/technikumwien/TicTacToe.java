package at.technikumwien;

public class TicTacToe {
    Player player1;
    Player player2;

    Player currentPlayer;
    Board board;


    TicTacToe(){
        this.player1 = new Player('X');
        this.player2 = new Player('O');
        this.currentPlayer = player1;
        this.board = new Board();
    }

    public void start(){
        
    }

    public void switchCurrentPlayer(){

    }

    public void hasWinner(){

    }

}
