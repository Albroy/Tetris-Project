package tetris;


public class I extends Piece {

    public I(){
        this.coordinates = new Vector[4];

        this.coordinates[0] = new Vector(0,6);
        this.coordinates[1] = new Vector(0,5);
        this.coordinates[2] = new Vector(0,4);
        this.coordinates[3] = new Vector(0,3);

        this.center = new Vector(0,4);
        this.color='1';

    }

    public void rotateLeft(){
        int temp;
        for(Vector V: this.coordinates){
          
            if ((V.getX() != this.center.getX()) || (V.getY() != this.center.getY())){
                V.subtraction(this.center);
                temp=V.getX();
                V.setX(V.getY());
                V.setY(temp);
                V.sum(this.center);
            
            }
        }


        if (this.IsPieceAfterBottomBorder() || this.IsPieceAfterLeftBorder() || this.IsPieceAfterRightBorder() || this.IsPieceBeforeTopBorder()){
        
            this.rotateLeft();
        }

    }

    public void rotateRight(){
        this.rotateLeft();        
    }

}
