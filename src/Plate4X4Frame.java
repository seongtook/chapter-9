import java.awt.*;
import javax.swing.*;

public class Plate4X4Frame extends JFrame { //Plate4x4Frame �г�
	public Plate4X4Frame() {
		super("4X4 Color Frame"); // ������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ������ ���α׷� ����
		
		Container c = getContentPane();// ����Ʈ ���� �˾Ƴ�
		c.setLayout(new GridLayout(4, 4)); //4X4 GridLayout ��ġ������ ����
		
		JLabel [] label = new JLabel [16]; //16���� �� ����
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA}; // �� ���� ���� �ο�

		for(int i=0; i<label.length; i++) { 
			label[i] = new JLabel(Integer.toString(i)) ; //���� ����
			label[i].setOpaque(true); //����
			label[i].setBackground(color[i]); //�� ���� ���� �ο�
			c.add(label[i]); //��ư�� �󺧿� ����
		}
		setSize(500,200); // ������ ũ�� 500x200 ����
		setVisible(true); //�������� ȭ�鿡 ���
	}
	public static void main(String[] args) {
		new Plate4X4Frame();
	}
}