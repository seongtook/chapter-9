import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Practice"); // ������ Ÿ��Ʋ�̴�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ���� ����
		Container c = getContentPane(); //����Ʈ ���� �˾Ƴ�
		
		c.setLayout(new BorderLayout(5, 7)); // ����Ʈ�ҿ� BorderLayout ��ġ������ ���� ���� ���� ������ ���� 5�ȼ� 7�ȼ�.
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		
		setSize(300, 200); // ������ ũ�� 300x200 ����
		setVisible(true); // �������� ȭ�鿡 ���
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
