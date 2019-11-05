package teamproject;

import java.awt.*;
import javax.swing.*;




public class TicTac extends JFrame {
	
	private static final long serialVersionUID = -3245071042822729383L;
	public static void main(String[] args) {
		
		//create the JFrame containing the game
		JFrame frameGame = new JFrame("Tic Tac Toe Game");
		frameGame.setSize(new Dimension(1000, 500));
		frameGame.setLocation(100, 100);
        frameGame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frameGame.setVisible(true);
        
        
        //create jpanel containing now playing label, player o button, and player x button
        JPanel panelTop1 = new JPanel();
        	JLabel labelNowPlaying = new JLabel("Now Playing:");
        	JButton buttonPlayerO = new JButton("Player O");
        	JButton buttonPlayerX = new JButton("Player X");
        
        //create a jpanel containing manage games label, restart button, and undo button
        JPanel panelTop2 = new JPanel();
        	JLabel labelManage = new JLabel("Manage Game");
        	JButton buttonRestart = new JButton("Restart");
        	JButton buttonUndo = new JButton("Undo");

        //create a jpanel containing all tic tac toe boards
        JPanel panelBoards = new JPanel();
        //create jpanels containing 9 buttons for individual boards
        	JPanel panelBoard1 = new JPanel();
        		JButton button1Board1 = new JButton();
        		JButton button2Board1 = new JButton();
        		JButton button3Board1 = new JButton();
        		JButton button4Board1 = new JButton();
        		JButton button5Board1 = new JButton();
        		JButton button6Board1 = new JButton();
        		JButton button7Board1 = new JButton();
        		JButton button8Board1 = new JButton();
        		JButton button9Board1 = new JButton();
        	JPanel panelBoard2 = new JPanel();
    			JButton button1Board2 = new JButton();
    			JButton button2Board2 = new JButton();
    			JButton button3Board2 = new JButton();
    			JButton button4Board2 = new JButton();
    			JButton button5Board2 = new JButton();
    			JButton button6Board2 = new JButton();
    			JButton button7Board2 = new JButton();
    			JButton button8Board2 = new JButton();
    			JButton button9Board2 = new JButton();
        	JPanel panelBoard3 = new JPanel();
        		JButton button1Board3 = new JButton();
        		JButton button2Board3 = new JButton();
        		JButton button3Board3 = new JButton();
        		JButton button4Board3 = new JButton();
        		JButton button5Board3 = new JButton();
        		JButton button6Board3 = new JButton();
        		JButton button7Board3 = new JButton();
        		JButton button8Board3 = new JButton();
        		JButton button9Board3 = new JButton();
        	JPanel panelBoard4 = new JPanel();
        		JButton button1Board4 = new JButton();
        		JButton button2Board4 = new JButton();
        		JButton button3Board4 = new JButton();
        		JButton button4Board4 = new JButton();
        		JButton button5Board4 = new JButton();
        		JButton button6Board4 = new JButton();
        		JButton button7Board4 = new JButton();
        		JButton button8Board4 = new JButton();
        		JButton button9Board4 = new JButton();
        	JPanel panelBoard5 = new JPanel();
        		JButton button1Board5 = new JButton();
        		JButton button2Board5 = new JButton();
        		JButton button3Board5 = new JButton();
        		JButton button4Board5 = new JButton();
        		JButton button5Board5 = new JButton();
        		JButton button6Board5 = new JButton();
        		JButton button7Board5 = new JButton();
        		JButton button8Board5 = new JButton();
        		JButton button9Board5 = new JButton();
        	JPanel panelBoard6 = new JPanel();
        		JButton button1Board6 = new JButton();
        		JButton button2Board6 = new JButton();
        		JButton button3Board6 = new JButton();
        		JButton button4Board6 = new JButton();
        		JButton button5Board6 = new JButton();
        		JButton button6Board6 = new JButton();
        		JButton button7Board6 = new JButton();
        		JButton button8Board6 = new JButton();
        		JButton button9Board6 = new JButton();
        	JPanel panelBoard7 = new JPanel();
        		JButton button1Board7 = new JButton();
        		JButton button2Board7 = new JButton();
        		JButton button3Board7 = new JButton();
        		JButton button4Board7 = new JButton();
        		JButton button5Board7 = new JButton();
        		JButton button6Board7 = new JButton();
        		JButton button7Board7 = new JButton();
        		JButton button8Board7 = new JButton();
        		JButton button9Board7 = new JButton();
        	JPanel panelBoard8 = new JPanel();
        		JButton button1Board8 = new JButton();
        		JButton button2Board8 = new JButton();
        		JButton button3Board8 = new JButton();
        		JButton button4Board8 = new JButton();
        		JButton button5Board8 = new JButton();
        		JButton button6Board8 = new JButton();
        		JButton button7Board8 = new JButton();
        		JButton button8Board8 = new JButton();
        		JButton button9Board8 = new JButton();
        	JPanel panelBoard9 = new JPanel();
        		JButton button1Board9 = new JButton();
        		JButton button2Board9 = new JButton();
        		JButton button3Board9 = new JButton();
        		JButton button4Board9 = new JButton();
        		JButton button5Board9 = new JButton();
        		JButton button6Board9 = new JButton();
        		JButton button7Board9 = new JButton();
        		JButton button8Board9 = new JButton();
        		JButton button9Board9 = new JButton();
        //create a jpanel containing all the fields, buttons, and labels on the 
        	JPanel panelBottom = new JPanel();
        	JButton buttonStats = new JButton("Playing Stats");
        	JLabel labelWinPercent = new JLabel("Win %: ");
        	JTextField fieldWinPercent = new JTextField();
        	JLabel labelTotalGames = new JLabel("Total # of Games: ");
        	JTextField fieldTotalGames = new JTextField();
        	JLabel labelAvgMoves = new JLabel("Average # of moves per win: ");
        	JTextField fieldAvgMoves = new JTextField();
    		panelBottom.add(buttonStats);
    		panelBottom.add(labelWinPercent);
    		panelBottom.add(fieldWinPercent);
    		panelBottom.add(labelTotalGames);
    		panelBottom.add(fieldTotalGames);
    		panelBottom.add(labelAvgMoves);
    		panelBottom.add(fieldAvgMoves);
    		
    		frameGame.add(panelBottom, BorderLayout.SOUTH);
    		
            frameGame.setVisible(true);

	}
	

	

}
