package com.kk.factory;

public class SimpleShapeFactory implements ShapeFactory {

	@Override
	public Shape createShape(String type) {
		if ("circle".equalsIgnoreCase(type)) {
			return new Circle();
		} else if ("rectangle".equalsIgnoreCase(type)) {
			return new Rectangle();
		} else {
			throw new IllegalArgumentException("Invalid shape type: " + type);
		}
	}
}
