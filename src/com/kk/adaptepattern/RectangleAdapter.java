package com.kk.adaptepattern;

public class RectangleAdapter implements Shape {

	private LegacyRectangle legacyRectangle;

	public RectangleAdapter(LegacyRectangle legacyRectangle) {
		this.legacyRectangle = legacyRectangle;
	}

	@Override
	public void draw() {
		// Call the existing method to adapt it to the new interface
		legacyRectangle.drawRectangle();
	}
}
