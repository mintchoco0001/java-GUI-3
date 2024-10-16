package Munjea;

import java.awt.event.*;
import java.util.Vector;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class m02 extends JFrame {
	private JTextField tf = new JTextField(10);
	private JComboBox<String> jc = new JComboBox<String>();

	public m02() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름을 입력후 <Enter> 키를 누르세요"));
		JTextField jtf = new JTextField(10);
		JComboBox cb = new JComboBox();
		jtf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				cb.addItem(t.getText());
				t.setText("");			
				}
		});

		c.add(jtf);
		c.add(cb);
		
		setSize(300, 300);
		setVisible(true);

	}public static void main(String[] args) {
		new m02();
	}
}

