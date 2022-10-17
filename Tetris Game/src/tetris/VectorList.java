package tetris;

import java.util.*;

public class VectorList extends ArrayList<Vector> {

    public boolean isVectorhere(Vector V1){
        for(Vector V2: this){
            if(V2.equals(V1)){
                return true;
            }       
        }
        return false;
    }    
}
