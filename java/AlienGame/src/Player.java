import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	// 비행기
	// x, y : 좌표 설정
	// width, height
	// speedX, speedY
	// hp
	// score
	// shootDelay
	// image
	
	public Image image = new ImageIcon("images/space-ship.png").getImage();
	public int x;
	public int y;
	public int width = image.getWidth(null);
	public int height = image.getWidth(null);
	public int speedX = 10;
	public int speedY = 10;
	public int hp = 100;
	public int score = 0;
	public int shootDelay = 5;
	
	Player(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
		

}
