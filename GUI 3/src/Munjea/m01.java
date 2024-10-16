package Munjea;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class m01 extends JFrame {
	public m01() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JCheckBox cb1 = new JCheckBox("버튼 비활성화");
		JCheckBox cb2 = new JCheckBox("버튼 감추기");
		JButton btn = new JButton("test button");

		cb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
			}
		});
		cb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn.setVisible(false);
				}else {
					btn.setVisible(true);
				}
			}
		});

		c.add(cb1);
		c.add(cb2);
		c.add(btn);

		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new m01();
	}

}