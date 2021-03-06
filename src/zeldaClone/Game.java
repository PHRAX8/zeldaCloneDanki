package zeldaClone;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	
	public static int WIDTH = 400, HEIGHT = 300;
	
	public Game() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame();
		
		frame.add(game);
		frame.setTitle("Zelda Clone");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		new Thread(game).start();
	}
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("Lambda");
		}
		
	}
	
}
