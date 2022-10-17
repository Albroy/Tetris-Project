package tetris;

public  class MainClass {

	public static Difficulty mod=Difficulty.Easy;

	public static GameBoard B = new GameBoard(20,10);
    public static void main(String[] args) {

        new Gui();
        Piece piece=new L();
        Piece piece1=new T();

        for (int i=0;i<19;i++){
            piece.fall(B);
        }

            //piece1.fall();

        B.putPiece(piece);

        piece1.moveRight(B);
        piece1.moveRight(B);

        for (int i=0;i<19;i++){
            piece1.fall(B);
        }

       
        B.putPiece(piece1);
        System.out.println(""+B);
    }

}
