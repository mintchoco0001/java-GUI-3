package Munjea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class m03정답 extends JFrame {

	public m03정답() {
		setTitle("Money Changer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(320, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private JLabel jl;
		private JTextField input;
		private JButton calB;
		private JButton initB;
		private String[] la_amount= {"������","����","õ��","500��","100��","50��","10��","1��"};
		private int[] money= {50000,10000,1000,500,100,50,10,1};
		private JTextField[] tf=new JTextField[8];
		
		public MyPanel() {
			setBackground(Color.pink);
			setLayout(null);
			
			jl=new JLabel("�ݾ�")	;
			jl.setHorizontalAlignment(JLabel.RIGHT);
			jl.setSize(40, 20);
			jl.setLocation(20, 20);
			add(jl);
			
			input=new JTextField(30);
			input.setSize(120, 20);
			input.setLocation(80, 20);
			input.setHorizontalAlignment(JTextField.CENTER);
			add(input);
			
			calB=new JButton("���");
			calB.setSize(70, 20);
			calB.setLocation(220, 20);
			add(calB);
			
			initB=new JButton("����");
			initB.setSize(70, 20);
			initB.setLocation(220, 50);
			add(initB);
			initB.setVisible(false);
			
			for (int i = 0; i < la_amount.length; i++) {
				JLabel la=new JLabel(la_amount[i]);
				la.setSize(50,20);
				la.setLocation(40, 50+i*20);
				la.setHorizontalAlignment(JLabel.RIGHT);
				add(la);
				
				tf[i]=new JTextField(30);
				tf[i].setSize(80, 20);
				tf[i].setLocation(100, 50+i*20);
				tf[i].setHorizontalAlignment(JTextField.CENTER);
				add(tf[i]);
			}
			
			calB.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String don=input.getText();
					if(don.length()==0) {
						return;
					}
					int mon=Integer.parseInt(don);
					int rem;
					for (int i = 0; i < money.length; i++) {
						// mon = 5678924
						// money = {50000,10000,1000,500,100,50,10,1}
						rem=mon/money[i];
						tf[i].setText(Integer.toString(rem));
						if(rem>0) {
							mon=mon%money[i];
						}
					}
					initB.setVisible(true);
				}
			});
			
			initB.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					input.setText("");
					for (int i = 0; i < la_amount.length; i++) {
						tf[i].setText("");
					}
					initB.setVisible(false);
				}
			});
		}
	}
	public static void main(String[] args) {
		new m03정답();
	}

}
