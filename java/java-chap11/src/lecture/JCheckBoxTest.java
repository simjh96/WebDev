package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxTest extends JFrame{
	private JLabel sumLabel;
	private ArrayList fruits = new ArrayList();
	
	public JCheckBoxTest() {
		this.setTitle("check box test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		ImageIcon appleIcon = new ImageIcon("images/baseline_settings_black_24dp.png");
		ImageIcon berryIcon = new ImageIcon("images/baseline_home_black_24dp.png");
		ImageIcon cherryIcon = new ImageIcon("images/baseline_account_circle_black_24dp.png");
		
		JCheckBox apple = new JCheckBox(appleIcon);
		JCheckBox berry = new JCheckBox(berryIcon);
		JCheckBox lemon = new JCheckBox(cherryIcon);
		
		contentPane.add(new JLabel("사과: 5000 / 딸기: 7000 / 레몬: 3000"));
		
		contentPane.add(apple);
		contentPane.add(berry);
		contentPane.add(lemon);
		
		fruits.add(apple);
		fruits.add(berry);
		fruits.add(lemon);
		
		MyItemListener listener = new MyItemListener();
		
		for (int i=0; i<3; i++) {
			JCheckBox checkBox = (JCheckBox) fruits.get(i);
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
		new JCheckBoxTest();
	}
}
