package tetris;

public class O extends Piece {

    public O(){
        this.coordinates = new Vector[4];

        this.coordinates[0] = new Vector(0,5);
        this.coordinates[1] = new Vector(0,4);
        this.coordinates[2] = new Vector(1,5);
        this.coordinates[3] = new Vector(1,4);
    
        this.center = new Vector(1,4);
        this.color='4';
    }
    
    public void rotateRight(){

    }

    public void rotateLeft(){

    }
}
