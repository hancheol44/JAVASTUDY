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
	// �������̵�
	// ���ΰ� ������ ���� �簢���� �ǵ���
	
	public boolean equals(Object obj) {
		boolean bool = false;
		
		Sagak s1 = (Sagak) obj;
		
		bool = (this.sero == s1.sero) ? true : false;
		
		return bool;
	}

}
