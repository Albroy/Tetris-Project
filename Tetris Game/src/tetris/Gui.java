package tetris;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

	
	 
	 
	 
	
	 
	public Gui() {
		//Frame Creation
		this.setLayout(new GridLayout(1,2));
		this.setTitle ( "TETRIS");
		this.setSize(1286,829);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);


		this.add(new Board(200,100));// Add Panel Board to frame

		JPanel test= new JPanel();
		JPanel test1= new JPanel();
		test1.setLayout(new GridLayout(4,1)); // COUPE T1 EN 4 LINES

		//Creation of the ButtonEnvironment
		JPanel buttonPanel= new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx=0.4;
		buttonPanel.add(new DifficultyButton(),gbc);
		gbc.gridx = 10;
		buttonPanel.add(new PauseButton(),gbc);

		test.setLayout(new GridLayout(2,1)); // COUPE T EN 2 LINES

		test.add(test1);
		test.add(buttonPanel);

		this.add(test);
		this.setVisible(true);
		// this.pack();

		 
		 
		}
	
	
	
	}

