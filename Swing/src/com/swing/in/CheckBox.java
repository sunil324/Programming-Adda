package com.swing.in;

import javax.swing.*;

public class CheckBox {

	CheckBox(){
		JFrame f= new JFrame("Checkbox example:");
		JCheckBox checkbox1=new JCheckBox("C++");
		checkbox1.setBounds(100, 100, 50, 50);
		JCheckBox checkbox2=new JCheckBox("JAVA");
		checkbox1.setBounds(100, 150, 50, 50);
		f.add(checkbox1);
		f.add(checkbox2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBox();
	}

}
