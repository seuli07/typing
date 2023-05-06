package com.screen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.screen.practice.Practice;
import com.screen.test.Test;

public class Start {
	public static JPanel panel = new JPanel();
	private static JLabel typing = new JLabel("Typing");
	private static JButton practiceBtn, testBtn, historyBtn, settingBtn, quitBtn;
	public static void build() {
		panel.setLayout(null);
		
		practiceBtn = new JButton("Practice");
		testBtn = new JButton("Test");
		historyBtn = new JButton("History");
		settingBtn = new JButton();
		quitBtn = new JButton();
		
		typing.setFont(new Font("D2Coding", Font.PLAIN, 40));
		
		Font btnFont = new Font("D2Coding", Font.PLAIN, 15);
		Color btnColor = new Color(230, 230, 230);
		practiceBtn.setPreferredSize(new Dimension(100, 100));
		practiceBtn.setBackground(btnColor);
		practiceBtn.setFont(btnFont);
		testBtn.setPreferredSize(new Dimension(100, 100));
		testBtn.setBackground(btnColor);
		testBtn.setFont(btnFont);
		historyBtn.setPreferredSize(new Dimension(100, 100));
		historyBtn.setBackground(btnColor);
		historyBtn.setFont(btnFont);
		settingBtn.setPreferredSize(new Dimension(30, 30));
		settingBtn.setBackground(btnColor);
		quitBtn.setPreferredSize(new Dimension(30, 30));
		quitBtn.setBackground(btnColor);
		
		practiceBtn.addActionListener(e -> {
			panel.setVisible(false);
			Practice.panel.setVisible(true);
		});
		testBtn.addActionListener(e -> {
			panel.setVisible(false);
			Test.panel.setVisible(true);
		});
		historyBtn.addActionListener(e -> {
			panel.setVisible(false);
			History.menubar.setVisible(true);
			History.panel.setVisible(true);
		});
		settingBtn.addActionListener(e -> {
			panel.setVisible(false);
		});
		quitBtn.addActionListener(e -> System.exit(0));
		
		typing.setBounds(260, 30, 250, 50);
		practiceBtn.setBounds(120, 130, 100, 100);
		testBtn.setBounds(270, 130, 100, 100);
		historyBtn.setBounds(420, 130, 100, 100);
		settingBtn.setBounds(550, 287, 30, 30);
		quitBtn.setBounds(590, 287, 30, 30);

		panel.add(typing);
		panel.add(practiceBtn);
		panel.add(testBtn);
		panel.add(historyBtn);
		panel.add(settingBtn);
		panel.add(quitBtn);
		
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0,0,640,360);
		panel.setVisible(false);
	}
}
