package day17;

import java.util.*;
public class Semo implements Comparator{
	private int width, height;
	private double area;
	
	public Semo() {}
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public int compare(Object o1, Object o2) {
		
		Semo s1 = (Semo) o1;
		Semo s2 = (Semo) o2;
		
		int result = (int)(s1.getArea() - s2.getArea());
		
		return result;
	}

}
