package com.swing.in;

import javax.swing.*;
public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton("Click");
		b.setBounds(130, 100, 100, 40);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
