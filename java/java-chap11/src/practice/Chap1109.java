package practice;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Chap1109 extends JFrame {
	private JRadioButton radio = new JRadioButton();
	private JLabel image;
	public Chap1109() {
		Container contentPane = this.getContentPane();
		
		JPanel imagePanel = new JPanel(new FlowLayout());
		JRadioButton rockBtn = new JRadioButton(new ImageIcon("images/baseline_settings_black_24dp.png"));
		JRadioButton scissorBtn = new JRadioButton(new ImageIcon("images/baseline_home_black_24dp.png"));
		JRadioButton paperBtn = new JRadioButton(new ImageIcon("images/baseline_account_circle_black_24dp.png"));

		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(rockBtn);
		radioGroup.add(scissorBtn);
		radioGroup.add(paperBtn);
		
		imagePanel.add(rockBtn);
		imagePanel.add(scissorBtn);
		imagePanel.add(paperBtn);
		
		this.add(imagePanel);
		
		this.setSize(500, 500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Chap1109();
	}
}
