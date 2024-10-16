package Munjea정답;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex05 extends JFrame {

	private JTextField tf=new JTextField(20);
	public Ex05() {
		setTitle("Focus Event ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�Է��� �� �ٸ� â�� Ŭ���ϸ� �빮�ڷ� ����"));
		c.add(tf);
		
		tf.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				tf.setText(tf.getText().toUpperCase());
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		setSize(400,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex05();
	}

}
