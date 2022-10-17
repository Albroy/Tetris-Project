package tetris;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class DifficultyButton extends JButton implements ActionListener {
	 DifficultyButton(){
		 this.setText(""+MainClass.mod);
		 this.addActionListener(this);
		 this.setForeground(Color.yellow);
		 this.setBackground(Color.black);
	 }
	
	 
	
		
	public void actionPerformed(ActionEvent e) {
		switch (MainClass.mod) {
			 case Easy:
				 MainClass.mod=Difficulty.Medium;
				 break;
			 case Medium:
				 MainClass.mod=Difficulty.Hard;
				 break;
			 case Hard: 
				 MainClass.mod=Difficulty.Heroic;
				 break;
			 case Heroic:	
				 MainClass.mod=Difficulty.Legendary;
				 break;
			 case Legendary:
				 MainClass.mod=Difficulty.Easy;
				 break;
		}
		this.setText(""+MainClass.mod);; 			//Change the button name 
			 
	}	

}
