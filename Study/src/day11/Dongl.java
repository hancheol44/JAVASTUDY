package day11;

public class Dongl extends Dohyung{
	
	int rad;
	double arround;
	
	
	public Dongl() {
		this(1);
	}
	
	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
		
	}
	
	// 원의둘레 계산해주는 함수
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	
	// 원의넓이 계산해주는 함수
	public void setArea() {
		area = rad * rad * 3.14;     // Dohyung 클래스를 상속받았기 때문에 area 변수 사용가능하다
	}
	
	// 출력함수 - Dohyung의 toPrint() Overriding
	public void toPrint() {
		System.out.printf("원의 반지름 : %3d\n원의 둘레 : %5.2f\n원의 넓이 : %5.2f\n",rad,arround,area);
	}
	
}
