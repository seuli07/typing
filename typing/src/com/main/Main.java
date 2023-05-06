package com.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.screen.History;
import com.screen.Setting;
import com.screen.Start;
import com.screen.practice.Practice;
import com.screen.test.Test;

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
		add(Practice.panel);
		add(Test.panel);
		add(History.panel);
		add(Setting.panel);
		setJMenuBar(History.menubar);
		
		Start.panel.setVisible(true);
		
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					if (Start.panel.isVisible()) System.exit(0);	
					else if (Practice.panel.isVisible() || Test.panel.isVisible() || History.panel.isVisible() || Setting.panel.isVisible()) {
						Start.panel.setVisible(true);
						Practice.panel.setVisible(false);
						Test.panel.setVisible(false);
						History.panel.setVisible(false);
						Setting.panel.setVisible(false);
						History.menubar.setVisible(false);
					} else {
						System.out.println(1);
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
		Practice.build();
		Test.build();
		History.build();
		Setting.build();
		new Main();
	}
}
