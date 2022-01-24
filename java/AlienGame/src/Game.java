import java.awt.Graphics;

public class Game extends Thread {
	public int threadDelay = 20;   // 전체 화면 랜더링 속도
	public Player player = new Player(600, 700, 100);   // player 생성
	
	public Game() {
		start(); // start thread
		
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(threadDelay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void drawPlayer(Graphics g) {
		g.drawImage(player.image, player.x, player.y, null);
	}

}
