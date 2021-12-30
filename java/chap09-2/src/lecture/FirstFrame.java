package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame extends JFrame{
	public FirstFrame() {
		setSize(300, 300);
		setVisible(true);
		setTitle("my first frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout((LayoutManager) new FlowLayoutTest());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("CLICK"));
	}
	public static void main(String[] args) {
		FirstFrame myFrame = new FirstFrame();
	}
}
