package com.somniuss.classinclass.task7;

public class Main07 {

	public static void main(String[] args) {

		double radius = 2;

		Shape circle = new Shape() {

			@Override
			public double area() {
				return radius * radius * Math.PI;
			}

		};

		System.out.println("circle area with radius " + radius + " : " + circle.area());

	}

}
