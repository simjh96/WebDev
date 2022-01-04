package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextFieldTest extends JFrame{
	public JTextFieldTest() {
		this.setTitle("체크박스 테스트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextArea("이름", 5, 20));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextArea("이름", 5, 20));
		contentPane.add(new JLabel("주소"));
		contentPane.add(new JScrollPane(new JTextArea("주소", 5, 20)));
		
		this.setSize(280, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}
