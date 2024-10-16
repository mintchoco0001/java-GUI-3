package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class NullLayoutEx extends JFrame {

	public NullLayoutEx() {
		setTitle("도비는 FREE 에요");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(null);
//		JButton btn = new JButton("도비");
//		btn.setLocation(30,30);
//		btn.setSize(100,100);
//		c.add(btn);
		JLabel jl1 = new JLabel("이름 : ");
		jl1.setBounds(65, 30, 100, 100);
		JLabel jl2 = new JLabel("학번 : ");
		jl2.setBounds(65, 60, 100, 100);
		JLabel jl3 = new JLabel("학과 : ");
		jl3.setBounds(65, 90, 100, 100);
		JLabel jl4 = new JLabel("과목 : ");
		jl4.setBounds(65, 120, 100, 100);
		JTextField jt1 = new JTextField();
		jt1.setBounds(125, 67, 50, 30);
		JTextField jt2 = new JTextField();
		jt2.setBounds(125, 97, 50, 30);
		JTextField jt3 = new JTextField();
		jt3.setBounds(125, 127, 50, 30);
		JTextField jt4 = new JTextField();
		jt4.setBounds(125, 157, 50, 30);

		c.add(jl1);
		c.add(jl2);
		c.add(jl3);
		c.add(jl4);
		c.add(jt1);
		c.add(jt2);
		c.add(jt3);
		c.add(jt4);
		setSize(500, 500);
		setVisible(true);
		c.setBackground(Color.cyan);

	}

	public static void main(String[] args) {
		new NullLayoutEx();
	}

}
