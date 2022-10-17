package tetris;

public abstract class Piece{
    protected Vector[] coordinates;
    protected Vector center;
    protected abstract void rotateRight();
    protected abstract void rotateLeft();
    protected char color;

    public int getYRight(){

        int y=this.center.getY();

        for(Vector V: this.coordinates){
            if (V.getY() > y){
                y=V.getY();
                
            }
        
        }

        return y;

    }

    public int getYLeft(){

        int y=this.center.getY();

        for(Vector V: this.coordinates){
            if (V.getY() < y){
                y=V.getY();
                
            }
        
        }

        return y;

    }
    

    public int getXTop(){

        int x=this.center.getX();

        for(Vector V: this.coordinates){
            if (V.getX() < x){
                x=V.getX();
                
            }
        
        }

        return x;

    }

    public int getXBottom(){

        int x=this.center.getX();

        for(Vector V: this.coordinates){
            if (V.getX() > x){
                x=V.getX();
                
            }
        
        }

        return x;

    }

    public boolean IsPieceAfterRightBorder(){
        return (this.getYRight()>9);
    }

    public boolean IsPieceAfterLeftBorder(){
        return (this.getYLeft()<0);
    }

    public boolean IsPieceAfterBottomBorder(){
        return(this.getXBottom()>19);
    }

    public boolean IsPieceBeforeTopBorder(){
        return(this.getXTop()<0);
    }

    public boolean IsPieceTouchBottomBorder(){
        return (this.getXBottom()==19);
    }

    public boolean IsPieceTouchRightBorder(){
        return (this.getYRight()==9);
    }

    public boolean IsPieceTouchLeftBorder(){
        return (this.getYLeft()==0);
    }

    public void fall(GameBoard B){
        if(!this.IsPieceTouchBottomBorder() && !(this.contact(B))){
            for(Vector V: this.coordinates){
                V.setX(V.getX() + 1);
            
            }
    
            this.center.setX(this.center.getX() + 1);
            
        }
    }


    public void moveLeft(GameBoard B){
        if(!this.IsPieceTouchLeftBorder() && !(this.contact(B))){
            for(Vector V: this.coordinates){
                V.setY(V.getY() - 1);
            
            }
    
            this.center.setY(this.center.getY() - 1);
            
        }
    }

    public void moveRight(GameBoard B){
        if(!this.IsPieceTouchRightBorder() && !(this.contact(B))){
            for(Vector V: this.coordinates){
                V.setY(V.getY() + 1);
            
            }
    
            this.center.setY(this.center.getY() + 1);
            
        }
    }

    

    public VectorList getContour(){

        VectorList CoordinatesList = new VectorList();

        for (int i =0; i<4;i++){

            CoordinatesList.add(this.coordinates[i]);
            //System.out.println(""+CoordinatesList.get(i));

        }

        VectorList contour = new VectorList();
        Vector temp;
        
        for(Vector V: this.coordinates){

            //System.out.println("---"+V+"---");

            temp=new Vector(V.getX(),V.getY());
            temp.setX(V.getX()+1);
            if (!CoordinatesList.isVectorhere(temp)){
                contour.add(temp);
            }
            //System.out.println(""+temp);


            temp=new Vector(V.getX(),V.getY());
            temp.setX(V.getX()-1);
            if (!CoordinatesList.isVectorhere(temp)){
                contour.add(temp);
            }
            //System.out.println(""+temp);

            temp=new Vector(V.getX(),V.getY());
            temp.setY(V.getY()+1);
            if (!CoordinatesList.isVectorhere(temp)){
                contour.add(temp);
            }
            //System.out.println(""+temp);

            temp=new Vector(V.getX(),V.getY());
            temp.setY(V.getY()-1);
            if (!CoordinatesList.isVectorhere(temp)){
                contour.add(temp);
            }
            //System.out.println(""+temp);

            //System.out.print("\n");

        }


        System.out.println(""+contour);

        return contour;

    }

    public boolean contact(GameBoard B){
        VectorList contour = this.getContour();

        for (Vector V: contour){
            if((V.getX() < 19) && (V.getX() > 0) && (V.getY() < 9) && (V.getY() > 0) ){
                
                if (B.getBoard()[V.getX()][V.getY()]!='0'){
                    System.out.println(V+" -> "+B.getBoard()[V.getX()][V.getY()]);
                    return true;
                }
            }
        }

        return false;

    }
    
    
}
