package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderTest extends JFrame{
	private JSlider sliderList[] = new JSlider[3];
	private JLabel colorLabel = new JLabel("slider change BG");
	public JSliderTest() {
		this.setTitle("check box test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());				
		
		for (int i = 0; i < sliderList.length; i++) {
			sliderList[i] = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
			sliderList[i].setPaintLabels(true);
			sliderList[i].setPaintTicks(true);
			sliderList[i].setMajorTickSpacing(50);
			sliderList[i].setMinorTickSpacing(10);
			contentPane.add(sliderList[i]);
			sliderList[i].addChangeListener(new ChangeListener() {	
				@Override
				public void stateChanged(ChangeEvent e) {
					int r = sliderList[0].getValue();
					int g = sliderList[1].getValue();
					int b = sliderList[2].getValue();
					colorLabel.setBackground(new Color(r,g,b));
				}
			});
		}
		contentPane.add(colorLabel);
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(128,128,128));
		colorLabel.setForeground(Color.WHITE);
		
		this.setSize(250, 300);
		this.setVisible(true);	
	}
	public static void main(String[] args) {
		new JSliderTest();
	}
}
