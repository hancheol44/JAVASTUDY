package day11;

public class Nemo extends Dohyung{
	int garo, sero;
	
	// this �Լ��� default�� ���� 
	public Nemo() {
		this(1,1);
	}
	
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		
	}
	// �簢���� ���� ���ϴ� �Լ�
	public void setArea() {
		area = garo * sero;
	}
	
	// ����Լ� - Dohyung�� toPrint() Overriding
	public void toPrint() {
		System.out.printf("�簢���� ���� : %3d\n�簢���� ���� : %3d\n�簢���� ���� : %4d\n",garo,sero,(int)area);
	}
	
}
