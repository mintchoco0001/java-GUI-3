package Munjea;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;

public class m07 extends JFrame {
	JSlider sl = new JSlider();
	JLabel la = new JLabel("I Love Java");

	public m07() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		sl = new JSlider(1, 100, 50);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		c.add(sl, BorderLayout.NORTH);
		c.add(la, BorderLayout.SOUTH);
		la.setHorizontalAlignment(JLabel.CENTER);
	}

	public static void main(String[] args) {
		new m07();
	}
}
