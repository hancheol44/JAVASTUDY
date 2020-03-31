package extra;

import day14.Samgak;

public class Sagak {
	private int garo,sero,area;
	
	public Sagak() {}
	public Sagak(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void setArea() {
		this.area = garo * sero;
	}
	// 오버라이드
	// 가로가 같으면 같은 사각형이 되도록
	
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Sagak s1 = (Sagak) obj;
		
		bool = (this.sero == s1.sero) ? true : false;
		
		return bool;
	}

}
