package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable{
	
	// 필드
    private double width;
    private double height;
    
    // 생성자
    public Rectangle(double width, double height) {
    	this.width = width;
    	this.height = height;
    }

	@Override
	public void resize(double s) {
		width = width *s;
		height = height *s;
		
	}

	@Override
	public double getArea() {
		
		return width * height;
	}

	@Override
	public double getPerimeter() {
		
		return (width + height) * 2.0;
	}
    

}