import javax.swing.*;
import java.awt.*;
import java.util.*;



public class RandomLabels extends JFrame { //RandomLabels 패널
	public RandomLabels() {
		super("Random Labels"); // 프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 닫으면 프로그램 종료
		
		Container c = getContentPane();// 컨텐트 팬을 알아냄
		c.setLayout(null);
		
		JLabel label = new JLabel("");
		
		for(int i=0; i<20; i++) { // 1~20 라벨 생성
		int x = (int)(Math.random()*200) + 50; // 50~250
		int y = (int)(Math.random()*200) + 50; // 50~250
		label = new JLabel(Integer.toString(i)) ; //라벨 생성
		label.setBackground(Color.BLUE); // 파란색 색깔을 넣음
		label.setLocation(x,y); // label을  (x,y)에 배치함.
		label.setSize(10,10); //label 크기 10x10
		label.setOpaque(true); //label에 배경색 삽입
		c.add(label); //버튼을 라벨에 삽입
		}
		setSize(300,300); // 프레임 크기 300x300 설정
		setVisible(true); //프레임을 화면에 출력력
	}
	public static void main(String[] args) {
		new RandomLabels();
	}
}
