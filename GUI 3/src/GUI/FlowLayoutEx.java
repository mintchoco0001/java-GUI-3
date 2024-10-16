package GUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {
		setTitle("flow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		//FlowLayout 이었던것
//		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
//		for (int i = 1; i < 31; i++) {
//			c.add(new JButton(i + "번째"));	
//		}

		//BorderLayout
		c.setLayout(new BorderLayout(30,20));
		c.setBackground(Color.darkGray);
		c.add(new JButton("북"),new BorderLayout().NORTH);
		c.add(new JButton("동"),new BorderLayout().EAST);
		c.add(new JButton("서"),new BorderLayout().WEST);
 		c.add(new JButton("남"),new BorderLayout().SOUTH);
 		c.add(new JButton("센"),new BorderLayout().CENTER);
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}