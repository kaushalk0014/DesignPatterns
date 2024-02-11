package com.kk.factory;

public class TestFactory {
	public static void main(String[] args) {
		SimpleShapeFactory factory = new SimpleShapeFactory();
		Shape circle = factory.createShape("circle");
		circle.drow();

		Shape rectangle = factory.createShape("rectangle");
		rectangle.drow();
	}

}
