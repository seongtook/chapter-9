import java.awt.*;
import javax.swing.*;

public class TenButtonFrame extends JFrame {
	public TenButtonFrame() {
		super("Ten Buttons Frame"); //������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ������ ���α׷� ����
		
		Container c = getContentPane(); //����Ʈ ���� �˾Ƴ���.
		c.setLayout(new GridLayout(1, 10));
		
		JButton [] btn = new JButton [10]; //1~10��ư
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, }; // 0���� 9���� ���� �ο���.
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]); // ��ư���� ���� ���� �ο�
			c.add(btn[i]);
		}
		setSize(500,200); //�������� ũ�� 500x200
		setVisible(true); // ������ ���
	}
	public static void main(String[] args) {
		new TenButtonFrame();
	}
}
