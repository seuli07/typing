package com.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.screen.Start;

public class Main extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static boolean shiftPressed;
	Main(){
		setTitle("Typing");
		setSize(640, 360);
		setLocation(500,500);
		setLayout(null);
		
		add(Start.panel);
		
		Start.panel.setVisible(true);
		
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					if (Start.panel.isVisible()) System.exit(0);	
					else {
						Start.panel.setVisible(true);
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
			
		});
		setFocusable(true);
		requestFocus();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Start.build();
		new Main();
	}
}
