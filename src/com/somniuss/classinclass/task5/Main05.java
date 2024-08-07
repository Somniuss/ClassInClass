package com.somniuss.classinclass.task5;

public class Main05 {

	public static void main(String[] args) {

		Greeting greeting = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("Hello, Java!");
			}

		};

		greeting.sayHello();

	}

}
