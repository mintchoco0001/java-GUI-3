package GUI;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.darkGray);
		c.setLayout(new FlowLayout());
		c.add(new JButton("하나"));
		c.add(new JButton("둘"));
		c.add(new JButton("셋"));
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
