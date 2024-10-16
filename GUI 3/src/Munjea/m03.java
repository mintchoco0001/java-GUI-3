package Munjea;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class m03 extends JFrame {

	public m03() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setContentPane(new MyPanel());

		setVisible(true);
		setSize(500, 500);
	}

	class MyPanel extends JPanel {
		private JLabel jl;
		private JTextField input;
		private JButton btn1;
		private JButton btn2;
		private String[] mname = { "5만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
		private int[] money = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		private JTextField[] tf = new JTextField[8];

		public MyPanel() {
			setBackground(Color.pink);
			setLayout(null);

			jl = new JLabel("금액");
			jl.setHorizontalAlignment(JLabel.RIGHT);
			jl.setSize(40, 20);
			jl.setLocation(20, 20);
			add(jl);

			input = new JTextField(30);
			input.setSize(120, 20);
			input.setLocation(80, 20);
			input.setHorizontalAlignment(JTextField.CENTER);
			add(input);

			btn1 = new JButton("계산");
			btn1.setSize(70, 20);
			btn1.setLocation(220, 20);
			add(btn1);

			btn2 = new JButton("초기화");
			btn2.setSize(100, 20);
			btn2.setLocation(220, 50);
			add(btn2);
			btn2.setVisible(false);

			for (int i = 0; i < mname.length; i++) {
				JLabel la = new JLabel(mname[i]);
				la.setSize(50, 20);
				la.setLocation(40, 50 + i * 20);
				la.setHorizontalAlignment(JLabel.RIGHT);
				add(la);

				tf[i] = new JTextField(30);
				tf[i].setSize(80, 20);
				tf[i].setLocation(100, 50 + i * 20);
				tf[i].setHorizontalAlignment(JTextField.CENTER);
				add(tf[i]);
			}

			btn1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String don = input.getText();
					if (don.length() == 0) {
						return;
					}
					int mon = Integer.parseInt(don);
					int rem;
					for (int i = 0; i < mname.length; i++) {
						rem = mon / money[i];
						tf[i].setText(Integer.toString(rem));
						if (rem > 0) {
							mon = mon % money[i];
						}
					}
					btn2.setVisible(true);
				}
			});

			btn2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					input.setText("");
					for (int i = 0; i < mname.length; i++) {
						tf[i].setText("");
					}
					btn2.setVisible(false);
				}
			});
		}
	}

	public static void main(String[] args) {
		new m03();
	}
}
