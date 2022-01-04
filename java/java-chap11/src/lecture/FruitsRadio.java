package lecture;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FruitsRadio extends JFrame{
	private JLabel sumLabel;
	private ArrayList fruits = new ArrayList();
	private JLabel imageLabel = new JLabel();
	
	public FruitsRadio() {
		this.setTitle("check box test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());		
		
		ImageIcon appleIcon = new ImageIcon("images/baseline_settings_black_24dp.png");
		ImageIcon berryIcon = new ImageIcon("images/baseline_home_black_24dp.png");
		ImageIcon cherryIcon = new ImageIcon("images/baseline_account_circle_black_24dp.png");
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton berry = new JRadioButton("딸기");
		JRadioButton lemon = new JRadioButton("레몬");
		
		JPanel radioPanel = new JPanel();
		radioPanel.add(apple);
		radioPanel.add(berry);
		radioPanel.add(lemon);
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(apple);
		radioGroup.add(berry);
		radioGroup.add(lemon);
		
		contentPane.add(radioPanel, BorderLayout.NORTH);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		contentPane.add(new JLabel("사과: 5000 / 딸기: 7000 / 레몬: 3000"));
		
		fruits.add(apple);
		fruits.add(berry);
		fruits.add(lemon);
		
		MyItemListener listener = new MyItemListener();
		
		for (int i=0; i<3; i++) {
			JRadioButton checkBox = (JRadioButton) fruits.get(i);
			checkBox.setBorderPainted(true);
			checkBox.addItemListener(listener);
		}
		
		sumLabel = new JLabel("====== price: 0 ======");
		contentPane.add(sumLabel);
		
		this.setSize(250, 300);
		this.setVisible(true);		
	}
	
	class MyItemListener implements ItemListener {
		private int sum = 0;
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == fruits.get(1)) {sum+=5000;} else if (e.getItem() == fruits.get(2)) {sum+=7000;} else {sum+=3000;}
			} else {
				if (e.getItem() == fruits.get(1)) {sum-=5000;} else if (e.getItem() == fruits.get(2)) {sum-=7000;} else {sum-=3000;}
			}
			sumLabel.setText("======price: "+sum+" ======");
		}
		
	}
	
	public static void main(String[] args) {
		new FruitsRadio();
	}
}
