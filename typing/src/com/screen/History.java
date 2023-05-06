package com.screen;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class History {
	public static JPanel panel = new JPanel();
	public static JMenuBar menubar = new JMenuBar();
	private static JMenu speed, accuracy, time;
	private static JMenuItem speedLow, speedHigh, speedAll, accuracyLow, accuracyHigh, accuracyAll, playTime;
	public static void build() {
		panel.setLayout(null);
		
		speed = new JMenu("Speed");
		accuracy = new JMenu("Accuracy");
		time = new JMenu("Time");
		
		speedLow = new JMenuItem("Low");
		speedHigh = new JMenuItem("High");
		speedAll = new JMenuItem("All");
		accuracyLow = new JMenuItem("Low");
		accuracyHigh = new JMenuItem("High");
		accuracyAll = new JMenuItem("All");
		playTime = new JMenuItem("PlayTime");
		
		speed.add(speedLow);
		speed.add(speedHigh);
		speed.add(speedAll);
		accuracy.add(accuracyLow);
		accuracy.add(accuracyHigh);
		accuracy.add(accuracyAll);
		time.add(playTime);
		
		speedLow.addActionListener(e -> {
			System.out.println(1);
		});
		speedHigh.addActionListener(e -> {
			
		});
		speedAll.addActionListener(e -> {
			
		});
		accuracyLow.addActionListener(e -> {
			
		});
		accuracyHigh.addActionListener(e -> {
			
		});
		accuracyAll.addActionListener(e -> {
			
		});
		playTime.addActionListener(e -> {
			
		});
		
		menubar.add(speed);
		menubar.add(accuracy);
		menubar.add(time);
		
		panel.add(menubar);
		
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0,0,640,360);
		menubar.setVisible(false);
		panel.setVisible(false);
	}	
}
