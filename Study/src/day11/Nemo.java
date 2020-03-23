package day11;

public class Nemo extends Dohyung{
	int garo, sero;
	
	// this 함수로 default값 설정 
	public Nemo() {
		this(1,1);
	}
	
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		
	}
	// 사각형의 넓이 구하는 함수
	public void setArea() {
		area = garo * sero;
	}
	
	// 출력함수 - Dohyung의 toPrint() Overriding
	public void toPrint() {
		System.out.printf("사각형의 가로 : %3d\n사각형의 세로 : %3d\n사각형의 넓이 : %4d\n",garo,sero,(int)area);
	}
	
}
