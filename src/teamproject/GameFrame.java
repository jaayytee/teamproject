package teamproject;

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {
	
	public static void main(String[] args) {
		
		//create the JFrame containing the game
		JFrame frameGame = new JFrame("Tic Tac Toe Game");
		frameGame.setSize(new Dimension(1000, 500));
		frameGame.setLocation(100, 100);
        frameGame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frameGame.setVisible(true);
	}
	

	

}
