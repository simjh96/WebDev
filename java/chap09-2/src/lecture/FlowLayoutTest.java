package lecture;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {
	public FlowLayoutTest() {
		this.setSize(500, 300);
		this.setVisible(true);
		this.setTitle("Flow Layout ¿¬½À");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("-"));
		contentPane.add(new JButton("*"));
		contentPane.add(new JButton("/"));
		add(new JButton("/"));
		
	}
	public static void main(String[] args) {
		FlowLayoutTest flowLayout = new FlowLayoutTest();
	}
}
