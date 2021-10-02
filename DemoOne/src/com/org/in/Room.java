package com.org.in;



interface printable{
	 void print();
	 
	 static int cube(int x)
	 {
		 return x*x*x;
	 }
}
showable implements printable{
	public void print() {
		System.out.println("printing:");
	}
}

 
public class Room {

	
	public static void main(String args[]) {
		
	printable ab=new showable();
	ab.print();
	System.out.println(printable.cube(3));
		
		
		
		
		
		
}
}