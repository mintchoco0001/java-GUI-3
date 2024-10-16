package Munjea정답;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex01 extends JFrame {

	private JCheckBox chbox1 = new JCheckBox("��ư ��Ȱ��ȭ");
	private JCheckBox chbox2 = new JCheckBox("��ư ���߱�");
	private JButton btn = new JButton("test button");

	public Ex01() {
		setTitle("CheckBox Ex");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(chbox1);
		c.add(chbox2);
		c.add(btn);

		chbox1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});

		chbox2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btn.setVisible(false);
				} else {
					btn.setVisible(true);
				}
			}
		});
		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex01();
	}

}
