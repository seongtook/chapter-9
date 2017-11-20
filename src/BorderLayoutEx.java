import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Practice"); // 프레임 타이틀이다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 끄면 종료
		Container c = getContentPane(); //컨텐트 팬을 알아냄
		
		c.setLayout(new BorderLayout(5, 7)); // 컨텐트팬에 BorderLayout 배치관리자 설정 수평 수직 간격이 각각 5픽셀 7픽셀.
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		
		setSize(300, 200); // 프레임 크기 300x200 설정
		setVisible(true); // 프레임을 화면에 출력
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
