package Munjea;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class m06 extends JFrame {
	JLabel jl = new JLabel();
	JSlider js = new JSlider();

	public m06() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		js.setMajorTickSpacing(50);
		js.setPaintLabels(true);
		c.add(js);

		jl.setOpaque(true);
		jl.setBackground(Color.green);
		jl.setText(Integer.toString(js.getValue()));

		js.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				jl.setText(Integer.toString(js.getValue()));
			}
		});
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new m06();
	}
}
