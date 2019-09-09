package com.dev.lambda;

public class FunctionalInterfaceExample2 implements FunctionalInterfaceExample1{

	@Override
	public void interfaceExample() {
		System.out.println("This is a functional interface example.....");		
	}
	public static void main(String[] args) {
		FunctionalInterfaceExample1 interfaceExapmle = new FunctionalInterfaceExample2();
		interfaceExapmle.interfaceExample();
	}
}
