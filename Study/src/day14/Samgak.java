package day14;

import javax.swing.*;


public class Samgak {
	private int garo;
    private int sero;
	private double area;
	
	public Samgak(int garo, int sero) throws NumberFormatException {
		
		this.garo = garo;
		this.sero = sero;
		
		setArea();
		toString();
		
	}
	
	// 넓이 구하는 함수
	public void setArea() {
		area = garo * sero * 0.5;
	}
	
	public double getArea() {
		return area;
	}
	
	// 가로가 같으면 같은 삼각형이 되도록 
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Samgak s1 = (Samgak) obj;
		
		bool = (this.sero == s1.sero) ? true : false;
		
		return bool;
	}
	
	// toString() 오버라이드 ???
	public String toString() {
		String str = "이 삼각형은 밑변이 "+ garo + ", 높이가 "+sero+", 넓이가 "+area+"인 삼각형입니다.";
		
		return str;
	}
	
}
