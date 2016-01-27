package org.learn;

public class Line implements Shape
{
	private Point pointA;
	private Point pointB;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public void draw()
	{
		System.out.println("Drawing a line from point A :: "+pointA+" to point B :: "+pointB); 
	}

}
