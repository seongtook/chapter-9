import java.awt.*;
import javax.swing.*;

public class TenButtonFrame extends JFrame {
	public TenButtonFrame() {
		super("Ten Buttons Frame"); //프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 닫으면 프로그램 종료
		
		Container c = getContentPane(); //컨텐트 팬을 알아낸다.
		c.setLayout(new GridLayout(1, 10));
		
		JButton [] btn = new JButton [10]; //1~10버튼
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, }; // 0부터 9까지 색깔 부여함.
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]); // 버튼마다 각각 색깔 부여
			c.add(btn[i]);
		}
		setSize(500,200); //프레임의 크기 500x200
		setVisible(true); // 프레임 출력
	}
	public static void main(String[] args) {
		new TenButtonFrame();
	}
}
