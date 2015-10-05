package hr.patrik;


import hr.patrik.Engine.STATE;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener{

	private int WIDTH;
	private int HEIGHT;
	private int DELAY = 3;
	
	Timer timer;
	
	private STATE state;

	public Game(int WIDTH, int HEIGHT) {
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		initBoard();
	}

	public void initBoard () {
		//Necessary part
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);

		timer = new Timer(DELAY, this);
		timer.start();

		initGame();
	}

	public void initGame () {
	}

	////////////////////////////	DRAWING		///////////////////////////
	@Override
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;

		if (state == STATE.GAME)
			paintGame(g2d);
	}

	public void paintGame (Graphics2D g2d) {
	}

	////////////////////////////	PERIODIC ACTION		//////////////////
	@Override
	public void actionPerformed (ActionEvent e) {
		repaint();
	}

	///////////////////////////		KEY LISTENER		//////////////////
	private class TAdapter extends KeyAdapter {

		@Override
		public void keyReleased (KeyEvent e) {
		}

		@Override
		public void keyPressed (KeyEvent e) {
		}
	}

}
