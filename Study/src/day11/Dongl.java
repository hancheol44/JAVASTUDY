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
	
	// ���ǵѷ� ������ִ� �Լ�
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	
	// ���ǳ��� ������ִ� �Լ�
	public void setArea() {
		area = rad * rad * 3.14;     // Dohyung Ŭ������ ��ӹ޾ұ� ������ area ���� ��밡���ϴ�
	}
	
	// ����Լ� - Dohyung�� toPrint() Overriding
	public void toPrint() {
		System.out.printf("���� ������ : %3d\n���� �ѷ� : %5.2f\n���� ���� : %5.2f\n",rad,arround,area);
	}
	
}
