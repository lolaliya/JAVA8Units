package com.dev.methodreference;

public class Methodref {

	public static void main(String[] args) {
		Thread t = new Thread(PrinterMethodRef::threadStatus);
		t.start();

		Thread t1 = new Thread(new PrinterMethodRef()::show);
		t1.start();

		TesterMethodRef test = new PrinterMethodRef()::display;
		test.tester();

		AlphabetsInterface alphabets = Alphabets::new;
		alphabets.alphabets("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
	}
}

/*
 * Line number 12 
 * This line is equivalent to the code
 * 
 * tester(){
 * Printer p = new Printer();
 * p.display();
 * {
 * 
 * The implementation that was to be given in other class by implementing the Tester 
 * functional interface, or by writing a lambda expression, is replaced by the line number 12
 * 
 *  Here we are giving the implementation of display() of Printer class and passing 
 *  the same to the tester() as implementation
 */

