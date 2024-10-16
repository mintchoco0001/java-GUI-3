package Munjea정답;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ex02 extends JFrame {

	private JTextField jt=new JTextField(10);
	private JComboBox<String> cb=new JComboBox<String>();
	public Ex02() {
		setTitle("JTextField Ex");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(jt);
		c.add(cb);
		
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField tf=(JTextField)e.getSource();
				cb.addItem(tf.getText());
				tf.setText("");
			}
		});
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02();
	}

}
