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
	// �����ε�
	  	0. ���� �̸��� �Լ��� Ŭ�������� ���� �ؾ� �Ѵ�.	
		1. �Լ��� �̸��� ���ƾ� �Ѵ�.
		2. �Ű����� ����Ʈ�� �޶�� �Ѵ�.
			==> ����, ����, Ÿ�� �� �ϳ� �̻��� �޶�� �Ѵ�.
			
		3. ��ȯ�� �������� ���� ����� ����.
			
	public int setArea(int garo, int sero) {
		
		return 0;
	}
*/	
	public void toPrint() {
		System.out.println("�غ� : "+garo+"  ���� : "+sero+"  ���� : "+area);
	}
}
