import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	// 그림 그리기
	private Image bufferImage;
	private Graphics screenGraphics;
	private Game game;
	
	GamePanel() {
		this.setPreferredSize(new Dimension(1200, 800));
		this.setBackground(Color.BLACK);		
	}
	public void gameInit() {
		game = new Game();
	}
	public void paintComponent(Graphics g) {
		// double buffering 기법 : 1. create buffer image -> 2. on memory -> 3. draw as graphics
		bufferImage = this.createImage(1200, 800);
		screenGraphics = bufferImage.getGraphics();
		screenCapture(screenGraphics);
		g.drawImage(bufferImage, 0, 0, null);
	}
	public void screenCapture(Graphics g) {
		game.drawPlayer(g);
	}
}
