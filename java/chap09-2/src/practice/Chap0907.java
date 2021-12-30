package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NorthPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NorthPanel() {
		this.setLayout(new FlowLayout());
		this.setOpaque(true);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(new JLabel("수식입력"));
		this.add(new JTextField(16));
	}
}

class CenterPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CenterPanel() {
		String marks[] = {"+","-","*","/"};
		this.setLayout(new GridLayout(4,4,10,10));
		for(int i=0;i<4;i++) {
			JButton btns = new JButton(marks[i]);
			btns.setOpaque(true);
			btns.setBackground(Color.green);
			this.add(btns);
		}
		this.add(new JButton("CE"));
		this.add(new JButton("계산"));
	}
}

class SouthPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SouthPanel() {
		this.setLayout(new FlowLayout());
		this.setOpaque(true);
		this.setBackground(Color.ORANGE);
		this.add(new JLabel("계산결과"));
		this.add(new JTextField(16));
	}
}

public class Chap0907 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Chap0907() {
		this.setTitle("계산기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		NorthPanel northPanel = new NorthPanel();
		CenterPanel centerPanel = new CenterPanel();
		SouthPanel southPanel = new SouthPanel();
		
		contentPane.add(northPanel, BorderLayout.NORTH);		
		contentPane.add(centerPanel, BorderLayout.CENTER);
		contentPane.add(southPanel, BorderLayout.SOUTH);

		this.setSize(300, 300);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Chap0907();
	}

}
