package test;

public class Semo extends Figure {
	int garo, sero;    // �������� ������ �� VOŬ���������ϰ�
					   // ���������� ���������ڸ� �������� ���ִ� ���� ������??
	
	
	
	
					// ������ �Լ��� ���� �ʿ��� ������ �ʱ�ȭ �ǰ� �ϼ���.
	public Semo() {
		this.garo = garo;
		this.sero = sero;
		area();
	}
	
	public float area(int garo, int sero) {
		area = (float)(garo * sero);
		return area;
	}
	
	
	public void toPrint() {
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		Semo t = new Semo();
		t.area(3,4);
		t.toPrint();
		
		System.out.println("-------------------");
		
		t.area();
		t.toPrint();
		
		System.out.println("-----------------");
		Semo t1 = new Semo();
		t1.area();
		t1.toPrint();
	}
}
