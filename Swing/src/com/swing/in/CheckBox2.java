package com.swing.in;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class CheckBox2 extends JFrame implements ActionListener {
	JLabel l;
	JCheckBox cb1,cb2,cb3;
	JButton b;
	CheckBox2(){
		l=new JLabel("Food Ordering System");
		l.setBounds(50, 50, 300, 20);
		cb1=new JCheckBox("Pizz@100");
		cb1.setBounds(100, 100, 150, 20);
		cb2=new JCheckBox("Burger@30");
		cb2.setBounds(100, 150, 150, 20);
		cb3=new JCheckBox("Tea@10");
		cb3.setBounds(100, 250, 150, 20);
		b=new JButton("Order");
		b.setBounds(100, 250, 80, 30);
		b.addActionListener(this);
		add(l);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		float amount=0;
		String msg="";
		if(cb1.isSelected()) {
			amount+=100;
			msg="Pizz:100\n";
		}
		if(cb2.isSelected()) {
			amount+=30;
			msg+="burger:30\n";
		}
		if(cb3.isSelected()) {
			amount+=10;
			msg+="Tea:100\n";
		
		}
		msg+="---------\n";
		JOptionPane.showMessageDialog(this,msg+"Total:"+amount);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBox2();
	}

}
