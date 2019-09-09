package com.dev.lambda;

public class InterfaceLambdaImpl {

	public static void main(String[] args) {
		//		FunctionalInterfaceExample1 fun = () -> {
		//			System.out.println("Functional interface implementation using "
		//					+ "lambda expression....."); 
		//			System.out.println("statement 2");
		//		};
		//		fun.interfaceExample();


//		Runnable runnable = () -> {
//			System.out.println("This is the runnable inteface implementation using "
//					+ "lambda expression.....");
//		};
//		runnable.run();
		
		Runnable runnable = () -> {
			System.out.println("This is the runnable inteface implementation using "
					+ "lambda expression.....");
		};
		Thread t = new Thread(runnable);
		t.start();			// start() calls the run(). So indirectly, the implemented run() 
							// will be executed.....
	}
}