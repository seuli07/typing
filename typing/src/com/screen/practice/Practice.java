package com.screen.practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.screen.Start;

public class Practice {
	public static JPanel panel = new JPanel();
	private static JLabel practice = new JLabel("Practice");
	private static JButton backBtn, wordBtn, shortBtn, longBtn;
	public static void build() {
		panel.setLayout(null);
		
		backBtn = new JButton();
		wordBtn = new JButton("Word");
		shortBtn = new JButton("<html>Short<br/>Sentence</html>");
		longBtn = new JButton("<html>Long<br/>Sentence</html>");
		
		practice.setFont(new Font("D2Coding", Font.PLAIN, 40));
		
		Font btnFont = new Font("D2Coding", Font.PLAIN, 15);
		Color btnColor = new Color(230, 230, 230);
		backBtn.setPreferredSize(new Dimension(30, 30));
		backBtn.setBackground(btnColor);
		wordBtn.setPreferredSize(new Dimension(100, 100));
		wordBtn.setBackground(btnColor);
		wordBtn.setFont(btnFont);
		shortBtn.setPreferredSize(new Dimension(100, 100));
		shortBtn.setBackground(btnColor);
		shortBtn.setFont(btnFont);
		longBtn.setPreferredSize(new Dimension(100, 100));
		longBtn.setBackground(btnColor);
		longBtn.setFont(btnFont);
		
		backBtn.addActionListener(e -> {
			panel.setVisible(false);
			Start.panel.setVisible(true);
		});
		wordBtn.addActionListener(e -> {
			panel.setVisible(false);
		});
		shortBtn.addActionListener(e -> {
			panel.setVisible(false);
		});
		longBtn.addActionListener(e -> {
			panel.setVisible(false);
		});
		
		practice.setBounds(240, 30, 250, 50);
		wordBtn.setBounds(120, 130, 100, 100);
		shortBtn.setBounds(270, 130, 100, 100);
		longBtn.setBounds(420, 130, 100, 100);
		backBtn.setBounds(10, 10, 30, 30);
		
		panel.add(practice);
		panel.add(wordBtn);
		panel.add(shortBtn);
		panel.add(longBtn);
		panel.add(backBtn);
		
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0,0,640,360);
		panel.setVisible(false);
	}
}
