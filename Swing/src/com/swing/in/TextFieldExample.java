package com.swing.in;
import javax.swing.*;

public class TextFieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("TextField");
		JTextField t1,t2;
		t1=new JTextField("Welcome to javaTpoint");
		t1.setBounds(50, 100, 200, 30);
		t2=new JTextField("AWT");
		t2.setBounds(50, 150, 200, 30);
		f.add(t1);
		f.add(t2);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
