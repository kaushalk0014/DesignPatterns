package com.kk.adaptepattern;

public class AdapterPatternTest {

	public static void main(String[] args) {
		// Creating an instance of LegacyRectangle
		LegacyRectangle legacyRectangle = new LegacyRectangle();
		// Creating an adapter to use LegacyRectangle as a Shape
		Shape rectangleAdapter = new RectangleAdapter(legacyRectangle);
		// Drawing the rectangle using the Shape interface
		rectangleAdapter.draw();
	}
}
