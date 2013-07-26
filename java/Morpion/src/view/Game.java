package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Grid;
import model.Player;

/**
 * Class Game.
 * @author Folabi
 * @date 16/07/2013-16/07/2013.
 *
 */
public class Game extends JFrame{
	
	/**
	 * Grid of the game.
	 */
	private Grid grid;
	/**
	 * Player.
	 */
	private Player player;
	
	public Game(){
		
		super("Morpion 3x3");
		setLayout(new BorderLayout());
		
		// panel which contains the grid
		JPanel panelCenter = new JPanel(new GridLayout(3, 3));
		int labelNumber = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				JLabel label = new JLabel();
				label.setName(""+labelNumber);
				
				// label in the middle, with left, right and down border except the last one
				if(j == 1){
					if(i != 2){
						label.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.GRAY));
					}else{
						label.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.GRAY));
					}
				}
				
				if(i != 2 && j != 1)
					label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
				
				label.addMouseListener(new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						System.out.println(e.getSource());
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				panelCenter.add(label);
				labelNumber++;
			}
		}
		
		
		
		// panel which gives informations to player
		JPanel panelSouth = new JPanel();
		panelSouth.add(new JLabel("Player"));
			
		// adding of panels
		add(panelSouth, BorderLayout.SOUTH);
		add(panelCenter);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String []args){
		new Game();
	}
}
