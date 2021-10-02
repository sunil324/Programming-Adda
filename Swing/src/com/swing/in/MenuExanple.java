package com.swing.in;

import javax.swing.*;
import java.awt.event.*;
public class MenuExanple implements ActionListener {
	JFrame f;
	JMenuBar mb;
	JMenu file,edit,help;
	JMenuItem cut,copy,paste,selectAll;
	JTextArea a;
	
	 MenuExanple(){
		 f=new JFrame();
		 cut=new JMenuItem("cut");
		 copy=new JMenuItem("copy");
		 paste=new JMenuItem("paste");
		 selectAll=new JMenuItem("selectAll");
		 cut.addActionListener(this);
		 copy.addActionListener(this);
		 paste.addActionListener(this);
		 selectAll.addActionListener(this);
		 mb=new JMenuBar();
		 file=new JMenu("file");
		 edit=new JMenu("edit");
		 help=new JMenu("help");
		 
		 edit.add(cut);
		 edit.add(copy);
		 edit.add(paste);
		 edit.add(selectAll);
		 
		 mb.add(file);
		 mb.add(edit);
		 mb.add(help);
		 
		 a=new JTextArea();
		 a.setBounds(5, 5, 360, 320);
		 f.add(mb);
		 f.add(a);
		 f.setJMenuBar(mb);
		 f.setLayout(null);
		 f.setSize(400, 400);
		 f.setVisible(true);
		 
		 
		 
		 
		 
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub if(e.getSource()==cut)
		 a.cut();
	 if(e.getSource()==paste)
		 a.paste();
	 if(e.getSource()==copy)
		 a.copy();
	 if(e.getSource()==selectAll)
		 a.selectAll();
	
		
	}
	 public static void main(String[] args ) {
		 new MenuExanple();
	 }
	
	
	

}
