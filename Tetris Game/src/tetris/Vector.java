package tetris;

public class Vector {

    private int x;
    private int y;

    public Vector(){
        this.x=0;
        this.y=0;
    }

    public Vector(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public String toString() {
        
        return "("+this.x+","+this.y+")";
    }

    public void subtraction(Vector V){
        this.x = this.x - V.x;
        this.y = this.y - V.y;

    }

    public void sum(Vector V){
        this.x = this.x + V.x;
        this.y = this.y + V.y;
    }

    public void rotateVCoordinates(){
        int temp=this.getX();
        this.setX(this.getY());
        this.setY(-temp);
    }

    public void rotateReverseVCoordinates(){
        System.out.println("\n"+this);

        int temp=this.getX();
        this.setX(-this.getY());
        this.setY(temp);

        System.out.println(""+this);
    }

    public boolean equals(Vector V){
        return ((this.getX()==V.getX()) && (this.getY()==V.getY()));
    }
    
}
