package day11;

public class Semo extends Dohyung{
	int line, high;
	
	public Semo() {
		this(2,2);
	}
	
	public Semo(int line, int high) {
		this.line = line;
		this.high = high;
		setArea();
		
	}
	
	public void setArea() {
		area = line * high * 0.5;
	}
	
	// 출력함수 - Dohyung의 toPrint() Overriding
	public void toPrint() {
		System.out.printf("삼각형의 밑변 : %3d\n삼각형의 높이 : %3d\n삼각형의 넓이 : %3d\n",line,high,(int)area);
	}
	
	
}
