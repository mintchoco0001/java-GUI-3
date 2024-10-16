package Munjea정답;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex04 extends JFrame{

	public Ex04() {
		setTitle("Money CheckBox Changer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new MyPanelChk());
		
		setSize(320, 300);
		setVisible(true);
	}
	
	class MyPanelChk extends JPanel{
		private JLabel jl;
		private JTextField input;
		private JButton calB;
		private JButton initB;
		private String[] la_amount= {"������","����","õ��","500��","100��","50��","10��","1��"};
		private int[] money= {50000,10000,1000,500,100,50,10,1};
		private JTextField[] tf=new JTextField[8];
		private JCheckBox[] ch=new JCheckBox[7];
		
		public MyPanelChk() {
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
			
			for (int i = 0; i < ch.length; i++) {
				ch[i]=new JCheckBox("",true);
				ch[i].setSize(20, 20);
				ch[i].setLocation(190, 50+i*20);
				ch[i].setOpaque(false);
				add(ch[i]);
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
						// money= {50000,10000,1000,500,100,50,10,1};
						
						// 1�� �������� ���� �� ���ݱ��� ��� �� ���
						if(i==money.length-1) {
							rem=mon/money[i];
							tf[i].setText(Integer.toString(rem));
							break;
						}
						if(!ch[i].isSelected()) {
							tf[i].setText("0");
							continue;
						}
						
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
					
					for (int i = 0; i < ch.length; i++) {
						ch[i].setSelected(true);
					}
				}
			});
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}

}
