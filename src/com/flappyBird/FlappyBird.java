package com.flappyBird;

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class FlappyBird implements ActionListener {
	
	
	public final int WIDTH =  800, HEIGHT = 800;
	
	public Renderer renderer;
	
	
	// Constructor creates jframe and renderer
	public FlappyBird() {
		
		JFrame jframe = new JFrame();
		
		renderer = new Renderer();
		
		Timer timer = new Timer(20, this);
		
		jframe.add(renderer);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		timer.start();

		
	}

	
	
	public void repaint(Graphics g) {
		
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {

		renderer.repaint();
		
	}
}
