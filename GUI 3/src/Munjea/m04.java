package Munjea;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
public class m04 extends JFrame{
	JTextField tf = new JTextField(10);
	public m04() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("영어를 입력하고 다른 창을 누르면 대문자로 변환함"));
		c.add(tf);
		
		tf.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				 JTextField jt = (JTextField)e.getSource();
				 jt.setText(jt.getText().toUpperCase());
			}
			
			@Override
			public void focusGained(FocusEvent e) {}
		});
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new m04();
	}
}
