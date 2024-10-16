package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		setTitle("Grid");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
//		c.setLayout(new GridLayout(4, 3, 10, 10));
//		for (int i = 0; i < 12; i++) {
//			c.add(new Button(i + 1 + "asdf"));
//		}

		c.setLayout(new GridLayout(4, 2, 3, 5));
		c.add(new JLabel("이름 : "));
		c.add(new JTextField());
		c.add(new JLabel("학번 : "));
		c.add(new JTextField());
		c.add(new JLabel("학과 : "));
		c.add(new JTextField());
		c.add(new JLabel("과목 : "));
		c.add(new JTextField());

		setSize(600, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
