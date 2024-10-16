package GUI;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
public class JFTest extends JFrame {

	JFTest(){
		//창 크기 설정
		setSize(1280,860);
		//창 이름 설정
		setTitle("안녕?");
		
		
		//버튼 ( 컴포넌트 붙이기 )
//		JButton btn = new JButton("버튼임");
//		JPanel jp = new JPanel();
//		add(jp);
//		jp.add(btn);
		
		Container c = getContentPane();
		JButton jb = new JButton("click");
		JPanel jp = new JPanel();
		jp.add(jb);
		c.add(jp);
		
		
		
		
		//닫기 누르면 프로그램 종료되도록
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창을 보이게 할지 안보이게 할지
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFTest();
		//사용법 2가지
		//상속받아 사용 할 수도 있고
		//new 키워드로 생성해서 사용 할 수도 있다
		
		
	}

}
