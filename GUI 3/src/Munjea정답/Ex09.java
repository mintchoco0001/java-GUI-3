package Munjea정답;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex09 extends JFrame {
	private ImageIcon[] gbbImage = { new ImageIcon("src/images/gawi.jpg"), new ImageIcon("src/images/bawi.jpg"),
			new ImageIcon("src/images/bo.jpg") };
	private static String SAME = "Same !!!";
	private static String ME_WINNER = "ME !!!";
	private static String COM_WINNER = "Computer !!!";

	private MenuPanel menuPanel = new MenuPanel();
	private GamePanel gamePanel = new GamePanel();

	public Ex09() {
		super("���� ���� �� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		add(menuPanel, BorderLayout.NORTH);
		add(gamePanel, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
	}

	class MenuPanel extends JPanel {
		private JButton[] gbbBtn = new JButton[3];

		public MenuPanel() {
			setBackground(Color.GRAY);
			for (int i = 0; i < gbbBtn.length; i++) {
				gbbBtn[i] = new JButton(gbbImage[i]);
				add(gbbBtn[i]);

				gbbBtn[i].addActionListener(new MyActionListener());
			}
		}
	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			int computerPart = (int) (Math.random() * 3); // 0~2;

			String winner = SAME;

			// 0 : ����  1 : ���� 2 : �� 
			if (btn.getIcon() == gbbImage[0] && computerPart == 2 || btn.getIcon() == gbbImage[1] && computerPart == 0
					|| btn.getIcon() == gbbImage[2] && computerPart == 1)
				winner = ME_WINNER;
			else if (btn.getIcon() == gbbImage[0] && computerPart == 1
					|| btn.getIcon() == gbbImage[1] && computerPart == 2
					|| btn.getIcon() == gbbImage[2] && computerPart == 0)
				winner = COM_WINNER;
			else
				winner = SAME;

			gamePanel.draw(btn.getIcon(), gbbImage[computerPart], winner);
		}
	}

	class GamePanel extends JPanel {
		private JLabel me = new JLabel("me");
		private JLabel computer = new JLabel("com");
		private JLabel winner = new JLabel("Winner");

		public GamePanel() {
			setBackground(Color.YELLOW);
			add(me);
			add(computer);
			add(winner);
			winner.setForeground(Color.RED);
		}

		public void draw(Icon myImage, Icon computerImage, String w) {
			me.setIcon(myImage);
			computer.setIcon(computerImage);
			winner.setText(w);

		}
	}

	public static void main(String[] args) {
		new Ex09();
	}

}
