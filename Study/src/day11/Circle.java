package day11;
/*
	 
	 ���� 1 ]
	 	�� Ŭ������ ���� ������ ������ Ŭ�����̴�.
	 	�� Ŭ������ ��ü�� �ɶ� �������� �Է¹޾Ƽ� ���� ���� ������ 
	 	�Է��� �ǰ� Ŭ������ ���� �ϼ���.
	 	
		�������� �Է��� �� �� ���� 10���� �Էµǰ� �ϼ���.   
 */
public class Circle {
	// �� Ŭ������ ���� ���� ������ ����ϴ� Ŭ�����̹Ƿ� 
	// ������, �ѷ�, ���̸� ����ϸ� �� ���̴�.
	
	int banji;
	
	double arround, area;
	
	
	// �⺻�������Լ�
	public Circle() {
		this(10);   // �Է��� ���� ���� ��� 10���� 
	}
	
	
// ������ �Լ� �����ε�
public Circle(int banji) {
	this.banji = banji;
	this.arround = setArround(banji);
	this.area = setArea(banji);
}


// ���� �ѷ��� ���ϴ� �Լ�
public double setArround(int banji) {
	return 2 * banji * 3.14;

}


// ���� ���̸� ���ϴ� �Լ�

public double setArea(int banji) {
	return banji * banji * 3.14;
}
	
public void toPrint() {
	System.out.printf("������ : %5d | ���ǵѷ� : %7.2f | ���� ���� : %7.2f\n",banji,arround,area);
}
	
	
	
}
