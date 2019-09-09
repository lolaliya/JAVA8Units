package com.dev.juint;

public class MathOp {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		if(a>b) return a-b;
		else return b-a;
	}
	

	public int mult(int a, int b) {
		return a*b;
	}

	public int div(int a, int b) {
		if(b==0) {
			System.out.println("error");
			return 0;
		}else {
			return a/b;
		}
	}
}
