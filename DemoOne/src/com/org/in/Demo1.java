package com.org.in;



class Animal{
	void eat() {
		System.out.println("Eating:");
	}
	
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking:");
	}
}

class BabyDog extends Animal{
	void weep() {
		System.out.println("Weeping:");
	}
}






public class Demo1 {

	public static void main(String args[]) {
	
		BabyDog dog=new BabyDog();
		dog.eat();
		dog.weep();
	}
}