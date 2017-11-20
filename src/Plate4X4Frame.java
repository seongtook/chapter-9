import java.awt.*;
import javax.swing.*;

public class Plate4X4Frame extends JFrame { //Plate4x4Frame 패널
	public Plate4X4Frame() {
		super("4X4 Color Frame"); // 프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫으면 프로그램 종료
		
		Container c = getContentPane();// 컨텐트 팬을 알아냄
		c.setLayout(new GridLayout(4, 4)); //4X4 GridLayout 배치관리자 생성
		
		JLabel [] label = new JLabel [16]; //16개의 라벨 생성
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA}; // 라벨 각각 색깔 부여

		for(int i=0; i<label.length; i++) { 
			label[i] = new JLabel(Integer.toString(i)) ; //라벨을 생성
			label[i].setOpaque(true); //배경색
			label[i].setBackground(color[i]); //라벨 각각 색깔 부여
			c.add(label[i]); //버튼을 라벨에 붙임
		}
		setSize(500,200); // 프레임 크기 500x200 설정
		setVisible(true); //프레임을 화면에 출력
	}
	public static void main(String[] args) {
		new Plate4X4Frame();
	}
}