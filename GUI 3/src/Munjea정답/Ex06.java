package Munjea정답;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex06 extends JFrame{

	private JSlider sl=new JSlider(0, 200, 100);
	private JLabel la=new JLabel();
	
	public Ex06() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		sl.setMajorTickSpacing(50);
		sl.setPaintLabels(true);
		c.add(sl);
		
		la.setOpaque(true);
		la.setBackground(Color.green);
		la.setText(Integer.toString(sl.getValue()));
		c.add(la);
		
		sl.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				la.setText(Integer.toString(sl.getValue()));
			}
		});
		
		setSize(350,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex06();
	}

}
