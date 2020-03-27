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
	
	// ���� ���ϴ� �Լ�
	public void setArea() {
		area = garo * sero * 0.5;
	}
	
	public double getArea() {
		return area;
	}
	
	// ���ΰ� ������ ���� �ﰢ���� �ǵ��� 
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Samgak s1 = (Samgak) obj;
		
		bool = (this.sero == s1.sero) ? true : false;
		
		return bool;
	}
	
	// toString() �������̵� ???
	public String toString() {
		String str = "�� �ﰢ���� �غ��� "+ garo + ", ���̰� "+sero+", ���̰� "+area+"�� �ﰢ���Դϴ�.";
		
		return str;
	}
	
}
