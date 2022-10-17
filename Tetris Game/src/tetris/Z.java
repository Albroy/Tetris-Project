package tetris;

public class Z extends Piece{

    public Z(){
        this.coordinates = new Vector[4];

        this.coordinates[0] = new Vector(1,5);
        this.coordinates[1] = new Vector(1,4);
        this.coordinates[2] = new Vector(0,4);
        this.coordinates[3] = new Vector(0,3);

        this.center = new Vector(1,4);
        this.color='6';

    }


    public void rotateRight(){

        for(Vector V: this.coordinates){
            
          if ((V.getX() != this.center.getX()) || (V.getY() != this.center.getY())){
            V.subtraction(this.center);
            V.rotateVCoordinates();
            V.sum(this.center);
          }
        }

        if (this.IsPieceAfterBottomBorder() || this.IsPieceAfterLeftBorder() || this.IsPieceAfterRightBorder() || this.IsPieceBeforeTopBorder()){
            for(Vector V: this.coordinates){
                
                if ((V.getX() != this.center.getX()) || (V.getY() != this.center.getY())){
                    System.out.println("We touch a border");
                  V.subtraction(this.center);
                  V.rotateVCoordinates();
                  V.rotateVCoordinates();
                  V.rotateVCoordinates();
                  V.sum(this.center);
                }
              }
        }
    }

    public void rotateLeft(){

      for(Vector V: this.coordinates){
          
        if ((V.getX() != this.center.getX()) || (V.getY() != this.center.getY())){
          V.subtraction(this.center);
          V.rotateReverseVCoordinates();
          V.sum(this.center);
        }
      }

      if (this.IsPieceAfterBottomBorder() || this.IsPieceAfterLeftBorder() || this.IsPieceAfterRightBorder() || this.IsPieceBeforeTopBorder()){
            this.rotateRight();
      }
  }
    
}
