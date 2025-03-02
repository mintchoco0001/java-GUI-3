package Munjea정답;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ex10 extends JFrame{

	private JLabel [] gameLabels = new JLabel [10]; 
	private int nextPressed = 0;
	public Ex10() {
		super("Ten ���̺� Ŭ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		setSize(300,300);
		setVisible(true);
		
		for(int i=0; i<gameLabels.length; i++) {
			gameLabels[i] = new JLabel(Integer.toString(i)); 
			gameLabels[i].setFont(new Font("Gothic", Font.PLAIN, 15));
			gameLabels[i].setForeground(Color.MAGENTA);
			c.add(gameLabels[i]); 
			
			
			gameLabels[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JLabel la = (JLabel)e.getSource();
					if(Integer.parseInt(la.getText()) == nextPressed) { 
						nextPressed++;
						if(nextPressed == 10) {
							nextPressed = 0;
							configure();
						}
						else 
							la.setVisible(false);
					}
				}
			});
		}
		configure(); 
	}
	
	private void configure() {
		Container c = getContentPane();
		for(int i=0; i<gameLabels.length; i++) {
			gameLabels[i].setSize(15, 15); 
			
			int xBound = c.getWidth() - gameLabels[i].getWidth(); 
			int yBound = c.getHeight() - gameLabels[i].getHeight(); 			
			int x = (int)(Math.random()*xBound);
			int y = (int)(Math.random()*yBound);				
			gameLabels[i].setLocation(x, y);
			gameLabels[i].setVisible(true);
		}
	}
	static public void main(String [] args) {
		new Ex10();
	}
}
