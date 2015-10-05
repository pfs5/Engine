package hr.patrik;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Engine extends JFrame {
	 
	public enum STATE {
		GAME,
		PAUSE,
		END
	}
	
	private final int WIDTH = 500;
	private final int HEIGHT = 800;
	private final String title = "Title";
	
	public Engine() {
		add(new Game(WIDTH, HEIGHT));
		setSize(WIDTH,HEIGHT);
		setResizable(false);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main (String [] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Engine game = new Engine();
				game.setVisible(true);
			}
		});
	}

}
