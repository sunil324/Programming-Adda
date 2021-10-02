package com.lu2code.mycoolapp;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	int a;
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter an Integer:");
    	
    	
       a=sc.nextInt();
       
       if(a%2==0) {
    	   System.out.println("Even:");
       }
       else{
    	   System.out.println("Odd:");
       }
    }
}
