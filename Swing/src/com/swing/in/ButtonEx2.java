package com.swing.in;

import java.awt.event.ActionEvent;

import java.awt.event.*;
import javax.swing.*;
public class ButtonEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Button Example");
		final JTextField tf=new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton b=new JButton("Click Here");
		b.setBounds(130, 100, 100, 50);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Welcome ");
		
				
			}
		});
		
		f.add(b);
		f.add(tf);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
