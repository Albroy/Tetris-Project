package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.*;
public class Board extends JPanel{
	  int rows;
	  int cols;
	Board(int r, int c){
		this.setBorder(BorderFactory.createEmptyBorder(400, 300, 400, 200));
		rows = r;
		cols = c;		
		//this.setLocation(50, 50);
	}

	
	
	
	

	 public void paint(Graphics g) {
		 int i=33;	// lenght of a square
		 int v=25; // distance from the top left corner
		    for (int c = 0; c < 10; ++ c) {
		        for (int r = 0; r < 20; ++r) {
		        	g.setColor(MainClass.B.colorSelector(r,c)); 
		        //	System.out.println(MainClass.B.colorSelector(r, c));
		        //	g.setColor(randomColor());
		            g.fillRect(v+c*i,v+r*i, i, i);
		        }
		    }
		    //LINEMAKER
		    for (int row = 0; row < 21; ++ row) {
		        g.setColor(Color.DARK_GRAY);
		        g.drawLine(v+10*i, v+i*row,v, v+i*row );
		       
		    }
		    //COLUMNMAKER
		    for(int col=0;col<11;col++) {
		    	g.setColor(Color.DARK_GRAY);
		    	g.drawLine(v+i*col, v, v+i*col,v+i*20);
		    }
		  }
	
	 public Color randomColor() { //For fun
		 Random rnd = new Random(); 
		 Color color =new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));  
		 return color;
		 }
	

}
