package org.learn;

import java.util.List;

public class Square implements Shape
{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	List<Integer> distances;
 	
	public List<Integer> getDistances() {
		return distances;
	}

	public void setDistances(List<Integer> distnces) {
		this.distances = distnces;
	} 

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

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public void draw()
	{
		System.out.println("Drawing Points of a square. A :: "+pointA+" B :: "+pointB+" C ::"+pointC+" D :: "+pointD); 
	}
	
	public void writeDistances()
	{
		for(Integer i : distances)
		{
			System.out.println("Distance :: "+i); 
		}
	} 
}
