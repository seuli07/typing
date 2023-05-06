package com.screen;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class Setting {
	public static JPanel panel = new JPanel();
	private static ButtonGroup group = new ButtonGroup();
	private static JRadioButton normalTheme, lightTheme, darkTheme;
	private static JLabel setting = new JLabel("Setting");
	private static JButton backBtn;
	private static JCheckBox soundOut;
	private static JSlider soundSize;
	public static void build() {
		panel.setLayout(null);
		
		backBtn = new JButton();
		
		group.add(normalTheme);
		group.add(lightTheme);
		group.add(darkTheme);
		
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0,0,640,360);
		panel.setVisible(false);
	}
}
