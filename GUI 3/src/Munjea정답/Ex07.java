package Munjea정답;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex07 extends JFrame{

	private JSlider sl;
	private JLabel la=new JLabel("I Love Java");
	public Ex07() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		sl=new JSlider(1, 100, 50);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		c.add(sl,BorderLayout.NORTH);
		c.add(la, BorderLayout.CENTER);
		
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("����",Font.PLAIN,sl.getValue()));
		
		sl.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				la.setFont(new Font("����",Font.PLAIN,sl.getValue()));
			}
		});
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}

}
