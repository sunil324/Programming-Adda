package com.swing.in;

import javax.swing.*;
public class ImageButton {
	ImageButton(){
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton(new ImageIcon("C:\\IMG_20201107_212843_105.jpg"));
		b.setBounds(100, 100, 100, 40);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageButton();

	}

}
