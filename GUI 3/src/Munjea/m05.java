package Munjea;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class m05 extends JFrame {
	JTextField tf = new JTextField(10);

	public m05() {
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
		new m05();
	}
}
