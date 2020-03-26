package day12.Ex03;

public class Semo extends Figure {
	int garo,sero;
	double area;
	
	public Semo() {}
	
	public Semo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		toPrint();
	}
	
	public void setArea() {
		area = garo * sero * 0.5;
	}
/*	
	// 오버로딩
	  	0. 같은 이름의 함수가 클래스내에 존재 해야 한다.	
		1. 함수의 이름은 같아야 한다.
		2. 매개변수 리스트는 달라야 한다.
			==> 개수, 순서, 타입 중 하나 이상이 달라야 한다.
			
		3. 반환값 유형과는 전혀 상관이 없다.
			
	public int setArea(int garo, int sero) {
		
		return 0;
	}
*/	
	public void toPrint() {
		System.out.println("밑변 : "+garo+"  높이 : "+sero+"  넓이 : "+area);
	}
}
