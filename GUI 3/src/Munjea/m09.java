package Munjea;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
public class m09 extends JFrame{
	public m09() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	}
	
	public static void main(String[] args) {
		new m09();
	}
}
