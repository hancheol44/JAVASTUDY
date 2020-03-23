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
	
	// ����Լ� - Dohyung�� toPrint() Overriding
	public void toPrint() {
		System.out.printf("�ﰢ���� �غ� : %3d\n�ﰢ���� ���� : %3d\n�ﰢ���� ���� : %3d\n",line,high,(int)area);
	}
	
	
}
