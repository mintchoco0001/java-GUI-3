package Munjea정답;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;

public class Ex08 extends JFrame {
	
	private JTextArea jt=new JTextArea(5, 10);
	private JSlider sl=new JSlider(0, 100, 0);
	public Ex08() {
		setTitle("8�� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		
		c.add(new JScrollPane(jt),BorderLayout.NORTH);
		c.add(sl, BorderLayout.CENTER);
		
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int len=jt.getText().length();
				if(len>=100) {
						try {
							jt.setText(jt.getText(0,100));
						} catch (BadLocationException e1) {		}
				}
				sl.setValue(len);
			}
		});
		
		sl.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				if(jt.getText().length() <= sl.getValue()) {
					sl.setValue(jt.getText().length());
				}else {
					try {
						jt.setText(jt.getText(0, sl.getValue()));
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
				}
					
			}
		});
			
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}
}
