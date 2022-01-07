package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;

public class JListTest extends JFrame {
	private String fruits[] = {"apple","berry","lemon","kiwi","banana","peach"};
	public JListTest() {
		this.setTitle("test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JList<String> list01 = new JList<>(fruits);
		contentPane.add(list01);
		
		this.setSize(280, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JListTest();
	}
}
