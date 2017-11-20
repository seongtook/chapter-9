import javax.swing.*;
import java.awt.*;
import java.util.*;



public class RandomLabels extends JFrame { //RandomLabels �г�
	public RandomLabels() {
		super("Random Labels"); // ������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ������ ���α׷� ����
		
		Container c = getContentPane();// ����Ʈ ���� �˾Ƴ�
		c.setLayout(null);
		
		JLabel label = new JLabel("");
		
		for(int i=0; i<20; i++) { // 1~20 �� ����
		int x = (int)(Math.random()*200) + 50; // 50~250
		int y = (int)(Math.random()*200) + 50; // 50~250
		label = new JLabel(Integer.toString(i)) ; //�� ����
		label.setBackground(Color.BLUE); // �Ķ��� ������ ����
		label.setLocation(x,y); // label��  (x,y)�� ��ġ��.
		label.setSize(10,10); //label ũ�� 10x10
		label.setOpaque(true); //label�� ���� ����
		c.add(label); //��ư�� �󺧿� ����
		}
		setSize(300,300); // ������ ũ�� 300x300 ����
		setVisible(true); //�������� ȭ�鿡 ��·�
	}
	public static void main(String[] args) {
		new RandomLabels();
	}
}
