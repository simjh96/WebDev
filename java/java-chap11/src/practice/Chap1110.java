package practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Numb extends JLabel{
	public Numb(int i, int width, int height) {
		super(Integer.toString(i));
		double x = Math.random()*width;
		double y = Math.random()*height;
	}
}

public class Chap1110 extends JFrame{
	public int width = 500;
	public int height = 500;
	
	public Chap1110() {
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		Numb n = new Numb(1, width, height);
		
		contentPane.add(n);
		this.setSize(width, height);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Chap1110();
	}
}
