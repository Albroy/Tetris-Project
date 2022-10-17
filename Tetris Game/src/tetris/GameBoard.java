package tetris;

import java.awt.Color;

public class GameBoard{

     private char[][] board;

    public GameBoard(int line, int column){

        board = new char[line][column];

        for(int i=0; i< line; i++){
            for(int j=0; j< column; j++){
                board[i][j]='0';
            }
        }
    }

    public void putPiece(Piece p){
        
        for(Vector V: p.coordinates){
            this.board[V.getX()][V.getY()]=p.color;
        }

    }

    public char[][] getBoard(){
        return this.board;
    }

    public String toString(){

        String m="\n";


        for(int i=0; i< 20; i++){
            for(int j=0; j< 10; j++){
                m+=board[i][j]+" ";
            }
            m+="\n";
        }

        return m;

    }
    public  Color colorSelector(int i,int y) {
    	char cas = this.board[i][y];

    	switch(cas) {
    		case '1':
    			return Color.yellow;
    		case '2':
    			return Color.red;
    		case '3':
    			return Color.pink;
    		case '4':
    			return Color.green;
    		case '5':
    			return Color.blue;
    		case '6':
    			return Color.orange;
    		case '7':
    			return Color.cyan;
    		 default:
    			return Color.gray;
    	}

		 
	 }
}